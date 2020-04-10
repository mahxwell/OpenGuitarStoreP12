cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/order microservices/order

docker-compose -p guitarstoredb up -d order
