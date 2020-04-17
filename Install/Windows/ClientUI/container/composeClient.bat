docker build -t  clientimg .

docker run --name clientui -d -p 8080:80 clientimg