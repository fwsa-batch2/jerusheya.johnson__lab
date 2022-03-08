 show databases;

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

12 rows in set (0.00 sec)

mysql> use case_when;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_case_when |
|:--------------------|
| Customers           |

1 row in set (0.00 sec)

mysql> use views;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_views |
|:----------------|
| Batch_users     |
| Batch_users_1   |
| Batches         |
| Courses         |
| user            |

5 rows in set (0.01 sec)

mysql> ALTER TABLE Batch_users RENAME Batch_courses1;
Query OK, 0 rows affected (0.04 sec)

mysql> show tables;

| Tables_in_views |
|:----------------|
| Batch_courses1  |
| Batch_users_1   |
| Batches         |
| Courses         |
| user            |

5 rows in set (0.01 sec)

mysql> desc Batch_users_1;

| Field    | Type    | Null | Key | Default | Extra          |
+----------+---------+------+-----+---------+----------------+
| id       | tinyint | NO   | PRI | NULL    | auto_increment |
| Batch_id | tinyint | YES  | MUL | NULL    |                |
| user_id  | tinyint | YES  | MUL | NULL    |                |
+----------+---------+------+-----+---------+----------------+
3 rows in set (0.01 sec)

mysql> INSERT INTO Batch_users_id(Batch_id,user_id) VALUES ('1','1'),('1','2'),('1','2');
ERROR 1146 (42S02): Table 'views.Batch_users_id' doesn't exist
mysql> INSERT INTO Batch_users_1 (Batch_id,user_id) VALUES ('1','1'),('1','2'),('1','2');
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Batch_courses1 (Batch_id,course_id) VALUES ('1','3'),('2','1'),('2','2'),('2','3');
ERROR 1054 (42S22): Unknown column 'course_id' in 'field list'
mysql> desc Batch_courses1;
+----------+---------+------+-----+---------+----------------+
| Field    | Type    | Null | Key | Default | Extra          |
+----------+---------+------+-----+---------+----------------+
| id       | tinyint | NO   | PRI | NULL    | auto_increment |
| Batch_id | tinyint | YES  | MUL | NULL    |                |
| user_id  | tinyint | YES  | MUL | NULL    |                |
+----------+---------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> ALTER TABLE Batch_courses1 RENAME COLUMN user_id TO course_id;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Batch_courses1 (Batch_id,course_id) VALUES ('1','3'),('2','1'),('2','2'),('2','3');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from Batch_users_1;
+----+----------+---------+
| id | Batch_id | user_id |
+----+----------+---------+
|  1 |        1 |       1 |
|  2 |        1 |       2 |
|  3 |        1 |       2 |
+----+----------+---------+
3 rows in set (0.00 sec)

mysql> select * from Batch_courses1;
+----+----------+-----------+
| id | Batch_id | course_id |
+----+----------+-----------+
|  1 |        1 |         3 |
|  2 |        2 |         1 |
|  3 |        2 |         2 |
|  4 |        2 |         3 |
+----+----------+-----------+
4 rows in set (0.00 sec)

mysql> show tables;
+-----------------+
| Tables_in_views |
+-----------------+
| Batch_courses1  |
| Batch_users_1   |
| Batches         |
| Courses         |
| user            |
+-----------------+
5 rows in set (0.01 sec)

mysql> select * from Batches;
+----+--------+
| id | name   |
+----+--------+
|  1 | batch1 |
|  2 | batch2 |
+----+--------+
2 rows in set (0.01 sec)

mysql> select * from Courses;
+----+------+
| id | name |
+----+------+
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |
+----+------+
3 rows in set (0.00 sec)

mysql> select * from user;
+----+-------+
| id | name  |
+----+-------+
|  1 | Surya |
|  2 | Dhaya |
+----+-------+
2 rows in set (0.00 sec)

mysql> SELECT user.id,Batches.name,Batches.name FROM user INNER JOIN Batches;
+----+--------+--------+
| id | name   | name   |
+----+--------+--------+
|  2 | batch1 | batch1 |
|  1 | batch1 | batch1 |
|  2 | batch2 | batch2 |
|  1 | batch2 | batch2 |
+----+--------+--------+
4 rows in set (0.00 sec)

mysql> SELECT user.id,user.name,Batches.name FROM user INNER JOIN Batches;
+----+-------+--------+
| id | name  | name   |
+----+-------+--------+
|  2 | Dhaya | batch1 |
|  1 | Surya | batch1 |
|  2 | Dhaya | batch2 |
|  1 | Surya | batch2 |
+----+-------+--------+
4 rows in set (0.00 sec)

mysql> SELECT user.id,user.name,Batches.name FROM user INNER JOIN Batches where user.id=Batches.id;
+----+-------+--------+
| id | name  | name   |
+----+-------+--------+
|  1 | Surya | batch1 |
|  2 | Dhaya | batch2 |
+----+-------+--------+
2 rows in set (0.00 sec)

