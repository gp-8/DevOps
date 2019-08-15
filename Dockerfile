FROM openjdk:latest
COPY ./target/Group8-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group8-0.1.0.2-jar-with-dependencies.jar"]