FROM openjdk:11.0.3
ADD ./target/spring-boot-neo4j-example-1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]