#---Without Layer approach
#FROM openjdk:8-jdk-alpine
#ADD target/docker.employee.app-0.0.1-SNAPSHOT.jar docker.employee.app-0.0.1-SNAPSHOT.jar
#EXPOSE 2021
#ENTRYPOINT ["java","-jar","docker.employee.app-0.0.1-SNAPSHOT.jar"]

#---With Layer approach
FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 2021
ENTRYPOINT ["java","-cp","app:app/lib/*","com.app.bak.DockerEmployeeApplication"]