package dev.ng.marketpricestore.core

import java.util.Date

import akka.actor.{Actor, ActorLogging, Props}
import dev.ng.marketpricestore.commons.SymbolToCollectionUtil
import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice
import org.mongodb.scala.bson.collection.mutable.Document
import org.mongodb.scala.{Completed, MongoClient, MongoCollection, MongoDatabase, Observable, Observer}


case class InsertNewPrice(symbolPrice: SymbolPrice)

object DBActor {

  val mongoClient = MongoClient("mongodb://localhost:27017");
  val database: MongoDatabase = mongoClient.getDatabase("marketPriceStore")

  def getCollection(name: String): MongoCollection[Document] = {
    database.getCollection(name)
  }

  def props: Props = Props(new DBActor())
}

class DBActor extends Actor with ActorLogging {

  import SymbolPrice._

  override def preStart(): Unit = {
    log.info(s"DBActor=$self start!")
  }

  override def receive: Receive = {

    case InsertNewPrice(data) =>
      data.getSymbol match {
        case symbol: Symbol =>
          log.info(s"Updating the data=$data in database")
          val document: Document = Document("price" -> data.getPrice, "priceTime" -> data.getTime, "unit" -> data.getUnit)
          val insertObservable: Observable[Completed] =
            DBActor.getCollection(SymbolToCollectionUtil.getCollection(symbol)).insertOne(document)
          insertObservable.subscribe(new Observer[Completed] {
            override def onNext(result: Completed): Unit = {
              log.info(s"result=$result")
            }
            override def onError(e: Throwable): Unit = {
              log.error(s"Error while inserting the gold price {}", e)
              sender ! Failure
            }
            override def onComplete(): Unit = {
              log.info(s"Successfully inserted the gold price=$data")
              sender ! Success
            }
          })

        case anyOtherSymbol =>
          log.error(s"Received unhandled symbol=$anyOtherSymbol")
      }

    case anyOtherState =>
      log.error(s"Received unknown data=$anyOtherState")
      sender ! Failure
  }

}