mysql> insert into Batches (name) values ('Batch2');
Query OK, 1 row affected (0.01 sec)

mysql> insert into user (name) values ('Surya');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT user.id,user.name AS username,Batches.name AS batch_name FROM user INNER JOIN Batches where user.id=Batches.id;
+----+----------+------------+
| id | username | batch_name |
+----+----------+------------+
|  1 | Surya    | batch1     |
|  2 | Dhaya    | batch2     |
|  3 | Surya    | Batch2     |
+----+----------+------------+
3 rows in set (0.00 sec)

mysql> SELECT Courses.id,Courses.name AS course_name,Batches.name AS batch_name FROM Courses INNER JOIN Batches where Courses.id=Batches.id;
+----+-------------+------------+
| id | course_name | batch_name |
+----+-------------+------------+
|  1 | HTML        | batch1     |
|  2 | CSS         | batch2     |
|  3 | JS          | Batch2     |
+----+-------------+------------+
3 rows in set (0.00 sec)

mysql> SELECT Courses.id,user.name AS username,Batches.name AS batch_name FROM user JOIN Batches ON user.id=Batches.id JOIN Courses ON Courses.id=Batches.id;
+----+----------+------------+
| id | username | batch_name |
+----+----------+------------+
|  1 | Surya    | batch1     |
|  2 | Dhaya    | batch2     |
|  3 | Surya    | Batch2     |
+----+----------+------------+
3 rows in set (0.00 sec)

mysql> SELECT user.id,Courses.name AS course_name,Batches.name AS batch_name FROM user JOIN Courses where Courses.id=user.id;

mysql> INSERT INTO user (name) VALUES ('jerusheya'),('abisha'),('ruy');
Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Batches (name) VALUES ('batch1'),('batch1'),('batch1');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Courses (name) VALUES ('HTML'),('HTML'),('HTML');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from user;
+----+-----------+
| id | name      |
+----+-----------+
|  1 | Surya     |
|  2 | Dhaya     |
|  3 | Surya     |
|  4 | jerusheya |
|  5 | abisha    |
|  6 | ruy       |
+----+-----------+
6 rows in set (0.00 sec)

mysql> select * from Batches;
+----+--------+
| id | name   |
+----+--------+
|  1 | batch1 |
|  2 | batch2 |
|  3 | Batch2 |
|  4 | batch1 |
|  5 | batch1 |
|  6 | batch1 |
+----+--------+
6 rows in set (0.00 sec)

mysql> select * from Courses;
+----+------+
| id | name |
+----+------+
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |
|  4 | HTML |
|  5 | HTML |
|  6 | HTML |
+----+------+
6 rows in set (0.00 sec)


mysql> select Courses.id AS course_id,Courses.name AS course_name,Batches.id AS batch_id,Batches.name AS batch_name,user.id AS users_id,user.name AS users_name FROM user JOIN Batches ON user.id=Batches.id JOIN Courses ON user.id=Courses.id WHERE Courses.name in (select Courses.name FROM Courses where Courses.name='HTML') AND Batches.name in (select Batches.name FROM Batches WHERE Batches.name='batch1');

+-----------+-------------+----------+------------+----------+------------+
| course_id | course_name | batch_id | batch_name | users_id | users_name |
+-----------+-------------+----------+------------+----------+------------+
|         1 | HTML        |        1 | batch1     |        1 | Surya      |
|         4 | HTML        |        4 | batch1     |        4 | jerusheya  |
|         5 | HTML        |        5 | batch1     |        5 | abisha     |
|         6 | HTML        |        6 | batch1     |        6 | ruy        |
+-----------+-------------+----------+------------+----------+------------+
4 rows in set (0.00 sec)

mysql> select Courses.id AS course_id,Courses.name AS course_name,Batches.id AS batch_id,Batches.name AS batch_name,user.id AS users_id,user.name AS users_name FROM user JOIN Batches ON user.id=Batches.id JOIN Courses ON user.id=Courses.id WHERE Courses.name='HTML' AND Batches.name='batch1';
+-----------+-------------+----------+------------+----------+------------+
| course_id | course_name | batch_id | batch_name | users_id | users_name |
+-----------+-------------+----------+------------+----------+------------+
|         1 | HTML        |        1 | batch1     |        1 | Surya      |
|         4 | HTML        |        4 | batch1     |        4 | jerusheya  |
|         5 | HTML        |        5 | batch1     |        5 | abisha     |
|         6 | HTML        |        6 | batch1     |        6 | ruy        |
+-----------+-------------+----------+------------+----------+------------+
4 rows in set (0.00 sec)



