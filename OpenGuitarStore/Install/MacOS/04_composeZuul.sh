#!/bin/bash

cd ../dev

docker build -t mahxwell/zuul servers/03_zuul

docker-compose -p guitarstoredb up -d zuul
