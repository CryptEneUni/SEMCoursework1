FROM amazoncorretto:17
COPY ./target/Main.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Main.jar"]