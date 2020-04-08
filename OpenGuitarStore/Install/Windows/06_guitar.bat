cd ..\dev

docker build -t mahxwell/guitar microservices/02_guitar

docker-compose -p guitarstoredb up -d guitar
