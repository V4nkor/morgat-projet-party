# Use an official Maven image to build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Run the ./mvnw spring-boot:run
CMD ["./mvnw", "spring-boot:run"]

#! The code below is commented out because the mvn clean install command does not properly create the .jar file

# Run the mvn clean install command
#RUN mvn clean install

# Use an official OpenJDK runtime as a parent image
#FROM openjdk:17-jdk-slim

# Set the working directory
#WORKDIR /app

# Copy the jar file from the build stage
#COPY --from=build /app/target/projectparty-0.0.1-SNAPSHOT.jar /app/projectparty.jar

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Run the application
#CMD ["java", "-jar", "projectparty.jar"]