# SKILL-4: Spring Dependency Injection

## Overview
Demonstrates Spring IoC with **Constructor Injection** and **Setter Injection**
using XML-based configuration (`applicationContext.xml`).

## Project Structure
```
skill4-spring-di/
├── src/main/java/com/klu/
│   ├── Course.java
│   ├── Student.java
│   └── App.java
├── src/main/resources/
│   └── applicationContext.xml
├── pom.xml
├── .gitignore
└── README.md
```

## Key Concepts
| Type | Applied To |
|------|-----------|
| Constructor Injection | `Student(id, name, year)` and `Course(name, duration)` |
| Setter Injection | `student.course`, `student.email`, `student.phoneNumber` |

## Run
```bash
mvn compile exec:java -Dexec.mainClass="com.klu.App"
```

## Expected Output
```
Student ID    : 101
Student Name  : ram
Academic Year : 2026
Email         : ram@klu.edu
Phone Number  : 9876543210
Course        : Spring Framework (6 months)
```

## Technologies
Java 11 · Spring Framework 5.3.30 · Maven
