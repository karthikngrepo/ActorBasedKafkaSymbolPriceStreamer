FROM ubuntu:16.04

RUN apt-get update
RUN apt-get install -qy python3
RUN apt-get install -y python3-pip
RUN apt-get install -y git
RUN apt-get install -y libssl-dev
RUN apt-get install -y python-dev
#RUN pip3 install scrapy

WORKDIR /usr/src/app

RUN git clone https://github.com/karthikngrepo/ActorBasedKafkaSymbolPriceStreamer.git
WORKDIR /usr/src/app/ActorBasedKafkaSymbolPriceStreamer/scripts/SymbolPriceScraper

#This will not be needed once this is moved to git
COPY requirements.txt ./
RUN pip3 install --no-cache-dir -r requirements.txt

RUN ls -lrt
COPY . .

CMD [ "python3", "./symbol_price_scraper/symbol_price_scraper/spiders/quotes_spider.py" ]


