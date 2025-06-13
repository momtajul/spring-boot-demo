# Spring Data Redis Rest

### Maven Compiler
* mvnw package
* mvnw spring-boot:run

### Gradle Compiler
* gradlew build
* gradlew bootRun


### Student Resource
* curl http://localhost:8080/students
* curl http://localhost:8080/students/1
* curl -X POST -H "Content-Type: application/json" -d '{"id": "1", "name": "Student A", "grade": 1}' http://localhost:8080/students
### Customer Resource
* curl http://localhost:8080/customers
* curl http://localhost:8080/customers/1

### Book Resource

* curl http://localhost:8080/books
* curl http://localhost:8080/boos/2

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.0/reference/data/sql.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)