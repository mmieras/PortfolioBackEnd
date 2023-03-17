FROM amazoncorretto:17
MAINTAINER mmieras
COPY target/mmieras-0.0.1-SNAPSHOT.jar mmieras-app.jar
ENTRYPOINT ["java","-jar","/mmieras-app.jar"]