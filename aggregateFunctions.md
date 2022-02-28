## Aggregate functions:( completed )

### table prepared:
```syntax
SELECT * FROM practice;
```

| id | name        | age | place       |  grade  |
|:---|:------------|:----|:------------|:--------|
| 1  | jerusheya   | 19  | tirunelveli | good    |
| 2  | abi         | 19  | tirunelveli | good    |
| 3  | swetha      | 17  | madurai     | good    |
| 4  | saranya     | 17  | tirunelveli | good    |
| 5  | haiden      | 19  | tirunelveli | good    |
| 6  | annamalai   | 18  | madurai     | good    |
| 7  | aswath      | 17  | chennai     | good    |
| 8  | riyaz       | 19  | tirunelveli | good    |
| 9  | selva       | 18  | chennai     | good    |
| 10 | santhanu    | 19  | theni       | good    |
| 11 | rishi       | 19  | theni       | good    |

###### 11 rows selected in set(0.00 sec)

### 1. SUM
  
```syntax
SELECT SUM(age) FROM practice;
```
| SUM(age) |
|:---------|
| 200      |

###### 1 row selected in set (0.00 sec)

```syntax
SELECT place,SUM(age) AS sum_age FROM practice GROUP BY place;
```
| place         | sum_age |
|:--------------|:--------|
| tirunelveli   |    92   |
| madurai       |    35   |
| chennai       |    35   |
| theni         |    38   |

###### 4 rows selected in set (0.00 sec)

```syntax
SELECT place,SUM(age) AS sum_age FROM practice GROUP BY place HAVING sum(age)>35;
```
| place         | sum_age |
|:--------------|:--------|
| tirunelveli   |   92    |
| theni         |   38    |

###### 2 rows selected in set (0.00 sec)

### 2. AVERAGE 

```syntax
SELECT AVG(age) FROM practice;
```
| AVG(age)|
|:--------|
| 18.1818 |

###### 1 row selected in set (0.00 sec)

### 3. MINIMUM

```syntax
SELECT MIN(age) FROM practice;
```
| MIN(age) |
|:---------|
|    17    |

###### 1 row selected in set (0.00 sec)

### 4. MAXIMUM

```syntax
SELECT MAX(age) FROM practice;
```
| MAX(age) |
|:---------|
|   19     |

###### 1 row selected in set (0.00 sec)

### 5. COUNT 

```syntax
SELECT COUNT(*) AS no_of_records FROM practice;
```
| no_of_records |
|:--------------|
|     11        |

###### 1 row selected in set (0.00 sec)

```syntax
SELECT COUNT(age) FROM practice WHERE age>=18;
```
| COUNT(age) |
|:-----------|
|    8       |

###### 1 row selected in set (0.00 sec)

```syntax
SELECT COUNT(DISTINCT place) AS distinct_places FROM practice;
```
| distinct_places |
|:----------------|
|      4          |

###### 1 row selected in set (0.00 sec)


```syntax
SELECT place,COUNT(*) FROM practice GROUP BY place HAVING COUNT(*)>3;
```
| place       | COUNT(*) |
|:------------|:---------|
| tirunelveli |     5    |

###### 1 row selected in set (0.00 sec)

### 6. DISTINCT 

```syntax
SELECT age FROM practice;
```
| age |
|:----|
|  19 |
|  18 |
|  17 |
|  17 |
|  19 |
|  18 |
|  17 |
|  19 |
|  18 |
|  19 |
|  19 |

###### 11 rows in set (0.00 sec)

```syntax
SELECT DISTINCT age FROM practice;
```
| age |
|:----|
|  19 |
|  18 |
|  17 |

###### 3 rows in set (0.00 sec)
