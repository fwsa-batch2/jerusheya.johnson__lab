# Database-and-Mysql-Practice

### 1. MySQL:

![creating](https://user-images.githubusercontent.com/93571037/153547784-3e510350-85fb-4c4d-95e9-09194a4f6626.png)


### 2. create and show database:

```syntax
CREATE DATABASE database_name;
SHOW DATABASES;
```

![create_database](https://user-images.githubusercontent.com/93571037/153418644-b017819a-c423-4c32-8061-213c4115106a.png)

### 3. Deleting a database;

```syntax 
DROP DATABASE database_name;
```

![Drop_database](https://user-images.githubusercontent.com/93571037/153636426-5b21f1f2-1e61-423b-9a32-c54aa3432bb2.png)

### 4. Use database:

```syntax
USE database_name;
```

![use_database](https://user-images.githubusercontent.com/93571037/153546844-5a578393-e4e9-49db-9159-47638cebf728.png)

### 5. Show available tables:

```syntax
SHOW TABLES;
```

![show_table](https://user-images.githubusercontent.com/93571037/153547632-c9948cc6-962c-46e7-80c5-d1fc1b3d5c57.png)

### 6. Creating a table:

```syntax
CREATE TABLE table_name ( column_name datatype extra_info, 2nd column_name datatype extra_info,...);
```

![create_table](https://user-images.githubusercontent.com/93571037/153548997-addf3bb8-752c-42a2-9699-cd50f50fef47.png)

### 7. describing the nature of table created:

```syntax 
DESC|DESCRIBE table_name;
```

![desc_table](https://user-images.githubusercontent.com/93571037/153642030-93e9eb9f-d6a8-4ecf-b513-86b91a8f2c1d.png)

### 8. Inserting values into a table:

```syntax
INSERT INTO table_name(column_name1,column_name2,column_name3,..) VALUES (values of row1),(values of row2)...
```

![insert into tech](https://user-images.githubusercontent.com/93571037/153634869-86ae8816-25e1-4455-b7d3-3e594e021bc8.png)

### 9. Altering a table:

#### * adding a column:

```syntax
ALTER TABLE table_name ADD column_name datatype [FIRST|AFTER column_name];
```

![add_column](https://user-images.githubusercontent.com/93571037/153637595-839b4171-e451-4177-a5f3-ba076ea88b02.png)

#### * adding multiple columns:

```syntax
ALTER TABLE table_name 
ADD column_name datatype [AFTER|FIRST column_name]
ADD column_name datatype [AFTER|FIRST column_name]...

#### * renaming a column:

```syntax 
ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;
```

![rename_column](https://user-images.githubusercontent.com/93571037/153638091-f0e170c4-46db-4b84-89f5-92b904cb5512.png)

#### * changing a column or renaming (another method):

```syntax
ALTER TABLE table_name CHANGE COLUMN old_column_name new_column_name;
```

![rename_2nd_method](https://user-images.githubusercontent.com/93571037/153638457-5e9a417d-f180-4c33-ad87-1cefdf15c4f1.png)

#### * Changing a column's nature/modifying a table:

```syntax
ALTER TABLE table_name MODIFY column_name new_informations;
```

![alter_modify](https://user-images.githubusercontent.com/93571037/153639856-78055f06-b4bc-48c8-b583-d0a8e9dfecfd.png)

#### * Deleting a column from a table:

```syntax
ALTER TABLE table_name DROP COLUMN column_name;
```

![drop_column](https://user-images.githubusercontent.com/93571037/153640849-caacab23-e50b-4e4e-9b31-9face3337ef1.png)

#### * Renaming a table;

```syntax
ALTER TABLE table_name RENAME TO new_table_name;
```

![rename_table](https://user-images.githubusercontent.com/93571037/153641479-0eca5bc9-0237-4e50-a6e3-6490f2c0105f.png)

### 10. Updating data inside a table:

```syntax
UPDATE table_name SET column_1= 'value', column_2= 'value' WHERE condition;
```

![updat](https://user-images.githubusercontent.com/93571037/153643597-c9cbb7e8-d2a7-45f1-a014-b4691a18f476.png)

### 11. Deleting a data from table(deletes a row);

```syntax
DELETE FROM table_name WHERE condition;
```

![delete_data](https://user-images.githubusercontent.com/93571037/153644757-df24c6d8-9448-4908-ab96-60ddb94a5633.png)

### 12. Select
#### Selecting complete data from a table:

```syntax
SELECT * FROM table_name;
```

![select_*](https://user-images.githubusercontent.com/93571037/153699399-fb16e5a7-0500-4371-ac41-3e465767ff07.png)

#### Selecting a particular data from a table:

```syntax
SELECT column_name FROM table_name WHERE condition;
```

![select_particular](https://user-images.githubusercontent.com/93571037/153699469-2de13281-4c78-4b0b-8423-72869dba838c.png)


### 14.Aggregate FUnctions:

#### * sum:

##### sum(all):

```syntax
SELECT SUM(column_name) FROM  table_name;
```

![sum (1)](https://user-images.githubusercontent.com/93571037/153700568-3240856a-9212-4f3a-9855-9d77bb4e151d.png)

##### sum with where;

```syntax
SELECT SUM(column_name) FROM table_name WHERE condition;
```

![sum_where](https://user-images.githubusercontent.com/93571037/153703253-4fa94cea-1c5b-4466-8837-f6c91ed682a5.png)

##### sum with having:

```syntax
SELECT SUM(column_name) FROM table_name HAVING sum(column_name)=>5;
```

![sum_having](https://user-images.githubusercontent.com/93571037/153704172-04498016-084e-43ac-a047-ba97f357dbba.png)

##### sum with Group BY:

```syntax
SELECT SUM(column_name) FROM table_name GROUP BY column_name;
```

![sum_groupby](https://user-images.githubusercontent.com/93571037/153704270-c8fe121a-8c7c-4e2f-9563-2ee1de16fb53.png)


#### * Average

```syntax
SELECT AVG(column_name) FROM table_name;
```

![avg](https://user-images.githubusercontent.com/93571037/153720776-5a1cf979-06fc-4a69-9dff-9c50bf3751ea.png)

#### * Maximum

```syntax
SELECT MAX(column_name) FROM table_name;
```

![max](https://user-images.githubusercontent.com/93571037/153720824-0c591524-e38c-47a9-8e8a-701c6d7a093b.png)

#### * Minimum 

```syntax
SELECT MIN(column_name) FROM table_name;
```

![min()](https://user-images.githubusercontent.com/93571037/154108721-e7563570-94e8-4226-91b1-ae54e1df7335.png)

#### * COUNT 

```syntax 
SELECT COUNT(*/column_name) FROM table_name conditon(if needed);
```

![count*](https://user-images.githubusercontent.com/93571037/154109208-0a6e481c-d7f4-44f9-a7f2-7e31d081e95d.png)

#### * Distinct

```syntax
SELECT DISNTICT column_name FROM table_name;
```

![distinct](https://user-images.githubusercontent.com/93571037/154109374-856d146e-bcb0-4a1e-9117-79c005cfcbc3.png)


### 15. JOINS

#### * INNER JOIN:

```syntax 
SELECT <select_list> FROM table1 INNER JOIN table2 ON condition;
```











