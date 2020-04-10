cd ..\..\..\..\OpenGuitarStore\docker\dev\

docker container stop user
docker container stop order
docker container stop reservation
docker container stop review
docker container stop guitar
docker container stop springadmin
docker container stop zuul
docker container stop eureka
docker container stop springconfig
docker container stop guitarstore_db

docker container prune

docker rmi mahxwell/user
docker rmi mahxwell/order
docker rmi mahxwell/reservation
docker rmi mahxwell/review
docker rmi mahxwell/guitar
docker rmi mahxwell/springadmin
docker rmi mahxwell/zuul
docker rmi mahxwell/eurek
docker rmi mahxwell/springconfig