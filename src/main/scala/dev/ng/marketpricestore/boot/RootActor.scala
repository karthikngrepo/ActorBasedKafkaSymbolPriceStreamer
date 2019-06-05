package dev.ng.marketpricestore.boot

import akka.actor.{Actor, ActorLogging, OneForOneStrategy, Props, SupervisorStrategy}
import akka.routing.RoundRobinPool
import dev.ng.marketpricestore.core.{DBActor, Initialize, MessageConsumerActor}
import dev.ng.marketpricestore.commons.Constants._

object RootActor {
  def props: Props = Props(new RootActor)
}

class RootActor extends Actor with ActorLogging {

  val numberOfKafkaPartition = 1

  private val dbActorProps = DBActor.props.withRouter(RoundRobinPool(5, supervisorStrategy = OneForOneStrategy() {
    case e => SupervisorStrategy.Escalate
  }))
  private val dbActor = context.actorOf(dbActorProps, "dbActor")


  context.actorOf(MessageConsumerActor.props(brokers, groupId, topic, dbActor).
    withRouter(RoundRobinPool(numberOfKafkaPartition, supervisorStrategy = OneForOneStrategy() {
      case e => SupervisorStrategy.Escalate
    })), "messageConsumerActor")

  override def receive: Receive = {

    case unknownMsg =>
      log.error(s"Ignoring unknown message=$unknownMsg received by rootActor")
  }
}
