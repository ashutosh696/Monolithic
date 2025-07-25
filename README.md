Endpoints:
http://localhost:8081/Patient/getAll
http://localhost:8081/Services/getAll
http://localhost:8081/Services/kafka/publish PUT: BODY: TEXT: "Hello kafka"

------------------------------------------------------------------------------------------------------------------
APACHE KAFKA Config:

Generate Cluster UUID:

bin\windows\kafka-storage.bat random-uuid

MxD6UXUdQxOF71PLwU-AEg
--------------------------------------------------------------------------------------------
Format logs:
bin\windows\kafka-storage.bat format -t <your-uuid> -c config\kraft\server.properties
Replace <your-uuid> with the generated one.
bin\windows\kafka-storage.bat format -t MxD6UXUdQxOF71PLwU-AEg -c config\kraft\server.properties
-------------------------------------------------------------------------------------------

Start Kafka Broker
bin\windows\kafka-server-start.bat config\kraft\server.properties
-----------------------------------------------------------------------------
Apache Kafka 4.0.0 running locally on port 9092
-----------------------------------------------------------------------------------------------------
Create Kafka Topic (once only):
bin\windows\kafka-topics.bat --create --topic demo-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

--------------------------------------------------------------------------------------------------------------
RUN below command in CMD: 
D:\kafka_2.13-4.0.0
Start Kafka Broker:
bin\windows\kafka-server-start.bat config\kraft\server.properties

---------------------------------------------------------------------

H2 Console: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)

http://localhost:8081/Patient/add

{
"name": "Ashu",
"address": "Delhi",
"servicesList": [
{
"name": "X-ray",
"fees": 500
},
{
"name": "Scan",
"fees": 700
}
]
}

{
"name": "Neha",
"address": "New Delhi",
"servicesList": [
{
"name": "Injection",
"fees": 500
},
{
"name": "Test",
"fees": 700
}
]
}

http://localhost:8081/Patient/getAll
http://localhost:8081/Patient/getbyid/1
http://localhost:8081/Patient/update/1
http://localhost:8081/Patient/delete/1
----------------------------------------------
thymeleaf: http://localhost:8081/users
default page: http://localhost:8081/