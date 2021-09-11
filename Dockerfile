FROM openjdk:8-jdk-alpine
ADD target/docker.employee.app-0.0.1-SNAPSHOT.jar docker.employee.app-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","docker.employee.app-0.0.1-SNAPSHOT.jar"]