# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.sprint-roach-demo' is invalid and this project uses 'com.example.sprintroachdemo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Run these command in three powershell
    docker-compose -f cockroach-deployment.yaml up -d cockroach1
    docker-compose -f cockroach-deployment.yaml up -d cockroach2
    docker-compose -f cockroach-deployment.yaml up -d cockroach3

### Once done run the below, commands
    CREATE DATABASE CHANDRA_DB;
    CREATE USER CHANDRA; 
    GRANT ALL ON DATABASE CHANDRA_DB TO CHANDRA;

## From DBeaver can open the GUI
    url: jdbc:postgresql://localhost:26258/chandra_db
    username: chandra
    password:
