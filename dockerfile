# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from your host to the container
COPY build/libs/springboot-0.0.1-SNAPSHOT.jar  .

# Command to run when the container starts
CMD ["java", "-jar", "springboot-0.0.1-SNAPSHOT.jar"]
