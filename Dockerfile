# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the container
COPY target/mail-sender-app-0.0.1-SNAPSHOT.jar /app/mail-sender-app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "mail-sender-app.jar"]

# Expose the port the app runs on
EXPOSE 8080
