package dev.ng.marketpricestore

import java.util
import java.util.Properties

import dev.ng.marketpricestore.commons.Constants._
import org.apache.kafka.clients.consumer.KafkaConsumer

object TestKafkaConsumer {

  def main(args: Array[String]): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("group.id", "group-test1")
    props.put("enable.auto.commit", "false")
    props.put("auto.commit.interval.ms", "1000")
    props.put("session.timeout.ms", "30000")
    props.put("auto.offset.reset", "latest")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    val consumer = new KafkaConsumer[String, String](props)
    consumer.subscribe(util.Arrays.asList(topic))
    System.out.println("Subscribed to topic " + topic)
    while(true) {
      val records = consumer.poll(100)
      import scala.collection.JavaConversions._
      for (record <- records) {
        println(s"***********************************************************************************************************************")
        println(s"***********************************************offset = ${record.offset}, key = ${record.key}, value = ${record.value}")
        println(s"***********************************************************************************************************************")
        consumer.commitSync()
      }
    }
  }
}
