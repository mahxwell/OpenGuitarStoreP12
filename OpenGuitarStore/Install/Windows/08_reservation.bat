cd ..\dev

docker build -t mahxwell/reservation microservices/04_reservation

docker-compose -p guitarstoredb up -d reservation
