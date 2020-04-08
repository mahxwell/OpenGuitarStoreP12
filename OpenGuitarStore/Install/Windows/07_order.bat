cd ..\dev

docker build -t mahxwell/order microservices/03_order

docker-compose -p guitarstoredb up -d order
