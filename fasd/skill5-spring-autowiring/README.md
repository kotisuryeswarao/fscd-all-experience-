# SKILL-5: Spring Autowiring with @Autowired

## Overview
Demonstrates Spring annotation-based autowiring — injecting a `Course` bean
into a `Student` bean using `@Autowired` and `@Component`.

## Project Structure
```
skill5-spring-autowiring/
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

## Key Annotations
| Annotation | Purpose |
|------------|---------|
| `@Component` | Marks class as Spring-managed bean |
| `@Autowired` | Injects matching bean by type |

## Run
```bash
mvn compile exec:java -Dexec.mainClass="com.klu.App"
```

## Expected Output
```
Student ID   : 10
Student Name : Divya
Gender       : Female
Course       : Course [id=301, course=Spring Core, dateOfCompletion=25-Jan-2026]
```

## Technologies
Java 11 · Spring Framework 5.3.30 · Maven
