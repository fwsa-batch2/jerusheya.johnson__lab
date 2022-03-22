### CASE STATEMENT: 


```syntax
CASE 
WHEN condition1 THEN result1
WHEN condition2 THEN result2
WHEN conditionn THEN resultn
ELSE other_result
END;
```
###### (conditions should be based on base_column)

```syntax
mysql> CREATE DATABASE case_when;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
mysql> use case_when;
```
###### database changed

```syntax
mysql> CREATE TABLE Customers (customer_id tinyint PRIMARY KEY AUTO_INCREMENT, customer_name varchar(20) NOT NULL, gender varchar(2) NOT NULL,product varchar(20) NOT NULL, payment int(5) NOT NULL, rate tinyint(1), rating varchar(100),check ( gender in ('M','F')));
```
###### Query OK, 0 rows affected, 2 warnings (0.05 sec)

```syntax
mysql> SELECT * FROM Customers;
```

| customer_id | customer_name | gender | product     | payment | rate | rating |
|:------------|:--------------|:-------|:------------|:--------|:-----|:-------|
|           1 | Jerusheya     | F      | Television  |   12000 |    4 | NULL   |
|           2 | Bala          | M      | MobilePhone |    8000 |    3 | NULL   |
|           3 | Aarthy        | F      | Cooker      |    5000 |    4 | NULL   |
|           4 | Guru          | M      | Bike        |   20000 |    5 | NULL   |
|           5 | Sindhu        | F      | Motorcycle  |   10000 |    2 | NULL   |
|           6 | Ashok         | M      | Bed         |   15000 |    3 | NULL   |

###### 6 rows in set (0.00 sec)

### 1.CASE WHEN USING SELECT :

#### CASE WHEN WITH CONDITION:

```syntax
SELECT column(s) 
CASE WHEN condition(1) THEN 'result(1)'
CASE WHEN condition(n) THEN 'result(n)'
ELSE result
END
FROM table_name;
```

```syntax
mysql> SELECT customer_id,customer_name, CASE WHEN payment<10000 THEN 'payment is less than 10000' WHEN payment>10000 THEN 'payment is greater than 10000' ELSE 'payment is equal to 10000' END AS payment_text FROM Customers;
```

| customer_id | customer_name | payment_text                  |
|:------------|:--------------|:------------------------------|
|           1 | Jerusheya     | payment is greater than 10000 |
|           2 | Bala          | payment is less than 10000    |
|           3 | Aarthy        | payment is less than 10000    |
|           4 | Guru          | payment is greater than 10000 |
|           5 | Sindhu        | payment is equal to 10000     |
|           6 | Ashok         | payment is greater than 10000 |

###### 6 rows in set (0.00 sec)

#### CASE WHEN WITH VALUES;

```syntax
SELECT column(s) 
CASE base_column
WHEN 'value(1)' THEN 'result(1)'
WHEN 'value(n)' THEN 'result(n)'
ELSE result
END
FROM table_name;
```

```syntax
mysql> SELECT customer_id,customer_name, CASE gender WHEN 'M' THEN 'Male' WHEN 'F' THEN 'Female' END AS payment_text FROM Customers;
```

| customer_id | customer_name | payment_text |
|:------------|:--------------|:-------------|
|           1 | Jerusheya     | Female       |
|           2 | Bala          | Male         |
|           3 | Aarthy        | Female       |
|           4 | Guru          | Male         |
|           5 | Sindhu        | Female       |
|           6 | Ashok         | Male         |

###### 6 rows in set (0.00 sec)

### 2. CASE WHEN USING UPDATE:

```syntax
UPDATE table_name
SET column_name =
CASE
WHEN condition1 THEN 'result1' 
WHEN condition2 THEN 'result2'
ELSE 'result'
END;
```

```syntax
mysql> UPDATE Customers SET rating=CASE WHEN rate<3 THEN 'Satisfactory' WHEN rate=3 THEN 'very good' WHEN rate>3 THEN 'excellent' ELSE 'okay' END;
```

###### Query OK, 6 rows affected (0.01 sec)
###### Rows matched: 6  Changed: 6  Warnings: 0

```syntax
mysql> SELECT * FROM Customers;
```

| customer_id | customer_name | gender | product     | payment | rate | rating       |
|:------------|:--------------|:-------|:------------|:--------|:-----|:-------------|
|           1 | Jerusheya     | F      | Television  |   12000 |    4 | excellent    |
|           2 | Bala          | M      | MobilePhone |    8000 |    3 | very good    |
|           3 | Aarthy        | F      | Cooker      |    5000 |    4 | excellent    |
|           4 | Guru          | M      | Bike        |   20000 |    5 | excellent    |
|           5 | Sindhu        | F      | Motorcycle  |   10000 |    2 | Satisfactory |
|           6 | Ashok         | M      | Bed         |   15000 |    3 | very good    |

###### 6 rows in set (0.01 sec)

