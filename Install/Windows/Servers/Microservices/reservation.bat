cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/reservation microservices/reservation

docker-compose -p guitarstoredb up -d reservation