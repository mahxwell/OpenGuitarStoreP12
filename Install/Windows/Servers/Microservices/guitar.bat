cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/guitar microservices/guitar/

docker-compose -p guitarstoredb up -d guitar
