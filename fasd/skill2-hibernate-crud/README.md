# SKILL-2: Hibernate CRUD Operations

## Overview
Retail inventory system with full CRUD using Hibernate ORM + MySQL.

## Project Structure
```
skill2-hibernate-crud/
├── src/main/java/com/inventory/
│   ├── entity/Product.java
│   ├── util/HibernateUtil.java
│   ├── dao/ProductDAO.java
│   └── main/App.java
├── src/main/resources/hibernate.cfg.xml
├── pom.xml
├── .gitignore
└── README.md
```

## Database Setup
```sql
CREATE DATABASE inventory_db;
USE inventory_db;
```

## Configure
Edit `src/main/resources/hibernate.cfg.xml` — set your MySQL password.

## Run
```bash
mvn compile exec:java -Dexec.mainClass="com.inventory.main.App"
```

## Technologies
Java 11 · Hibernate 6.2 · MySQL 8 · Maven · Jakarta Persistence
