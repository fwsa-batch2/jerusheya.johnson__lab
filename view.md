mysql> show databases;
+--------------------+
| Database           |
+--------------------+
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
+--------------------+
12 rows in set (0.01 sec)

mysql> use constraints;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select * from practice;
+----+-----------+-----+-------------+-------+
| id | name      | age | place       | grade |
+----+-----------+-----+-------------+-------+
|  1 | jeru      |  19 | tirunelveli | good  |
|  2 | abi       |  18 | tirunelveli | good  |
|  3 | swetha    |  17 | madurai     | good  |
|  4 | saranya   |  17 | tirunelveli | good  |
|  5 | haiden    |  20 | tirunelveli | good  |
|  6 | annamalai |  18 | madurai     | good  |
|  7 | aswath    |  17 | chennai     | good  |
|  8 | riyaz     |  19 | tirunelveli | good  |
|  9 | selva     |  18 | chennai     | good  |
| 10 | santhanu  |  19 | theni       | good  |
| 11 | rishi     |  19 | theni       | good  |
+----+-----------+-----+-------------+-------+
11 rows in set (0.00 sec)

mysql> CREATE VIEW view_name AS 
    -> SELECT name,age
    -> FROM practice 
    -> WHERE age>17;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT * FROM view_name;
+-----------+-----+
| name      | age |
+-----------+-----+
| jeru      |  19 |
| abi       |  18 |
| haiden    |  20 |
| annamalai |  18 |
| riyaz     |  19 |
| selva     |  18 |
| santhanu  |  19 |
| rishi     |  19 |
+-----------+-----+
8 rows in set (0.01 sec)

mysql> CREATE VIEW view_name AS SELECT name,age FROM practice  WHERE age=19;
ERROR 1050 (42S01): Table 'view_name' already exists
mysql> CREATE OR REPLACE VIEW view_name AS SELECT name,age FROM practice  WHERE age=19;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT * FROM view_name;
+----------+-----+
| name     | age |
+----------+-----+
| jeru     |  19 |
| riyaz    |  19 |
| santhanu |  19 |
| rishi    |  19 |
+----------+-----+
4 rows in set (0.00 sec)

mysql> RENAME TABLE view_name TO practice_age_view;
Query OK, 0 rows affected (0.02 sec)

