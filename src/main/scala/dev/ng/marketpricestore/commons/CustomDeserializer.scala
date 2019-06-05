package dev.ng.marketpricestore.commons

import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice
import org.apache.kafka.common.serialization.Deserializer


class CustomDeserializer extends Deserializer[SymbolPrice]{


  override def deserialize(topic:String,bytes: Array[Byte]): SymbolPrice = {
    SymbolPrice.parseFrom(bytes)
  }

  override def close():Unit = {

  }

  override def configure(configs: java.util.Map[String, _], isKey: Boolean): Unit = {

  }
}