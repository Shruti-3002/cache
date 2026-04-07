# Caching App

A Spring Boot application demonstrating caching strategies using Redis.

## Tech Stack

- Java 21
- Spring Boot 3.3.3
- Spring Data JPA
- Spring Cache with Redis
- MySQL
- Lombok
- ModelMapper

## Features

- Employee CRUD operations
- Redis-backed caching with `@Cacheable`
- Pessimistic locking on Salary Account
- Transaction management
- Global exception handling

## Setup

### Prerequisites

- Java 21
- MySQL running on `localhost:3306`
- Redis instance (local or cloud)

### Configuration

Update `src/main/resources/application.properties` with your database and Redis credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>

spring.data.redis.host=<your-redis-host>
spring.data.redis.port=<your-redis-port>
spring.data.redis.password=<your-redis-password>
```

### Run

```bash
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint                              | Description             |
|--------|---------------------------------------|-------------------------|
| GET    | `/employees/{id}`                     | Get employee by ID      |
| POST   | `/employees`                          | Create new employee     |
| PUT    | `/employees/{id}`                     | Update employee         |
| DELETE | `/employees/{id}`                     | Delete employee         |
| PUT    | `/employees/incrementBalance/{accountId}` | Increment salary balance |
