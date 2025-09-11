# Spring Boot REST API Development Made Simple

This project is a simple REST API for managing employees, built with Spring Boot.

## Project Structure

- `src/main/java/com/byteandbeyondwithuday/springbootrestapi/entity/Employee.java`: Entity class representing an employee.
- `src/main/java/com/byteandbeyondwithuday/springbootrestapi/service/EmployeeService.java`: Interface for employee service.
- `src/main/java/com/byteandbeyondwithuday/springbootrestapi/service/EmployeeServiceImpl.java`: Implementation of the employee service.
- `src/main/java/com/byteandbeyondwithuday/springbootrestapi/controller/EmployeeController.java`: REST controller for handling employee-related requests.
- `src/test/java/com/byteandbeyondwithuday/springbootrestapi/SpringBootRestApiDevelopmentMadeSimpleApplicationTests.java`: Test class for the application.

## Technologies Used

- Java
- Spring Boot
- Maven

## Endpoints

- `POST /api/v1/employees`: Create a new employee.
- `PUT /api/v1/employees`: Update an existing employee.
- `GET /api/v1/employees/{id}`: Get an employee by ID.
- `DELETE /api/v1/employees/{id}`: Delete an employee by ID.
- `GET /api/v1/employees`: Get all employees.

## Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Run `./mvnw spring-boot:run` to start the application.

## Testing the API

You can use the following Postman collection to test the API:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://www.postman.com/planetary-water-884580/workspace/uday-s-public-workspace/collection/1581944-9d9daf7b-a58b-4ece-861d-a367b94b8500?action=share&creator=1581944)
