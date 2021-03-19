FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/spring-jenkins-docker spring-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-docker.jar"]
