package dev.ng.marketpricestore.boot

import akka.actor.ActorSystem

object MarketPriceStoreBoot extends App {

    val system = ActorSystem("marketPriceStoreActorSystem")
    system.actorOf(RootActor.props, "root-actor")

    // attach shutdown handler to catch control-c
    Runtime.getRuntime.addShutdownHook(new Thread("streams-shutdown-hook"))

}
