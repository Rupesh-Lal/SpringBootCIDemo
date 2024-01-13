FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /temp
EXPOSE 8080
ADD target/spring-boot-ci-demo.jar spring-boot-ci-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-ci-demo.jar"]
