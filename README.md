# QueryDSL CRUD Application Demo

This project demonstrates how to integrate QueryDSL with Spring Boot for implementing CRUD (Create, Read, Update, Delete) operations on a database.

## Overview

QueryDSL is a framework that provides a type-safe way to construct SQL-like queries in Java. In this demo, we'll showcase how to use QueryDSL with Spring Boot to perform CRUD operations on a database.

## Features

- Integration of QueryDSL with Spring Boot for database operations
- Implementation of CRUD functionality using QueryDSL
- Demonstration of how to define and use QueryDSL predicates for dynamic filtering

## Project Structure

- `src/main/java`: Contains the Java source code for the Spring Boot application.
- `src/main/resources`: Contains configuration files and static resources.
- `pom.xml`: Maven project configuration file.

## Usage

1. Clone the repository:

```bash
git clone https://github.com/iammahesh123/spring-cloud-task-demo.git
```
2. Navigate to the project directory:
 ```bash
  cd spring-security-csrf-demo
 ```
3. Build the project using Maven:
 ```bash
mvn clean package
 ```
4. Run the application:
```bash
mvn run
 ```
5. Access the application in your web browser: http://localhost:8080
6. Perform CRUD operations on the database entities and observe the results.
## Configuration
- application.properties: Contains database connection and other application-specific configurations.
- pom.xml: Includes QueryDSL and other required dependencies.
## Dependencies
- Java 8 or higher
- Spring Boot
- QueryDSL
- Spring Data JPA
## Contributing
Contributions are welcome. Please fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the MIT License.
