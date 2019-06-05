#!/usr/bin/python
import scrapy
from kafka import KafkaProducer
from scrapy.crawler import CrawlerProcess

import symbol_price_scraper.symbol_price_scraper.protobuf.symbolprice_pb2 as symbolprice_pb2


class QuotesSpider(scrapy.Spider):
    name = "quotes"
    start_urls = [
        'https://data-asg.goldprice.org/dbXRates/USD,INR',
    ]

    def parse(self, response):
        symbolprice = symbolprice_pb2.SymbolPrice()
        """TODO: Need to assign the extracted values"""
        symbolprice.price = ""
        symbolprice.symbol = symbolprice_pb2.SymbolPrice.Gold
        symbolprice.unit = "grams"
        symbolprice.time = ""

        producer = KafkaProducer(bootstrap_servers=['localhost:9092', 'localhost:9093', 'localhost:9094'])
        producer.send('gold-price-topic', value=symbolprice.SerializeToString())


process = CrawlerProcess({
    'USER_AGENT': 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)'
})

process.crawl(QuotesSpider)
process.start()
