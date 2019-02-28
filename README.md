# Concise-app

## Problems:
1. Did not have time nor experience to do the Jersey endpoints part (4. and 5.)
2. This project uses port 8080 for the application, because the other port was already in use

## How to run the program:
1. docker pull postgres:9.6
2. docker run --rm -e POSTGRES_PASSWORD=docker -d -p 127.0.0.1:5432:5432 postgres:9.6
3. make sure java and maven are installed
4. download and extract the repository files
5. in the project folder's command line, use: "mvn spring-boot:run" to run the program
6. to create an executable jar, use: "mvn package" in the project folder's command line
