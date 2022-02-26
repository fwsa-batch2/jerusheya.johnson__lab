# Database-and-Mysql-Practice

# MySQL commands

## DATABASE:

### SHOW DATABASES Statement:

```syntax
SHOW DATABASES;
```
|Database
|:-----|
| information_schema |
| mysql              |
| performance_schema |
| sys                |

###### 4 rows in set (0.01 sec)
* * *

### CREATE DATABASES Statement:

```syntax
CREATE DATABASE fwsa_batch2;
```

```syntax
SHOW DATABASES;
```

|Database
|:-----|
| information_schema |
|fwsa_batch2         |
| mysql              |
| performance_schema |
| sys                |

###### 5 rows in set (0.01 sec)
* * *

### USE DATABASE Statement:

```syntax
USE fwsa_batch2;
```
###### Database changed
* * *

## TABLE:

### CREATE TABLE Statement:

```syntax
 CREATE TABLE StudentsList (id int primary key auto_increment, name varchar(20) NOT NULL, email varchar(225) UNIQUE NOT NULL, Age int(2) NOT NULL, DOB date NOT NULL);
```
###### Query OK, 0 rows affected, 1 warning (0.04 sec)
* * *

### SHOW TABLES Statement:

```syntax
SHOW TABLES;
```
| fwsa_batch2          |
|:----|
| StudentsList           |

###### 1 row in set (0.01 sec)
* * *

### DESCRIBE TABLE Statement:

```syntax
DESC StudentsList;
```
```syntax
DESCRIBE StudentsList;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:------------|:-------------|:-----|:----|:--------|:---------------|
| id          | int          | NO   | PRI | NULL    | auto_increment |
| name        | varchar(20)  | NO   |     | NULL    |                |
| email       | varchar(225) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| DOF         | date         | NO   |     | NULL    |                |

###### 5 rows in set (0.01 sec)
* * *

### INSERT INTO Statement:

```syntax
INSERT INTO StudentsList (name,email,Age,DOF) VALUES ('Jerusheya','jerusheya2002@gmail.com',19,'2002-08-26'),('Abisha','abisha2003@gmail.com',18,'2004-18-24'),('Swetha','swetha2004@gmail.com',17,'2003-11-20');
```

###### Query OK, 1 row affected (0.03 sec)
* * *

### SELECT Statement:

```syntax
SELECT * FROM StudentsList;
```

| id | name      |  email                   | Age | DOF         |
|:--:|:----------|:-------------------------|:---:|:------------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |

###### 3 row in set (0.01 sec)
* * *

### WHERE Clause:

```syntax
SELECT * FROM StudentsList WHERE id=3;
```

| id | name      | email                   | Age | DOF         |
|:--:|:----------|:------------------------|:---:|:------------|
|  3 | Swetha    | swetha2004@gmail.com    |  17 | 2003-11-20  |

###### 1 row in set (0.00 sec)
* * *

### ALTER TABLE Statement:

#### ADD

```syntax
ALTER TABLE StudentsList ADD Place char(70);
```
###### Query OK, 0 rows affected (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

#### MODIFY

```syntax
ALTER TABLE StudentsList MODIFY COLUMN Place varchar(50) NOT NULL;
```
###### Query OK, 2 rows affected (0.06 sec)
###### Records: 2  Duplicates: 0  Warnings: 0

```syntax
DESC StudentsList;
```

| Field       | Type         | Null | Key | Default | Extra          |
|:------------|:-------------|:-----|:----|:--------|:---------------|
| id          | int          | NO   | PRI | NULL    | auto_increment |
| name        | varchar(20)  | NO   |     | NULL    |                |
| email       | varchar(225) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| DOF         | date         | NO   |     | NULL    |                |
| Place       | varchar(50)  | NO   |     | NULL    |                |

###### 6 rows in set (0.01 sec)

```syntax
SELECT * FROM StudentsList;
```
| id | name      |  email                   | Age | DOF         | Place  |
|:---|:----------|:-------------------------|:---:|:------------|:-------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |NULL    |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |NULL    |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |NULL    |

###### 3 row in set (0.01 sec)
* * *

#### RENAME

```syntax
ALTER TABLE StudentsList RENAME DOF TO DateOfBirth;(or)
ALTER TABLE StudentsList CHANGE COLUMN DOF DateOfBirth;
```
```syntax
SELECT * FROM StudentsList;
```
| id | name      |  email                   | Age | DateOfBirth | Place  |
|:---|:----------|:-------------------------|:---:|:------------|:-------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |NULL    |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |NULL    |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |NULL    |

###### 3 row in set (0.01 sec)
* * *

#### ALTER DROP

```syntax
ALTER TABLE StudentsList DROP COLUMN Place;
```

```syntax
SELECT * FROM StudentsList;
```
| id | name      |  email                   | Age | DateOfBirth |
|:---|:----------|:-------------------------|:---:|:------------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |

###### 3 row in set (0.01 sec)
* * *

### UPDATE Statement:

```syntax
 UPDATE StudentsList SET email='swethasaravanan@gmail.com WHERE id = 3;
