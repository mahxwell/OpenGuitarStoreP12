#!/bin/bash

cd ../dev

docker build -t mahxwell/eureka servers/02_eureka

docker-compose -p guitarstoredb up -d eureka
