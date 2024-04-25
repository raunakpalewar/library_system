# Library Management System

A Spring Boot application for managing a book library, providing RESTful endpoints for CRUD operations on books, authors, and book rentals.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Library Management System is a Spring Boot application designed to facilitate the management of books, authors, and book rentals. It provides RESTful endpoints to perform CRUD operations on books and authors, as well as create and retrieve book rental records. The application also includes business logic to ensure that books are not rented out multiple times and to check for overdue rentals.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL/MongoDB (choose one)
- Swagger UI
- JUnit (for testing)

## Features

- CRUD operations for books and authors
- Create and retrieve book rental records
- Business logic to prevent double renting and check for overdue rentals
- API documentation using Swagger UI
- Unit and integration testing

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven (if using Maven for dependency management)
- MySQL/MongoDB database installed and running

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/raunakpalewar/library_system.git
   ```

2. Navigate to the project directory:

   ```bash
   cd library-management-system
   ```

### Running the Application

1. Configure your database connection properties in the `application.properties` file.
2. Build the application:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   java -jar target/library-management-system.jar
   ```

## Usage

Once the application is running, you can access the Swagger UI documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to explore and test the available endpoints.

## API Documentation

The API documentation is generated using Swagger UI and is accessible at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) when the application is running.

## Testing

Unit tests are included to verify core business logic and RESTful endpoints. You can run the tests using:

```bash
mvn test
```

Integration tests can also be added to ensure that the endpoints work as expected with the database.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests with your improvements.

## License

This project is licensed under the [MIT License](LICENSE).