```
###### Query OK, 1 row affected (0.03 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```syntax
SELECT * FROM studentslist;
```
| id | name      |  email                   | Age | DateOfBirth |
|:---|:----------|:-------------------------|:---:|:------------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swethasaravanan@gmail.com|  17 | 2003-11-20  |

###### 3 row in set (0.01 sec)
* * *

### DELETE Statement:

```syntax
DELETE FROM StudentsList WHERE id=1;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
SELECT * FROM studentslist;
```
| id | name      |  email                   | Age | DateOfBirth |
|:---|:----------|:-------------------------|:---:|:------------|
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swethasaravanan@gmail.com|  17 | 2003-11-20  |

###### 2 row in set (0.01 sec)
* * *

### TRUNCATE Statement:

```syntax
TRUNCATE FROM StudentsList;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
SELECT * FROM studentslist;
```

###### Empty set (0.01 sec)
* * *

### DROP TABLE Statement

```syntax
DROP TABLE StudentsList;
```
###### Query OK, 0 rows affected (0.03 sec)
```syntax
DROP DATABASE fwsa_batch2;
```
###### Query OK, 0 rows affected (0.03 sec)
```syntax
SHOW DATABASES;
```
|Database
|:-----|
| information_schema |
| mysql              |
| performance_schema |
| sys                |


###### 4 rows in set (0.01 sec)
* * *

## MySQL CONSTRAINTS:

### NOT NULL

```syntax
 CREATE TABLE constraints(name varchar(20) NOT NULL);
```
###### not null - doesnot allow null

### UNIQUE

```syntax
 CREATE TABLE constraints(email varchar(60) UNIQUE);
```
###### unique - every values should be unique, does not allow repitition but allows null for infinite times

### DEFAULT

```syntax
CREATE TABLE constraints(class tinyint(2) DEFAULT '12');
```
###### default - fixes a particular value as default

### CHECK

```syntax
CREATE TABLE constraints(age int(2) NOT NULL, CHECK(age>=16));
```
###### check - checks a particular condition

### PRIMARY KEY

```syntax
CREATE TABLE constraints(id tinyint(2) PRIMARY KEY AUTO_INCREMENT);
```
###### primary key - can be used only once in a table, unique + not null = primary key

### CREATE TABLE with all Constraints without FOREIGN KEY

```syntax
CREATE TABLE constraints(id int(2) PRIMARY KEY AUTO_INCREMENT, name varchar(20) NOT NULL, email varchar(255) UNIQUE,  DOF date NOT NULL, class tinyint(2) default '12', age tinyint(2), CHECK (age>=17));
```
###### Query OK, 0 rows affected, 2 warnings (0.03 sec)
### INSERT INTO

```syntax
INSERT INTO constraints(name,email,DOF,class,age) VALUES ('Jerusheya','jerusheya2002@gmail.com','2002-08-26','12','19');
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC constraints;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:------------|:-------------|:-----|:---:|:-------:|:---------------|
| id          | int          | NO   | PRI | NULL    | auto_increment |
| name        | varchar(20)  | NO   |     | NULL    |                |
| email       | varchar(255) | YES  | UNI | NULL    |                |
| DOF         | int          | NO   |     | NULL    |                |
| class       | tinyint(2)   | NO   |     | 12      |                |
| age         | tinyint(2)   | YES  |     | NULL    |                |

###### 6 rows in set (0.01 sec)
### SELECT

