cd ..\dev

docker build -t mahxwell/review microservices/05_review

docker-compose -p guitarstoredb up -d review
