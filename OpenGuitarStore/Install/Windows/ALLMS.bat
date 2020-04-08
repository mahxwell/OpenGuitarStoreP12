cd ..\dev

docker build -t mahxwell/guitar microservices/02_guitar

docker-compose -p guitarstoredb up -d guitar


docker build -t mahxwell/order microservices/03_order

docker-compose -p guitarstoredb up -d order


docker build -t mahxwell/reservation microservices/04_reservation

docker-compose -p guitarstoredb up -d reservation


docker build -t mahxwell/review microservices/05_review

docker-compose -p guitarstoredb up -d review


docker build -t mahxwell/user microservices/06_user

docker-compose -p guitarstoredb up -d user
