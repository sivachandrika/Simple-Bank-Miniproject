# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/bank-app-1.0-SNAPSHOT.jar bank-app.jar

# Expose port 3000 to access app
EXPOSE 3000

# Command to run the application
CMD ["java", "-jar", "bank-app.jar"]

