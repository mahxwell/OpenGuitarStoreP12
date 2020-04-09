cd ..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/springconfig servers/01_springconfig

docker-compose -p guitarstoredb up -d springconfig
