package dev.ng.marketpricestore

import java.time.format.DateTimeFormatter
import java.time.{LocalDateTime, ZoneId}
import java.util.{Date, Properties}

import dev.ng.marketpricestore.commons.{CustomSerializer}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer
import dev.ng.marketpricestore.commons.Constants._
import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice

object TestKafkaProducer extends App {


  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094")
  props.put("acks", "all") //Set acknowledgements for producer requests.
  props.put("retries", 0) //If the request fails, the producer can automatically retry,
  props.put("batch.size", 16384) //Specify buffer size in config
  props.put("linger.ms", 1) //Reduce the no of requests less than 0
  props.put("buffer.memory", 33554432) //The buffer.memory controls the total amount of memory available to the producer for buffering.
  props.put("key.serializer", classOf[StringSerializer])
  props.put("value.serializer", classOf[CustomSerializer])
  val producer = new KafkaProducer[String, SymbolPrice](props)

  val symbolPrice = SymbolPrice.newBuilder()
    .setPrice("10.99")
      .setSymbol(SymbolPrice.Symbol.Silver)
      .setTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME))
      .setUnit("grams")
      .build()


  producer.send(new ProducerRecord[String, SymbolPrice](topic, symbolPrice))
  println("Message sent successfully")
  producer.close()
}