# Employee Management API

A production-style REST API for managing employee records. Built with Java 17, Spring Boot, Spring Data JPA, MySQL, validation, pagination, and centralized error handling.

## Features
- Create, view, update, and delete employees
- Paginated and sortable employee listing
- Search by department
- Input validation and useful HTTP error responses
- Environment-variable based MySQL configuration

## Technology
Java 17 · Spring Boot · Spring Data JPA · MySQL · Maven · REST API

## Run locally
Set `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`, then run:
```bash
mvn spring-boot:run
```

## Main endpoints
| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/employees` | Create an employee |
| GET | `/api/employees?page=0&size=10&sortBy=name` | Paginated employee list |
| GET | `/api/employees?department=Engineering` | Filter by department |
| GET | `/api/employees/{id}` | Get one employee |
| PUT | `/api/employees/{id}` | Update an employee |
| DELETE | `/api/employees/{id}` | Delete an employee |
