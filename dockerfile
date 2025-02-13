FROM openjdk:17-slim
MAINTAINER shvm.cloud
COPY target/LogServices-1.0-SNAPSHOT.jar LogServices-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/LogServices-1.0-SNAPSHOT.jar"]