# Spring Boot Microservices Project

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-Multi--Module-orange)](https://maven.apache.org/)

A simple **multi-module Maven project** demonstrating microservices architecture with Spring Boot 4.0.0.  
Includes two independent services: **Department Service** and **Employee Service**, each with its own MySQL database and REST communication.

Perfect for learning microservices principles: loose coupling, separate databases, synchronous REST calls (RestTemplate).

## Architecture Overview
The Employee Service calls the Department Service via REST to enrich data 

## Project Structure (Multi-Module Maven)

microservices-basic/
├── pom.xml                  # Parent POM (inherits Spring Boot 4.0.0)
├── department-service/
│   ├── pom.xml
│   └── src/main/...
└── employee-service/
├── pom.xml
└── src/main/...

- Java 21 (or higher)
- Maven 3.8+
- MySQL (local or Docker)
- IDE (IntelliJ IDEA recommended for multi-module support)

## Database Setup

Create two databases ( Docker):
