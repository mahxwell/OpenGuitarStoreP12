cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/review microservices/review

docker-compose -p guitarstoredb up -d review