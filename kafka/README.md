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