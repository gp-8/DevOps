FROM openjdk:latest
COPY ./target/Group8-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group8-1.0-SNAPSHOT-jar-with-dependencies.jar"]