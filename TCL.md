## Transaction Control Language:( not completed yet)

### 1. COMMIT :

``` syntax
CREATE DATABASE tcl;
```
###### Query OK,1 row affected (0.01 sec)

```syntax
USE tcl;
```
###### Database changed

#### START TRANSACTION:

```syntax
START TRANSACTION;
```
###### Query Ok,0 row affected(0.00 sec)

#### SET COMMIT:

##### Default = AUTOCOMMIT

#### 1. ACTIVATE MANUAL COMMIT:

```syntax
SET AUTOCOMMIT=0;
```
###### Query Ok,0 row affected(0.00 sec)

#### 2. ACTIVATE AUTO COMMIT AGAIN:

```syntax
SET AUTOCOMMIT=1;
```
###### Query Ok,0 row affected(0.00 sec)

#### CREATE TABLE:

```syntax
CREATE TABLE table_name (name varchar(20) );
```
###### Query Ok,0 row affected(0.00 sec)

#### COMMIT:

```syntax
COMMIT;
```
###### Query Ok,0 row affected(0.00 sec)

### 2. ROLLBACK :

#### Starting Transaction :

```syntax
START TRANSACTION
```

#### Making changes and Starts commiting:

```syntax
INSERT INTO table_name VALUES ('jeru'),('sess'),('ruby'),('john');
```
###### Query Ok,4 rows affected(0.00 sec)

```syntax
COMMIT;
```
###### Query Ok,0 row affected(0.00 sec)

```syntax
SELECT * FROM table_name;
```
| name |
|:-----|
| jeru |
| sess |
| ruby |
| john |

###### Query Ok,4 row affected(0.00 sec)

```syntax
INSERT INTO table_name VALUES ('deepika');
```
###### Query Ok,4 rows affected(0.00 sec)


```syntax
SELECT * FROM table_name;
```
| name    |
|:--------|
| jeru    |
| sess    |
| ruby    |
| john    |
| deepika |

###### Query Ok,5 row affected(0.00 sec)


### Rollback :
#### only rollback if committed the information;

```syntax
ROLLBACK;
```
###### Query Ok,0 row affected(0.00 sec)

```syntax
SELECT * FROM table_name;
```
| name |
|:-----|
| jeru |
| sess |
| ruby |
| john |

###### Query Ok,4 row affected(0.00 sec)

### 3. SAVEPOINT:

```syntax
INSERT INTO table_name VALUES ('aarthy');
```

```syntax
SAVEPOINT A;
```













