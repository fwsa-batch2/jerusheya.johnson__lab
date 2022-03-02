## PROJECT TO MANAGE STUDENTS INFORMATION:

### table1:(students)

```syntax
create table students (
id int primary key auto_increment,
name varchar(100) not null,
email varchar(100) not null,
mobile_no bigint not null,
password varchar(100) not null,
gender char(1) not null,
dob date,
created_date timestamp not null default current_timestamp,
unique (email),
check ( gender in ('M','F'))
); 
```
```syntax
SELECT * FROM students;
```

| id | name      | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |
|  2 | Abisha    | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   |
|  3 | Swetha    | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | 2004-11-12   |
|  4 | Saranya   | saranya003@gmail.com     | 7834820939   | saran@03  |  F     |   2022-03-01 14:00:08   | 2005-04-23   |
|  5 | Annamalai | annamalai@gmail.com      | 9952849389   | malai@002 |  M     |   2022-03-01 14:00:08   | 2006-05-08   |
|  6 | Aswath    | aswath2003@gmail.com     | 6730489384   | aswath43  |  M     |   2022-03-01 14:00:08   | 2007-02-26   |
|  7 | Haiden    | haiden89@gmail.com       | 9959898968   | haiden@89 |  M     |   2022-03-01 14:00:08   | 2004-01-23   |
|  8 | Santhanu  | santhanu02@gmail.com     | 8930498989   | sanboi02  |  M     |   2022-03-01 14:00:08   | 2005-10-15   |
|  9 | Selvaraj  | selva001@gmail.com       | 8754797667   | selva@001 |  M     |   2022-03-01 14:00:08   | 2007-03-24   |
| 10 | Rishi     | rishi202.a@gmail.com     | 8230489384   | rishi@02  |  M     |   2022-03-01 14:00:08   | 2002-12-06   |
| 11 | Riyaz     | riyaz898@gmail.com       | 9952827368   | riyaz@898 |  M     |   2022-03-01 14:00:08   | 2005-07-22   |

###### Query ok, 11 row selected(0.01 sec)

### table2: (student_class)

```syntax
create table studentClass (
id int primary key auto_increment,
student_id int not null,
class int not null,
status varchar(20) not null,
foreign key (student_id) references students(id) ON DELETE CASCADE ON UPDATE CASCADE,
check( class >= 1 and class <=12),
check (status in ('ACTIVE','INACTIVE'))
); 
```
```syntax
SELECT * FROM Student_class;
```

| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
| 1  |     1      |  12   | ACTIVE   |
| 2  |     2      |  11   | INACTIVE |
| 3  |     3      |  10   | ACTIVE   |
| 4  |     4      |  09   | ACTIVE   |
| 5  |     5      |  08   | INACTIVE |
| 6  |     6      |  07   | ACTIVE   |
| 7  |     7      |  10   | INACTIVE |
| 8  |     8      |  09   | ACTIVE   |
| 9  |     9      |  08   | INACTIVE |
| 10 |     10     |  12   | ACTIVE   |
| 11 |     11     |  09   | ACTIVE   |

###### Query ok, 11 row selected(0.01 sec)


#### Feature 1: Student Registration :       

```syntax
INSERT INTO students (name,email,mobile_no,password,gender,dob) VALUES ('Mahalakshmi','maha.222@gmail.com','7847879878','maha@222','F','2009-05-22');
```

#### Feature 2: List All Students 

```syntax
SELECT * FROM students;
```
| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya  | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |
|  2 | Abisha     | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   |
|  3 | Swetha     | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | 2004-11-12   |
|  4 | Saranya    | saranya003@gmail.com     | 7834820939   | saran@03  |  F     |   2022-03-01 14:00:08   | 2005-04-23   |
|  5 | Annamalai  | annamalai@gmail.com      | 9952849389   | malai@002 |  M     |   2022-03-01 14:00:08   | 2006-05-08   |
|  6 | Aswath     | aswath2003@gmail.com     | 6730489384   | aswath43  |  M     |   2022-03-01 14:00:08   | 2007-02-26   |
|  7 | Haiden     | haiden89@gmail.com       | 9959898968   | haiden@89 |  M     |   2022-03-01 14:00:08   | 2004-01-23   |
|  8 | Santhanu   | santhanu02@gmail.com     | 8930498989   | sanboi02  |  M     |   2022-03-01 14:00:08   | 2005-10-15   |
|  9 | Selvaraj   | selva001@gmail.com       | 8754797667   | selva@001 |  M     |   2022-03-01 14:00:08   | 2007-03-24   |
| 10 | Rishi      | rishi202.a@gmail.com     | 8230489384   | rishi@02  |  M     |   2022-03-01 14:00:08   | 2002-12-06   |
| 11 | Riyaz      | riyaz898@gmail.com       | 9952827368   | riyaz@898 |  M     |   2022-03-01 14:00:08   | 2005-07-22   |
| 12 | Mahalakshmi| maha.222@gmail.com       | 7847879878   | maha@222  |  F     |   2022-03-01 14:00:08   | 2009-05-22   |

