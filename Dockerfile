FROM openjdk:8u131-jdk-alpine

MAINTAINER Angel GA "angel.g.alamilla@gmail.com"

EXPOSE 8080

ADD ./target/spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar apirest-1.jar

ENTRYPOINT ["java","-jar","apirest-1.jar"]
