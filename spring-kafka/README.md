## Kafka Server Configuration
### Step 1: Generate a Cluster UUID
    kafka_home> bin\windows\kafka-storage.bat random-uuid
### Step 2: Format Log Directories
        kafka_home> bin\windows\kafka-storage.bat format --standalone -t <uudi> -c config/server.properties
### Step 3: Start the Kafka Server
    kafka_home> bin\windows\kafka-server-start.bat config\server.properties
### Step 4: Create a topic to store your events
    kafka_home> bin\windows\kafka-topics.bat --create --topic employees --bootstrap-server localhost:9092
### Step 5: Topic Information
    kafka_home> bin\windows\kafka-topics.bat --describe --topic employees --bootstrap-server localhost:9092
### Step 6: Write some events into the topic
    kafka_home> bin\windows\kafka-console-producer.bat --topic employees --bootstrap-server localhost:9092
### Step 7: Read the events
    kafka_home> bin\windows\kafka-console-consumer.bat --topic employees --from-beginning --bootstrap-server localhost:9092

## Kafka Application
    java -jar kafka-app.jar -Dspring.config.additional-location=application.yml

## Compiler
### Maven Compiler
#### Compile Project
    mvnw build
#### Run Project
    mvnw spring-boot:run

### Gradle Compiler
#### Compile Project
    gradlew build
#### Run Project
    gradlew bootRun

## Resources
#### Customer Resource
    curl http://localhost:8080/customers
    curl http://localhost:8080/customers/1
### Book Resource
    curl http://localhost:8080/books
    curl http://localhost:8080/boos/1

## Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.0/reference/data/sql.html#data.sql.jpa-and-spring-data)

## Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

