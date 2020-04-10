cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/user microservices/user

docker-compose -p guitarstoredb up -d user