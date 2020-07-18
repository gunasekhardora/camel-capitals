FROM adoptopenjdk/openjdk11:jdk-11.0.6_10-debian

MAINTAINER Guna Sekhar Dora Kovvuru

ADD target/capitals-0.0.1-SNAPSHOT.jar /capitals/capitals.jar

EXPOSE 8080

CMD ["java", "-jar", "/capitals/capitals.jar"]
