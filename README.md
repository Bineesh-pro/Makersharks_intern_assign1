# MakerSharks spring-boot-assessment



## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## Rest end-points:


### Register-user:

GET http://localhost:8080/api/user/fetch?mail=bineesh@gmail.com

Authorization: Basic makersharks@gmail.com makersharks@2025




### Fetch-user

POST localhost:8080/api/user/register

Content-Type: application/json

{
"userId": 0,
"userName": "Bineesh",
"userEmail": "bineesh@gmail.com",
"userPassword": "bineesh@2025",
"userRoles": "USER"
}