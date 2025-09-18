
FROM openjdk:17

MAINTAINER Ashok <ashok@oracle.com>

# Copy the real JAR file and rename it to app.jar
COPY target/Z_Hard-0.0.1-SNAPSHOT.jar /usr/app/app.jar

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
