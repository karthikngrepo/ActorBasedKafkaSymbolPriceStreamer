package dev.ng.marketpricestore.commons

object Constants {
  //Kafka Config
  val brokers = "localhost:9092,localhost:9093,localhost:9094"
  val groupId = "gold-price-consumer-group"
  val topic = "gold-price-topic"

  //No Event Sleep delay
  val NoEventDelay = 2000
}
