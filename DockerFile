FROM openjdk:8
VOLUME /tmp
EXPOSE 8090
ADD /target/spring-boot-project-0.0.1-SNAPSHOT.jar spring-boot-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "spring-boot-project-0.0.1-SNAPSHOT.jar"]