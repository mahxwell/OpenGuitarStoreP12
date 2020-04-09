cd ..\..\..\OpenGuitarStore\docker\dev\

docker build -t mahxwell/batch batch/


docker-compose -p guitarstoredb up -d batch
