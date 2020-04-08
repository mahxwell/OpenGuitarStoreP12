cd ..\dev

docker build -t mahxwell/user microservices/06_user

docker-compose -p guitarstoredb up -d user
