# constraints:( completed )

## MySQL Constraints:

### 1.NOT NULL

```syntax
 CREATE TABLE constraints(name varchar(20) NOT NULL);
```
###### not null - doesnot allow null

### 2.UNIQUE

```syntax
 CREATE TABLE constraints(email varchar(60) UNIQUE);
```
###### unique - every values should be unique, does not allow repitition but allows null for infinite times

### 3.DEFAULT

```syntax
CREATE TABLE constraints(class tinyint(2) DEFAULT '12');
```
###### default - fixes a particular value as default

### 4.CHECK

```syntax
CREATE TABLE constraints(age int(2) NOT NULL, CHECK(age>=16));
```
###### check - checks a particular condition

### 5.PRIMARY KEY

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

### 6.FOREIGN KEY

```syntax
CREATE TABLE foreignkey(studID int PRIMARY KEY AUTO_INCREMENT, 10th_mark int(3), Employee_ID int, FOREIGN KEY(Employee_ID) REFERENCES constraints(Id));
```
(or)

##### usage of constraint constraint_name --> can be used when deleting the constraint.
##### usage of ON DELETE CASCADE, ON UPDATE CASCADE --> deletes and updates data in child table also.

```syntax
CREATE TABLE foreignkey(studID int PRIMARY KEY AUTO_INCREMENT, 10th_mark int(3), Employee_ID int,CONSTRAINT fk_id FOREIGN KEY(Employee_ID) REFERENCES constraints(Id) ON DELETE CASCADE ON UPDATE CASCADE);
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


### DELETING A CONSTRAINT:

```syntax
ALTER TABLE table_name DROP CONSTRAINT constraint_name;
```
###### eg : ALTER TABLE table_name DROP FOREIGN KEY fk_id;