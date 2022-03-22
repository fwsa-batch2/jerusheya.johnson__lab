### views:

```syntax
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

###### 12 rows in set (0.01 sec)

```syntax
use constraints;
```

###### Database changed
```syntax
select * from practice;
```

| id | name      | age | place       | grade |
|:---|:----------|:----|:------------|:------|
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

###### 11 rows in set (0.00 sec)

#### 1. create view:

```syntax
CREATE VIEW view_name AS SELECT name,age FROM practice WHERE age>17;
```

###### Query OK, 0 rows affected (0.01 sec)

```syntax
SELECT * FROM view_name;
```

| name      | age |
|:----------|:----|
| jeru      |  19 |
| abi       |  18 |
| haiden    |  20 |
| annamalai |  18 |
| riyaz     |  19 |
| selva     |  18 |
| santhanu  |  19 |
| rishi     |  19 |

###### 8 rows in set (0.01 sec)

#### 2. replace view:

```syntax
CREATE OR REPLACE VIEW view_name AS SELECT name,age FROM practice  WHERE age=19;
```
###### Query OK, 0 rows affected (0.01 sec)

```syntax
SELECT * FROM view_name;
```

| name     | age |
|:---------|:----|
| jeru     |  19 |
| riyaz    |  19 |
| santhanu |  19 |
| rishi    |  19 |

###### 4 rows in set (0.00 sec)

#### 3. rename a view:

```syntax
RENAME TABLE view_name TO practice_age_view;
```
###### Query OK, 0 rows affected (0.02 sec)

```syntax
CREATE TABLE practice_model (id int,name varchar(20),age int,place varchar(20),grade varchar(8));
```
###### Query OK, 0 rows affected (0.05 sec)

#### 4. insert into view:

```syntax
INSERT INTO practice_model VALUES('1','jerusheya','19','tirunelveli','good');
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
INSERT INTO practice_model VALUES('2','abisha','19','tirunelveli','good');
```
###### Query OK, 1 row affected (0.00 sec)

```syntax
INSERT INTO practice_model VALUES('3','suguram','19','tirunelveli','good');
```
###### Query OK, 1 row affected (0.00 sec)

```syntax
SELECT * FROM practice_model;
```

| id   | name      | age  | place       | grade |
|:-----|:----------|:-----|:------------|:------|
|    1 | jerusheya |   19 | tirunelveli | good  |
|    2 | abisha    |   19 | tirunelveli | good  |
|    3 | suguram   |   19 | tirunelveli | good  |

###### 3 rows in set (0.00 sec)

#### 5. delete from view:

```syntax
DELETE FROM practice_model WHERE id=2;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
SELECT * FROM practice_model;
```

| id   | name      | age  | place       | grade |
|:-----|:----------|:-----|:------------|:------|
|    1 | jerusheya |   19 | tirunelveli | good  |
|    3 | suguram   |   19 | tirunelveli | good  |

###### 2 rows in set (0.00 sec)

#### 6. remove default from a base table:

```syntax
ALTER TABLE practice ALTER grade DROP default;
```

###### Query OK, 0 rows affected (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

#### 7. drop a view:

```syntax
SHOW FULL TABLES WHERE table_type='VIEW';
```
| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| age_more_17           | VIEW       |
| practice_age          | VIEW       |
| practice_age_view     | VIEW       |
| view_1                | VIEW       |

###### 4 rows in set (0.00 sec)

```syntax
drop view practice_age_view;
```

###### Query OK, 0 rows affected (0.01 sec)

#### 8. find table type:

```syntax
SHOW FULL TABLES WHERE table_type='VIEW';
```

| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| age_more_17           | VIEW       |
| practice_age          | VIEW       |
| view_1                | VIEW       |

###### 3 rows in set (0.01 sec)

```syntax
SHOW FULL TABLES WHERE table_type!='VIEW';
```

| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| foreign_practice      | BASE TABLE |
| foreign_practice1     | BASE TABLE |
| foreignkey_table      | BASE TABLE |
| practice              | BASE TABLE |
| practice_model        | BASE TABLE |

###### 5 rows in set (0.00 sec)

```syntax
SHOW FULL TABLES WHERE table_type!='BASE TABLE';
```

| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| age_more_17           | VIEW       |
| practice_age          | VIEW       |
| view_1                | VIEW       |

###### 3 rows in set (0.01 sec)

```syntax
SHOW FULL TABLES WHERE table_type='BASE TABLE';
```

| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| foreign_practice      | BASE TABLE |
| foreign_practice1     | BASE TABLE |
| foreignkey_table      | BASE TABLE |
| practice              | BASE TABLE |
| practice_model        | BASE TABLE |

###### 5 rows in set (0.01 sec)

#### 9. creating view using multiple tables/join 2 tables using view:

```
SHOW FULL TABLES WHERE table_type='BASE TABLE';
```

| Tables_in_constraints | Table_type |
|:----------------------|:-----------|
| foreign_practice      | BASE TABLE |
| foreign_practice1     | BASE TABLE |
| foreignkey_table      | BASE TABLE |
| practice              | BASE TABLE |
| practice_model        | BASE TABLE |

###### 5 rows in set (0.01 sec)

```syntax
 CREATE OR REPLACE VIEW practice_view AS SELECT user.id,user.name AS user_name,Courses.name AS Course_name FROM user,Courses WHERE user.id=Courses.id;
 ```
###### Query OK, 0 rows affected (0.01 sec)

```syntax
SELECT * FROM practice_view;
```

| id | user_name | Course_name |
|:---|:----------|:------------|
|  1 | Surya     | HTML        |
|  2 | Dhaya     | CSS         |
|  3 | Surya     | JS          |
|  4 | jerusheya | HTML        |
|  5 | abisha    | HTML        |
|  6 | ruy       | HTML        |

###### 6 rows in set (0.00 sec)







