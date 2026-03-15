# SKILL-3: HQL Lab — Sorting, Pagination & Aggregates

## Overview
Advanced HQL operations on a Product entity: sorting, pagination, aggregates, GROUP BY, LIKE.

## Project Structure
```
skill3-hibernate-hql/
├── src/main/java/com/hql/
│   ├── entity/Product.java
│   ├── util/HibernateUtil.java
│   ├── loader/ProductDataLoader.java
│   └── demo/HQLDemo.java
├── src/main/resources/hibernate.cfg.xml
├── pom.xml
├── .gitignore
└── README.md
```

## Tasks
| Task | Description |
|------|-------------|
| 1 | Product entity setup |
| 2 | Load 8 sample products |
| 3 | Sort by price ASC / DESC |
| 4 | Sort by quantity DESC |
| 5 | Pagination (page/size) |
| 6 | COUNT, MIN, MAX, AVG, SUM |
| 7 | GROUP BY category |
| 8 | Price range filter |
| 9 | LIKE pattern matching |

## Setup
```sql
CREATE DATABASE inventory_db;
```
Update password in `hibernate.cfg.xml`, then:
```bash
mvn compile exec:java -Dexec.mainClass="com.hql.demo.HQLDemo"
```
