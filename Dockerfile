FROM openjdk
COPY target/spring-boot-k8.jar spring-boot-k8.jar
ENTRYPOINT ["java","-jar","/spring-boot-k8.jar"]