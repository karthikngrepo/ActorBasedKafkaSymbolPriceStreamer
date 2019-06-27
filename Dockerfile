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

COPY ./requirements.txt ./

RUN pip3 install --no-cache-dir -r requirements.txt

WORKDIR /usr/src/app/ActorBasedKafkaSymbolPriceStreamer/scripts/SymbolPriceScraper

COPY . .

CMD [ "python3", "." ]