###### Query ok, 12 row selected(0.01 sec)


#### Feature 3: Login with email and password 

```syntax
SELECT * FROM students WHERE email='loginers_mail' AND password='loginers_password';
```
Eg:
```syntax
SELECT * FROM students WHERE email='saranya003@gmail.com' AND password='saran@03';
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  4 | Saranya    | saranya003@gmail.com     | 7834820939   | saran@03  |  F     |   2022-03-01 14:00:08   | 2005-04-23   |

###### Query ok, 1 row selected(0.00 sec)

#### Feature 4: Update Password

```syntax
UPDATE students SET email='jerusheya2002@gmail.com' WHERE id='1';
```
###### Query ok, 0 row selected(0.00 sec)

```syntax
SELECT * FROM students WHERE id='1';
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|
|  1 | Jerusheya  | jerusheya2002@gmail.com  | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   |

###### Query ok, 1 row selected(0.00 sec)


#### Feature 5: Enroll Student into Class 

```syntax
INSERT INTO Student_class (student_id,class,status) VALUES (12,5,'ACTIVE');
```
```syntax
SELECT * FROM Student_class;
```

| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
| 1  |     1      |  12   | ACTIVE   |
| 2  |     2      |  11   | ACTIVE   |
| 3  |     3      |  10   | ACTIVE   |
| 4  |     4      |   9   | INACTIVE |
| 5  |     5      |   8   | INACTIVE |
| 6  |     6      |   7   | ACTIVE   |
| 7  |     7      |  10   | INACTIVE |
| 8  |     8      |   9   | ACTIVE   |
| 9  |     9      |   8   | ACTIVE   |
| 10 |     10     |  12   | ACTIVE   |
| 11 |     11     |   9   | ACTIVE   |
| 12 |     12     |   5   | ACTIVE   |



#### Feature 6: Find Students who are enrolled in the given class 
For 6th question: Find Students who are studying in 5th standard. 

```syntax
SELECT * FROM student INNER JOIN Student_class WHERE class=5;
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          | id | student_id | class | status   |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|:---|:-----------|:------|:---------|
| 12 | Mahalakshmi| maha.222@gmail.com       | 7847879878   | maha@222  |  F     |   2022-03-01 14:00:08   | 2009-05-22   | 12 |     12     |   5   | ACTIVE   |


#### Feature 7: Update Student Class information 
Update student from 5th standard to 6th standard.

```syntax
UPDATE Student_class SET class=6 WHERE id=12;
```

#### Feature 8: Student withdrawn from a Class 

```syntax
ALTER TABLE students DROP PRIMARY KEY;
```

```syntax
DELETE FROM students WHERE id=2;
```

#### Feature 9: Find student details who have not updated their Date Of Birth 

```syntax
SELECT * FROM students WHERE dob is NULL;
```
###### Query OK, Empty set(0.00 sec)

#### Feature 10: Find Total no of students actively studying in this school 

```syntax
SELECT COUNT(status) FROM students WHERE status = 'ACTIVE';
```
| COUNT(status) |
|:--------------|
|      7        |

###### Query ok, 1 row selected (0.00 sec)

#### Feature 11: Find Total no of students actively studying in each class 

```syntax
SELECT class,COUNT(status) FROM Student_class WHERE status = 'ACTIVE' GROUP BY class;
```
| class | COUNT(status) |
|:------|:--------------|
|  5    |       1       | 
|  7    |       1       |
|  8    |       1       |
|  9    |       2       |
|  10   |       1       |
|  11   |       1       |
|  12   |       2       |

###### Query ok, 7 rows selected (0.001 sec)


#### Feature 12: Find Total no of students actively studying each class which has less than 5 students. 

```syntax
SELECT class,COUNT(status) FROM Student_class WHERE status = 'ACTIVE' GROUP BY class WHERE COUNT(status)<5;
```
| class | COUNT(status) |
|:------|:--------------|
|  5    |       1       | 
|  7    |       1       |
|  8    |       1       |
|  9    |       2       |
|  10   |       1       |
|  11   |       1       |
|  12   |       2       |

###### Query ok, 7 rows selected (0.001 sec)

#### Feature 13: Display student and class details 
Using Joins (Inner Join) 
Using Subqueries ( Scalar SubQuery) 

##### Using Joins:

```syntax
SELECT * FROM student INNER JOIN Student_class ON student.id=Student_detail.id;
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          | id | student_id | class | status   |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|:---|:-----------|:------|:---------|
|  1 | Jerusheya  | jeru2002@gmail.com       | 9952393568   | jeru@2002 |  F     |   2022-03-01 14:00:08   | 2002-08-26   | 1  |     1      |  12   | ACTIVE   |
|  2 | Abisha     | abisha2003@gmail.com     | 8930489384   | abi@2003  |  F     |   2022-03-01 14:00:08   | 2003-06-03   | 2  |     2      |  11   | ACTIVE   |
|  3 | Swetha     | swetha20@gmail.com       | 7483785788   | swetha@20 |  F     |   2022-03-01 14:00:08   | 2004-11-12   | 3  |     3      |  10   | ACTIVE   |
|  4 | Saranya    | saranya003@gmail.com     | 7834820939   | saran@03  |  F     |   2022-03-01 14:00:08   | 2005-04-23   | 4  |     4      |   9   | INACTIVE |
|  5 | Annamalai  | annamalai@gmail.com      | 9952849389   | malai@002 |  M     |   2022-03-01 14:00:08   | 2006-05-08   | 5  |     5      |  08   | INACTIVE |
|  6 | Aswath     | aswath2003@gmail.com     | 6730489384   | aswath43  |  M     |   2022-03-01 14:00:08   | 2007-02-26   | 6  |     6      |  07   | ACTIVE   |
|  7 | Haiden     | haiden89@gmail.com       | 9959898968   | haiden@89 |  M     |   2022-03-01 14:00:08   | 2004-01-23   | 7  |     7      |  10   | INACTIVE |
|  8 | Santhanu   | santhanu02@gmail.com     | 8930498989   | sanboi02  |  M     |   2022-03-01 14:00:08   | 2005-10-15   | 8  |     8      |   9   | ACTIVE   |
|  9 | Selvaraj   | selva001@gmail.com       | 8754797667   | selva@001 |  M     |   2022-03-01 14:00:08   | 2007-03-24   | 9  |     9      |   8   | ACTIVE   |
| 10 | Rishi      | rishi202.a@gmail.com     | 8230489384   | rishi@02  |  M     |   2022-03-01 14:00:08   | 2002-12-06   | 10 |     10     |  12   | ACTIVE   |
| 11 | Riyaz      | riyaz898@gmail.com       | 9952827368   | riyaz@898 |  M     |   2022-03-01 14:00:08   | 2005-07-22   | 11 |     11     |   9   | ACTIVE   |
| 12 | Mahalakshmi| maha.222@gmail.com       | 7847879878   | maha@222  |  F     |   2022-03-01 14:00:08   | 2009-05-22   | 12 |     12     |   5   | ACTIVE   |

 ###### Query ok, 12 rows selected (0.001 sec)


 #### Feature 14: Display Student Details for the given input class 