```syntax
SELECT * FROM constraints;
```
| Id | Firstname | email                   | DOF        | class | age |
|:---|:----------|:------------------------|:-----------|:------|:----|
|  1 | Jerusheya | jerusheya2002@gmail.com | 2002-08-26 | 12    | 19  |

###### 1 row in set (0.01 sec)

### FOREIGN KEY

```syntax
CREATE TABLE foreignkey(studID int PRIMARY KEY AUTO_INCREMENT, 10th_mark int(3), Employee_ID int, FOREIGN KEY(Employee_ID) REFERENCES constraints(Id));
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
### INSERT INTO

```syntax
INSERT INTO foreignkey(10th_mark,EmployeeId) VALUES (480,1);
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC foreignkey;
```

| Field        | Type | Null | Key | Default | Extra |
|:-------------|:-----|:-----|:---:|:--------|:------|
| studId       | int  | NO   | PRI | NULL    |       |
| 10th_mark    | int  | YES  |     | NULL    |       |
| Employee_Id  | int  | YES  | MUL | NULL    |       |

###### 3 rows in set (0.00 sec)
### SELECT

```syntax
SELECT * FROM foreignkey;
```
| studId | 10th_mark | Employee_Id |
|:-------|:----------|:------------|
|      1 |    480    |     1       |

###### 1 row in set (0.01 sec)
*  *  *


## JOINS

### table 1:

```syntax
 CREATE TABLE StudentsList (id int primary key auto_increment, name varchar(20) NOT NULL, email varchar(225) UNIQUE NOT NULL, Age int(2) NOT NULL, DOB date NOT NULL);
```
###### Query OK, 1 row affected (0.03 sec)
* * *

```syntax
INSERT INTO StudentsList (name,email,Age,DOB) VALUES ('Jerusheya','jerusheya2002@gmail.com',19,'2002-08-26'),('Abisha','abisha2003@gmail.com',18,'2004-10-24'),('Swetha','swetha2004@gmail.com',17,'2003-11-20');
```

###### Query OK, 1 row affected (0.03 sec)
* * *

```syntax
SELECT * FROM StudentsList;
```

| id | name      |  email                   | Age | DOF         |
|:--:|:----------|:-------------------------|:---:|:------------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |

###### 3 row in set (0.01 sec)
* * *

### table 2:

```syntax
 CREATE TABLE teachersList (id int primary key, teachers_name varchar(20) NOT NULL, course_name varchar(225) NOT NULL);
