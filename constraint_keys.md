# constraints:

## MySQL Constraints:

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
CREATE TABLE foreignkey(studID int PRIMARY KEY AUTO_INCREMENT, 10th_mark int(3), ID int, FOREIGN KEY(Id) REFERENCES constraints(Id));
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
### INSERT INTO

```syntax
INSERT INTO foreignkey(mark,PersonId) VALUES (100,1);
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC foreignkey;
```

| Field  | Type | Null | Key | Default | Extra |
|:-------|:-----|:-----|:---:|:--------|:------|
| studId | int  | NO   | PRI | NULL    |       |
| mark   | int  | YES  |     | NULL    |       |
| Id     | int  | YES  | MUL | NULL    |       |

###### 3 rows in set (0.00 sec)
### SELECT

```syntax
SELECT * FROM foreignkey;
```
| studId | mark | PersonId |
|:-------|:-----|:---------|
|      1 |  100 |        1 |

###### 1 row in set (0.01 sec)
*  *  *


