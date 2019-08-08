FROM openjdk:latest
COPY ./target/classes/DevOps_Group_8 /tmp/DevOps_Group_8
WORKDIR /tmp
ENTRYPOINT ["java", "DevOps_Group_8.App"]