# Multi-stage Dockerfile for agreementService (library that generates code + jar)
# Builder stage: Gradle + JDK 21
FROM gradle:8.6-jdk21 AS builder
WORKDIR /home/gradle/project
COPY . .
WORKDIR /home/gradle/project/agreementService
RUN ./gradlew clean bootJar -x test --no-daemon || true
# Some projects may be libraries without bootJar; copy any produced jars

# Runtime stage
FROM eclipse-temurin:21-jre
# Try to copy a bootJar if present, otherwise copy any jar from libs
COPY --from=builder /home/gradle/project/agreementService/build/libs/*.jar /app/agreement-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/agreement-service.jar"]
