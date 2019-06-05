package dev.ng.marketpricestore.core

import java.time.Duration
import java.util.Properties

import akka.actor.{ActorRef, FSM, Props}
import dev.ng.marketpricestore.commons.{Constants, CustomDeserializer}
import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer

import scala.collection.JavaConversions._


object MessageConsumerActor {

  private def createConsumerConfig(brokers: String, groupId: String) = {
    val props = new Properties
    props.put("bootstrap.servers", brokers)
    props.put("group.id", groupId)
    props.put("enable.auto.commit", "false")
    props.put("auto.commit.interval.ms", "1000")
    props.put("session.timeout.ms", "30000")
    props.put("auto.offset.reset", "latest")
    props.put("key.deserializer", classOf[StringDeserializer])
    props.put("value.deserializer", classOf[CustomDeserializer])
    props
  }

  def props(brokers: String, groupId: String, topic: String, dbActor: ActorRef): Props =
    Props(new MessageConsumerActor(brokers, groupId, topic, dbActor))

}

sealed trait State
case object Disconnected extends State
sealed trait Active extends State
case object Configured extends Active
case object Subscribed extends Active
case object Ready extends Active
case object Await extends Active

sealed trait Event
case object Initialize extends Event
case object Subscribe extends Event
case object Poll extends Event
case object Success extends Event
case object Failure extends Event

sealed trait Data
case object Uninitialized extends Data
case class Configuration(prop: Properties) extends Data
case class ConsumerDetails(consumer: KafkaConsumer[String, SymbolPrice]) extends Data

class MessageConsumerActor(brokers: String,
                           groupId: String,
                           topic: String,
                           dbActor: ActorRef
                          ) extends FSM[State, Data] {

  startWith(Disconnected, Uninitialized)

  override def preStart(): Unit = {
    log.info(s"Starting actor=$self")
    self ! Initialize
  }

  when(Disconnected) {
    case Event(Initialize, Uninitialized) =>
      val prop: Properties = MessageConsumerActor.createConsumerConfig(brokers, groupId)
      self ! Subscribe
      goto(Configured) using Configuration(prop)
  }

  when(Configured) {
    case Event(Subscribe, conf: Configuration) =>
      val consumer = new KafkaConsumer[String, SymbolPrice](conf.prop)
      consumer.subscribe(List(topic))
      self ! Poll
      goto(Ready) using ConsumerDetails(consumer)
  }

  when(Ready) {
    case Event(Poll, msgConsumer: ConsumerDetails) =>
      val consumer = msgConsumer.consumer
      val record = consumer.poll(Duration.ofMillis(100))
      log.info(s"Record=$record read from the kafka")
      if(record.nonEmpty) {
        record.foreach(rec => dbActor ! InsertNewPrice(rec.value())) //We read only one msg at a time
        goto(Await) using msgConsumer
      } else {
        self ! Poll
        stay
      }
  }

  when(Await) {
    case Event(Success, msgConsumer: ConsumerDetails) =>
      msgConsumer.consumer.commitSync()
      self ! Poll
      goto(Ready) using msgConsumer

    case Event(Failure | StateTimeout, msgConsumer: ConsumerDetails) =>
      self ! Poll
      goto(Ready) using msgConsumer

  }

  whenUnhandled {
    case Event(anyEvent, anyData) =>
      log.error(s"Received unknown message $anyEvent, $anyData")
      stay
  }

  initialize()
}