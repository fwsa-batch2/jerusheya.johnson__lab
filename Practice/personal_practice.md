
```syntax
CREATE DATABASE personl_practice;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
USE personl_practice;
```
###### Database changed

#### 1. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id.

```syntax
CREATE TABLE countries (country_id int,country_name varchar(20),region_id int);
```

###### Query OK, 0 rows affected (0.04 sec)

#### 2. Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id which is already exists.

##### if not exists-just check whether the table already exists or not then create a table

```syntax
CREATE TABLE countries (country_id int,country_name varchar(20),region_id int);
```
###### ERROR 1050 (42S01): Table 'countries' already exists

```syntax
CREATE TABLE countries if not exists(country_id int,country_name varchar(20),region_id int);
```
###### Query OK, 0 rows affected (0.04 sec)

#### 3. Write a SQL statement to create the structure of a table dup_countries similar to countries.

##### 1st method: create table table_name like other_table_name: creates a duplicate table.

```syntax
 CREATE TABLE dup_countries LIKE countries;
 ```

###### Query OK, 0 rows affected (0.05 sec)

```syntx
DESC countries;
```

| Field        | Type        | Null | Key | Default | Extra |
|:-------------|:------------|:-----|:----|:--------|:------|
| country_id   | int         | YES  |     | NULL    |       |
| country_name | varchar(20) | YES  |     | NULL    |       |
| region_id    | int         | YES  |     | NULL    |       |

###### 3 rows in set (0.01 sec)

```syntax
DESC dup_countries;
```

| Field        | Type        | Null | Key | Default | Extra |
|:-------------|:------------|:-----|:----|:--------|:------|
| country_id   | int         | YES  |     | NULL    |       |
| country_name | varchar(20) | YES  |     | NULL    |       |
| region_id    | int         | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

##### 2nd method: CREATE TABLE table_name AS SELECT * FROM old_table_name: duplicates table.

```syntx
CREATE TABLE dup_countries1 AS SELECT * FROM countries;
```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```syntax
DESC dup_countries1;
```

| Field        | Type        | Null | Key | Default | Extra |
|:-------------|:------------|:-----|:----|:--------|:------|
| country_id   | int         | YES  |     | NULL    |       |
| country_name | varchar(20) | YES  |     | NULL    |       |
| region_id    | int         | YES  |     | NULL    |       |

###### 3 rows in set (0.01 sec)


#### 4. join a base table and a view table:


```syntax
SELECT user.name,practice_view.Course_name FROM user INNER JOIN practice_view ON user.id=practice_view.id;
```

| name      | Course_name |
|:----------|:------------|
| Surya     | HTML        |
| Dhaya     | CSS         |
| Surya     | JS          |
| jerusheya | HTML        |
| abisha    | HTML        |
| ruy       | HTML        |

###### 6 rows in set (0.00 sec)

```syntax
SELECT user.name,practice_view.Course_name FROM user INNER JOIN practice_view USING(id);
```

| name      | Course_name |
|:----------|:------------|
| Surya     | HTML        |
| Dhaya     | CSS         |
| Surya     | JS          |
| jerusheya | HTML        |
| abisha    | HTML        |
| ruy       | HTML        |

###### 6 rows in set (0.00 sec)


