# joins( completed )

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