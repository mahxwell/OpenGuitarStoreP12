cd ..\..\..\..\OpenGuitarStore\docker\dev\


docker container stop springadmin
docker container stop zuul
docker container stop eureka
docker container stop springconfig
docker container stop guitarstore_db
docker container prune
docker rmi mahxwell/springadmin:latest
docker rmi mahxwell/zuul:latest
docker rmi mahxwell/eureka:latest
docker rmi mahxwell/springconfig:latest
docker rmi java:8-jre-alpine
docker rmi postgres:10.3-alpine