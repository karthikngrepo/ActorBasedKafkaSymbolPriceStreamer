package dev.ng.marketpricestore.commons

import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice._
import dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol._

object SymbolToCollectionUtil {
  def getCollection(symbol: Symbol): String = {
    symbol match {
      case Gold =>
        "goldprices"
      case Silver =>
        "silverprices"
      case Platinum =>
        "platinumprices"
      case anyUnhandledSymbol =>
        ""
    }
  }
}
