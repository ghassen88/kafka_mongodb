FROM  openjdk:11
EXPOSE 9999
ADD target/kafkamongodb.jar kafkamongodb.jar
ENTRYPOINT ["java","-jar","/kafkamongodb.jar"]