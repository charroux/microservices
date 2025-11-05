# Multi-stage Dockerfile for agreementServiceServer
# Builder stage: use the official Gradle image with JDK 21
FROM gradle:8.6-jdk21 AS builder
WORKDIR /home/gradle/project
COPY . .
WORKDIR /home/gradle/project/agreementServiceServer
# Build the Spring Boot jar
RUN ./gradlew clean bootJar -x test --no-daemon

# Runtime stage
FROM eclipse-temurin:21-jre
COPY --from=builder /home/gradle/project/agreementServiceServer/build/libs/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
