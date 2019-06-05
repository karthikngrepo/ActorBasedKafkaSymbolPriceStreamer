package dev.ng.marketpricestore.commons

import com.fasterxml.jackson.databind.ObjectMapper
import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice
import org.apache.kafka.common.serialization.Serializer

class CustomSerializer extends Serializer[SymbolPrice] {

  override def configure(configs: java.util.Map[String, _], isKey: Boolean): Unit = {

  }


  override def serialize(topic: String, data: SymbolPrice): Array[Byte] = {
    data.toByteArray
  }

  override def close(): Unit = {
  }
}