```
###### Query OK, 1 row affected (0.03 sec)
* * *

```syntax
INSERT INTO teachersList (teachers_name,course_name) VALUES ('chitra','css'),('surya','html'),('revathi','javascript');
```

###### Query OK, 1 row affected (0.03 sec)
* * *

```syntax
SELECT * FROM teachersList;
```

| id | teachers_name  |  course_name    |
|:--:|:---------------|:----------------|
|  1 | chitra         | css             | 
|  2 | surya          | html            | 
|  4 | revathi        | javascript      |

###### 3 row in set (0.01 sec)
* * *


## 1. INNER JOIN

```syntax
SELECT StudentsList.name,teachersList.teachers_name,teachersList.course_name
FROM StudentsList INNER JOIN teachersList
ON StudentsList.id=teachersList.id;
```
###### Query OK, 1 row affected (0.03 sec)
* * *

| name      | teachers_name | course_name |
|:----------|:--------------|:------------|
| Jerusheya | chitra        | css         |
| Abisha    | surya         | html        |


## 2. LEFT JOIN

```syntax
SELECT StudentsList.name,teachersList.teachers_name,teachersList.course_name
FROM StudentsList LEFT JOIN teachersList
ON StudentsList.id=teachersList.id;
```
###### Query OK, 1 row affected (0.03 sec)
* * *

| name      | teachers_name | course_name |
|:----------|:--------------|:------------|
| Jerusheya | chitra        | css         |
| Abisha    | surya         | html        |
| Swetha    | NULL          | NULL        |


## 3. RIGHT JOIN

```syntax
SELECT StudentsList.name,teachersList.teachers_name,teachersList.course_name
FROM StudentsList RIGHT JOIN teachersList
ON StudentsList.id=teachersList.id;
```
###### Query OK, 1 row affected (0.03 sec)
* * *

| name      | teachers_name | course_name |
|:----------|:--------------|:------------|
| Jerusheya | chitra        | css         |
| Abisha    | surya         | html        |
| NULL      | revathi       | javascript  |


## 4. CROSS JOIN

#### table1:
| id | name      |  email                   | Age | DOF         |
|:--:|:----------|:-------------------------|:---:|:------------|
|  1 | Jerusheya | jerusheya2002@gmail.com  |  19 | 2002-08-26  |
|  2 | Abisha    | abisha2003@gmail.com     |  18 | 2004-18-24  |
|  3 | Swetha    | swetha2004@gmail.com     |  17 | 2003-11-20  |

#### table2:
| id | teachers_name  |  course_name    |
|:--:|:---------------|:----------------|
|  1 | chitra         | css             | 
|  2 | surya          | html            | 
|  4 | revathi        | javascript      |

```syntax
SELECT StudentsList.name,teachersList.teachers_name,teachersList.course_name
FROM StudentsList CROSS JOIN teachersList;
```
###### Query OK, 1 row affected (0.03 sec)
* * *

| name      | teachers_name    | course_name |
|:----------|:-----------------|:------------|
| Swetha    | chitra           | css         |
| Abisha    | chitra           | css         |
| Jerusheya | chitra           | css         |
| Swetha    | surya            | html        |
| Abisha    | surya            | html        |
| Jerusheya | surya            | html        |
| Swetha    | revathi          | javascript  |
| Abisha    | revathi          | javascript  |
| Jerusheya | revathi          | javascript  |


###### 9 row in set (0.01 sec)
* * * 

##### no.of rows= m*n ;


## iINDEXES:

### Type of Index:

| types               |
|:--------------------|
| clustered index     |
| non-clustered index |

### CREATE INDEX:

```syntax
CREATE INDEX ix_name ON table_name (column_name asc);
```

### INDEX WITH CREATE TABLE:

```syntax
CREATE TABLE table_name (
   c1 data_type PRIMARY KEY,
   c2 data_type,
   c3 data_type,
   c4 data_type,
   INDEX index_name (c2,c3,c4));
```

### SHOW INDEXES:

```syntax
SHOW INDEX FROM table_name;
```

### DROP INDEXES:

```syntax
DROP INDEX index_name ON table_name;
```

### table1:

```syntax
SELECT * FROM StudentsList;
```

+----+-----------+-------------------------+-----+------------+
| id | name      | email                   | Age | DOB        |
+----+-----------+-------------------------+-----+------------+
|  4 | Jerusheya | jerusheya2002@gmail.com |  19 | 2002-08-26 |
|  5 | Abisha    | abisha2003@gmail.com    |  18 | 2004-10-24 |
|  6 | Swetha    | swetha2004@gmail.com    |  17 | 2003-11-20 |
+----+-----------+-------------------------+-----+------------+

###### 3 rows in set (0.00 sec)
* * * 

### CREATE INDEX:

```syntax
CREATE INDEX ix_name ON StudentsList (name asc);
```
###### Query OK, 1 row affected (0.03 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
* * *

### 1.CREATE COMPOSITE INDEX:
##### Same syntax of create index but more than one column.

```syntax
CREATE INDEX ix_name ON StudentsList (name,email,Age);
```
###### Query OK, 1 row affected (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
* * *

### 2.CLUSTERED INDEX = PRIMARY KEY

### NON-CLUSTERED INDEX:
##### Has separated Index Storage

```syntax
CREATE INDEX ix_name ON StudentsList (name asc);
```
###### Query OK, 1 row affected (0.03 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
* * *

#### Difference between clustered and non-clustered index:

|   clustered index  (Primary key)        |         non-clustered index                           |
|:----------------------------------------|:------------------------------------------------------|
| There can be only one Clustered Index.  | There can be one / more than one Non-Clustered Index. |
|  It has no separate storage.            |  It has Separate Index storage for storing Index.     |
|  It is slow.                            |   It is fast.                                         |

### 3.UNIQUE INDEX 
##### no two rows will have the same index key value.

```syntax
CREATE UNIQUE INDEX un_ix_name on StudentsList(name);
```




