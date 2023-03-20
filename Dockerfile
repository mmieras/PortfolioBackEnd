FROM amazoncorretto:17-alpine-jdk
MAINTAINER mmieras
COPY target/mmieras-0.0.1-SNAPSHOT.jar mmieras-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mmieras-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080