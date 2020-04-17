#!/bin/bash

cd ../../../OpenGuitarStore/docker/dev/ &&
docker-compose -p guitarstoredb up -d database && 
docker build -t mahxwell/eureka servers/02_eureka &&
docker-compose -p guitarstoredb up -d eureka &&
docker build -t mahxwell/guitar microservices/guitar &&
docker-compose -p guitarstoredb up -d guitar &&
docker build -t mahxwell/order microservices/order &&
docker-compose -p guitarstoredb up -d order &&
docker build -t mahxwell/reservation microservices/reservation&&
docker-compose -p guitarstoredb up -d reservation &&
docker build -t mahxwell/review microservices/review && 
docker-compose -p guitarstoredb up -d review && 
docker build -t mahxwell/user microservices/user && 
docker-compose -p guitarstoredb up -d user &&
docker build -t mahxwell/zuul servers/03_zuul &&
docker-compose -p guitarstoredb up -d zuul