Class : 5th Standard
Using Joins 

```syntax
SELECT * FROM student INNER JOIN Student_class ON student.id=Student_detail.id;
```

| id | name       | email                    | mobile_no    | password  | gender | created_date            | dob          | id | student_id | class | status   |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:------------------------|:-------------|:---|:-----------|:------|:---------|
| 12 | Mahalakshmi| maha.222@gmail.com       | 7847879878   | maha@222  |  F     |   2022-03-01 14:00:08   | 2009-05-22   | 12 |     12     |   5   | ACTIVE   |

###### Query ok, 1 row selected(0.00 sec);

#### Feature 15: Select class of a student by given email:

```syntax
SELECT st.name,st.email,sc.class FROM students st RIGHT JOIN Student_class sc on st.id = sc.student_id where email like('%n@gmail.com')
```
###### Query ok, empty set(0.00 sec);

#### Feature 16 :FIND STUDENTS WHO HAS NOT ENROLLED IN A CLASS

```syntax
DELETE FROM Student_class WHERE id=12;
```

```syntax
SELECT students.id,students.name,students.email,students.mobile_no,students.password,students.gender,students.dob FROM students LEFT JOIN Student_class ON students.id=Student_class.student_id WHERE class is NULL;
```


| id | name       | email                    | mobile_no    | password  | gender | dob          |
|:---|:-----------|:-------------------------|:-------------|:----------|:-------|:-------------|
| 12 | Mahalakshmi| maha.222@gmail.com       | 7847879878   | maha@222  |  F     | 2009-05-22   |

###### Query ok,1 row selected(0.00 sec)


#### DISPLAY ALL STUDENTS NAME WITH CLASS - INCLUDE BOTH ENROLLED AND NOT ENROLLED

```syntax
SELECT students.id,students.name,Student_class.class FROM students LEFT JOIN Student_class ON students.id=Student_class.student_id;
```

| id | name        | class |
|:---|:------------|:------|
|  1 | Jerusheya   |  11   |
|  2 | Abisha      |  10   |
|  3 | Swetha      |   9   |
|  4 | Saranya     |   8   |
|  5 | Annamalai   |   7   |
|  6 | Aswath      |  10   |
|  7 | Haiden      |   9   |
|  8 | Santhanu    |   8   |
|  9 | Selvaraj    |  12   |
| 10 | Rishi       |   9   | 
| 11 | Riyaz       |   5   |
| 12 | Mahalakshmi | NULL  |

######   Query ok, 12 rows selected(0.00 sec);   