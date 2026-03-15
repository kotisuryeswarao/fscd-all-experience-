# Experiment-8: Course REST API via ResponseEntity

## Overview
Spring Boot REST API for Course management using `ResponseEntity<?>` for
proper HTTP response codes.

## Project Structure
```
experiment8-course-rest/
├── src/main/java/com/example/RE/
│   ├── Course.java              (JPA Entity)
│   ├── CourseRepository.java    (Spring Data JPA)
│   ├── CourseService.java       (Business Logic)
│   ├── CourseController.java    (REST Controller)
│   └── ReApplication.java       (Spring Boot Main)
├── src/main/resources/
│   └── application.properties
├── pom.xml
├── .gitignore
└── README.md
```

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | `/courses` | Create course |
| GET    | `/courses` | Get all courses |
| GET    | `/courses/{id}` | Get by ID |
| PUT    | `/courses/{id}` | Update course |
| DELETE | `/courses/{id}` | Delete course |
| GET    | `/courses/search/{title}` | Search by title |

## Database Setup
```sql
CREATE DATABASE coursedb;
```
Update credentials in `src/main/resources/application.properties`.

## Run
```bash
mvn spring-boot:run
```

## Test with curl
```bash
# Create
curl -X POST http://localhost:8080/courses \
  -H "Content-Type: application/json" \
  -d '{"courseId":1,"title":"Java Full Stack","duration":"6 months","fee":15000}'

# Get all
curl http://localhost:8080/courses

# Get by ID
curl http://localhost:8080/courses/1

# Update
curl -X PUT http://localhost:8080/courses/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Advanced Java","duration":"8 months","fee":18000}'

# Delete
curl -X DELETE http://localhost:8080/courses/1
```

## Technologies
Java 17 · Spring Boot 3.2 · Spring Data JPA · MySQL 8 · Maven
