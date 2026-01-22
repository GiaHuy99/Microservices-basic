# Spring Boot Microservices Project

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-brightgreen)](https://spring.io/projects/spring-boot)
[![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-Gateway-green)](https://spring.io/projects/spring-cloud-gateway)
[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-Multi--Module-orange)](https://maven.apache.org/)

A **multi-module Maven project** demonstrating microservices architecture with Spring Boot 3.x and Spring Cloud.

This project implements a typical microservices pattern with:
- **API Gateway**: Single entry point for all client requests.
- **Department Service**: Manages department data (MySQL).
- **Employee Service**: Manages employee data and communicates with Department Service (MySQL).

## 🏗 Architecture Overview

The system uses **Spring Cloud Gateway (WebFlux)** to route requests to backend services.

graph LR
    Client[Client / Postman] -->|Port 8080| Gateway[API Gateway]
    Gateway -->|/api/departments| Dept[Department Service :8081]
    Gateway -->|/api/employees| Emp[Employee Service :8082]
    Emp -.->|RestTemplate| Dept

📂 Project Structure (Multi-Module)
GateWay: Spring Cloud Gateway (Netty Server)

department-service: REST API for Departments

employee-service: REST API for Employees

## Database Setup

Create two databases ( Docker)

