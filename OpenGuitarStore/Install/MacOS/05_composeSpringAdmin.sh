#!/bin/bash

cd ../dev

docker build -t mahxwell/springadmin servers/04_springadmin


docker-compose -p guitarstoredb up -d springadmin
