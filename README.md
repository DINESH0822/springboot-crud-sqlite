# Spring Boot CRUD SQLite Project

A simple Spring Boot CRUD application using:

- Spring Boot
- Spring Data JPA
- SQLite Database
- HTML Form
- REST APIs

This project demonstrates:
- Employee registration
- Saving records into SQLite
- Fetching all employee records
- Basic full stack flow using Spring Boot

---

# Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA
- SQLite
- Maven
- HTML

---

# Project Structure

src/main/java
- Employee.java
- EmployeeController.java
- EmployeeRepository.java
- SpringboothibernateApplication.java

src/main/resources
- application.properties
- static/index.html

---

# Features

- Save employee details
- Fetch all employees
- SQLite database integration
- REST API endpoints
- HTML form integration

---

# API Endpoints

## Save Employee

GET

/employee/save?name=Samuel&salary=50000

---

## Fetch All Employees

GET

/employee/all

---

# SQLite Configuration

application.properties

```properties
server.port=8088

spring.datasource.url=jdbc:sqlite:employee.db
spring.datasource.driver-class-name=org.sqlite.JDBC

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.database-platform=org.hibernate.community.dialect.SQLiteDialect
