### Subqueries:

#### 1. INSERT with subqueries:

```
show databases;
```

| Database           |
|:-------------------|
| case_when          |
| constraints        |
| fwsa_batch2        |
| information_schema |
| jerusheya          |
| mysql              |
| performance_schema |
| project            |
| school             |
| sys                |
| tcl                |
| views              |


### creating database:
```
create database subqueries;
```
```
show databases;
```

| Database           |
|:-------------------|
| case_when          |
| constraints        |
| fwsa_batch2        |
| information_schema |
| jerusheya          |
| mysql              |
| performance_schema |
| project            |
| school             |
| sys                |
| tcl                |
| views              |
| subqueries         |

### using subqueries
```
USE SUBQUERIES;
```
### creating table:
```
CREATE TABLE class(id int primary key auto_increment,name varchar(20),marks int);
```
### inserting values to book
```
INSERT INTO class values(1,'Abisha','96'),(2,'Annamalai','97'),(3,'Aswath','50'),(4,'Haiden','85'),(5,'Jerusheya','87'),(6,'Rishi','60'),(7,'Santhanu','99'),(8,'Saranya','90'),(9,'Swetha','100'),(10,'Selva','98');
```
### Get datas from book
```
SELECT * FROM book;
```

| sno | name      | marks |
|-----|-----------|-------|
|   1 | Abisha    | 96    |
|   2 | Annamalai | 97    |
|   3 | Aswath    | 50    |
|   4 | Haiden    | 85    |
|   5 | Jerusheya | 87    |
|   6 | Rishi     | 60    |
|   7 | Santhanu  | 99    |
|   8 | Saranya   | 90    |
|   9 | Swetha    | 100   |
|  10 | Selva     | 98    |


### using subquery in select statement

```
SELECT * FROM book where marks in (select marks from book where marks>95);
```

| sno | name     | marks |
|-----|----------|-------|
|   1 | Abisha   |    96 |
|   2 | Annamalai|    97 |
|   7 | Santhanu |    99 |
|   9 | Swetha   |   100 |
|  10 | Selva    |    98 |

```
SELECT  avg(marks) AS Avg_Marks from book;
```

| Avg_Marks  |
|------------|
|    84.4000 |

```
SELECT * FROM book WHERE marks > (select avg(marks) from book);
```

| sno | name     | marks |
|-----|----------|-------|
|   1 | Abisha   |    96 |
|   2 | Annamalai|    97 |
|   7 | Santhanu |    99 |
|   8 | Saranya  |    90 |
|   9 | Swetha   |   100 |
|  10 | Selva    |    98 |

### creating table called student_marks
```
CREATE TABLE student_marks(id int primary key auto_increment,name varchar(20),marks int);
```
### using subquery in Insert statement
```
INSERT INTO student_marks select*from book where marks > (select avg(marks) from book);
```
### Getting datas
```
SELECT * FROM student_marks;
```
| id | name     | marks |
|----|----------|-------|
|  1 | Abisha   |    96 |
|  2 | Annamalai|    97 |
|  7 | Santhanu |    99 |
|  8 | Saranya  |    90 |
|  9 | Swetha   |   100 |
| 10 | Selva    |    98 |

### using subqueries in delete statement
```
DELETE FROM score WHERE marks in (select marks from student_marks where marks=100);
```
### showing datas
```
SELECT * FROM score;
```

| sno | name      | marks |
|-----|-----------|-------|
|   1 | Abisha    |    96 |
|   2 | Annamalai |    97 |
|   3 | Aswath    |    50 |
|   4 | Haiden    |    75 |
|   5 | Jerusheya |    80 |
|   6 | Rishi     |    60 |
|   7 | Santhanu  |    99 |
|   8 | Saranya   |    90 |
|  10 | Selva     |    98 |

### using subqueries in update statement
```
UPDATE score SET Name='Sesslyn' WHERE sno in (SELECT id FROM student_mark
s WHERE id=10);
```
### Get datas
```
SELECT * FROM score;
```

| sno | name      | marks |
|-----|-----------|-------|
|   1 | Abisha    |    96 |
|   2 | Annamalai |    97 |
|   3 | Aswath    |    50 |
|   4 | Haiden    |    75 |
|   5 | Jerusheya |    80 |
|   6 | Rishi     |    60 |
|   7 | Santhanu  |    99 |
|   8 | Saranya   |    90 |
|  10 | Sesslyn   |    98 |


