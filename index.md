## indexes:( completed )

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





