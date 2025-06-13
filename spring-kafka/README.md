# Spring Kafka Demo

### Kafka Quickstart
# Step 1: Generate a Cluster UUID
    kafka_home> bin\windows\kafka-storage.bat random-uuid
# Step 2: Format Log Directories
        kafka_home> bin\windows\kafka-storage.bat format --standalone -t z6vMit3sQYaVF-e3mE6SxA -c config/server.properties
# Step 3: Start the Kafka Server
    kafka_home> bin\windows\kafka-server-start.bat config\server.properties
# Step 4: Create a topic to store your events
    kafka_home> bin\windows\kafka-topics.bat --create --topic employees-events --bootstrap-server localhost:9092
# Step 5: Topic Information
    kafka_home> bin\windows\kafka-topics.bat --describe --topic employees-events --bootstrap-server localhost:9092
# Step 6: Write some events into the topic
    kafka_home> bin\windows\kafka-console-producer.bat --topic employees-events --bootstrap-server localhost:9092
# Step 7: Read the events
    kafka_home> bin\windows\kafka-console-consumer.bat --topic employees-events --from-beginning --bootstrap-server localhost:9092
### Maven Compiler
* mvnw build
* mvnw spring-boot:run

### Gradle Compiler
* gradlew build
* gradlew bootRun


### Customer Resource

* curl http://localhost:8080/customers
* curl http://localhost:8080/customers/1

### Book Resource

* curl http://localhost:8080/books
* curl http://localhost:8080/boos/1

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

