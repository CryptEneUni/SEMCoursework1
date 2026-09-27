FROM amazoncorretto:17
COPY java/target/Main.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Main.jar"]