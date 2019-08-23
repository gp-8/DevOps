FROM openjdk:latest
COPY ./target/Group8.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group8.jar", "db:3306"]