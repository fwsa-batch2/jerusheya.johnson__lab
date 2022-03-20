#### 1. Insert into User_Detail :
```select
INSERT INTO User_Detail VALUES (2,'Oliver white','oliverwhite234@gmail.com','9898877665','oliverwhite@234'),(3,'Noah Roberts','noahroberts345@gmail.com','8765432109','noahroberts@345'),(4,'Olivia
Jackson','oliviajackson456@gmail.com','7654321098','oliviajackson@456'),(5,'Ava Smith','avasmith567@gmail.com','9999966666','avasmith@567');
```
###### ERROR 1264 (22003): Out of range value for column 'Phone_NO' at row 1
##### Shows error because the datatype of phone_no is int.

##### alter the column Phone_NO :

```syntax
ALTER TABLE User_Detail MODIFY Phone_NO bigint UNIQUE NOT NULL;
```
###### Query OK, 1 row affected, 1 warning (0.17 sec)
###### Records: 1  Duplicates: 0  Warnings: 1

```syntax
INSERT INTO User_Detail VALUES (2,'Oliver white','oliverwhite234@gmail.com','9898877665','oliverwhite@234'),(3,'Noah Roberts','noahroberts345@gmail.com','8765432109','noahroberts@345'),(4,'Olivia
Jackson','oliviajackson456@gmail.com','7654321098','oliviajackson@456'),(5,'Ava Smith','avasmith567@gmail.com','9999966666','avasmith@567');
```
###### Query OK, 4 rows affected (0.01 sec)
###### Records: 4  Duplicates: 0  Warnings: 0


```syntax
SELECT * FROM Ticket_Payment;
```

| Payment_ID | Ticket_ID | Cardholder_Name  | Acccount_NO       | Total_Amount | Transaction_Date | Mode_Of_Payment |
|:-----------|:----------|:-----------------|:------------------|:-------------|:-----------------|:----------------|
|          1 |         1 | James Williams   |  2345678923456789 | Rs.20,000    | 2022-01-02       | Gpay            |
|          2 |         2 | Noah Roberts     |  2783456729383746 | Rs.50,000    | 2022-03-19       | NetBanking      |
|          3 |         3 | Ava Smith        |  8765432198765432 | Rs.30,000    | 2022-05-23       | Cash            |
|          4 |         4 | Johnson          |  8394859282938472 | Rs.40,000    | 2022-02-13       | Gpay            |
|          5 |         1 | James Williams   |  2345678923456789 | Rs.30,000    | 2022-03-13       | Gpay            |
|          6 |         5 | Shruthi hasan    | 74635267183726384 | Rs.50,000    | 2022-03-09       | Cash            |
|          7 |         3 | Ava Smith        |  8765432198765432 | Rs.20,000    | 2022-06-01       | Cash            |
|          8 |         6 | Juliet           |  7834783489239012 | Rs.40,000    | 2022-06-09       | NetBanking      |
|          9 |         7 | Daphne Christina |  2345345645675678 | Rs.20,000    | 2022-04-04       | Gpay            |
|         10 |         4 | Johnson          |  8394859282938472 | Rs.10,000    | 2022-03-24       | Gpay            |
|         11 |         6 | Juliet           |  7834783489239012 | Rs.10,000    | 2022-07-01       | NetBanking      |
|         12 |         7 | Daphne Christina |  2345345645675678 | Rs.30,000    | 2022-05-03       | Gpay            |

###### 12 rows in set (0.00 sec)

```syntax
UPDATE Ticket_Payment SET Acccount_NO='7463727282917256' WHERE Payment_ID=6;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM Ticket_Payment;
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
| Payment_ID | Ticket_ID | Cardholder_Name  | Acccount_NO      | Total_Amount | Transaction_Date | Mode_Of_Payment |
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
|          1 |         1 | James Williams   | 2345678923456789 | Rs.20,000    | 2022-01-02       | Gpay            |
|          2 |         2 | Noah Roberts     | 2783456729383746 | Rs.50,000    | 2022-03-19       | NetBanking      |
|          3 |         3 | Ava Smith        | 8765432198765432 | Rs.30,000    | 2022-05-23       | Cash            |
|          4 |         4 | Johnson          | 8394859282938472 | Rs.40,000    | 2022-02-13       | Gpay            |
|          5 |         1 | James Williams   | 2345678923456789 | Rs.30,000    | 2022-03-13       | Gpay            |
|          6 |         5 | Shruthi hasan    | 7463727282917256 | Rs.50,000    | 2022-03-09       | Cash            |
|          7 |         3 | Ava Smith        | 8765432198765432 | Rs.20,000    | 2022-06-01       | Cash            |
|          8 |         6 | Juliet           | 7834783489239012 | Rs.40,000    | 2022-06-09       | NetBanking      |
|          9 |         7 | Daphne Christina | 2345345645675678 | Rs.20,000    | 2022-04-04       | Gpay            |
|         10 |         4 | Johnson          | 8394859282938472 | Rs.10,000    | 2022-03-24       | Gpay            |
|         11 |         6 | Juliet           | 7834783489239012 | Rs.10,000    | 2022-07-01       | NetBanking      |
|         12 |         7 | Daphne Christina | 2345345645675678 | Rs.30,000    | 2022-05-03       | Gpay            |
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
12 rows in set (0.00 sec)

mysql> ALTER TABLE Ticket_Payment RENAME Acccount_NO TO Account_NO;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'TO Account_NO' at line 1
mysql> ALTER TABLE Ticket_Payment RENAME COLUMN Acccount_NO TO Account_NO;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM Ticket_Payment;
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
| Payment_ID | Ticket_ID | Cardholder_Name  | Account_NO       | Total_Amount | Transaction_Date | Mode_Of_Payment |
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
|          1 |         1 | James Williams   | 2345678923456789 | Rs.20,000    | 2022-01-02       | Gpay            |
|          2 |         2 | Noah Roberts     | 2783456729383746 | Rs.50,000    | 2022-03-19       | NetBanking      |
|          3 |         3 | Ava Smith        | 8765432198765432 | Rs.30,000    | 2022-05-23       | Cash            |
|          4 |         4 | Johnson          | 8394859282938472 | Rs.40,000    | 2022-02-13       | Gpay            |
|          5 |         1 | James Williams   | 2345678923456789 | Rs.30,000    | 2022-03-13       | Gpay            |
|          6 |         5 | Shruthi hasan    | 7463727282917256 | Rs.50,000    | 2022-03-09       | Cash            |
|          7 |         3 | Ava Smith        | 8765432198765432 | Rs.20,000    | 2022-06-01       | Cash            |
|          8 |         6 | Juliet           | 7834783489239012 | Rs.40,000    | 2022-06-09       | NetBanking      |
|          9 |         7 | Daphne Christina | 2345345645675678 | Rs.20,000    | 2022-04-04       | Gpay            |
|         10 |         4 | Johnson          | 8394859282938472 | Rs.10,000    | 2022-03-24       | Gpay            |
|         11 |         6 | Juliet           | 7834783489239012 | Rs.10,000    | 2022-07-01       | NetBanking      |
|         12 |         7 | Daphne Christina | 2345345645675678 | Rs.30,000    | 2022-05-03       | Gpay            |
+------------+-----------+------------------+------------------+--------------+------------------+-----------------+
12 rows in set (0.00 sec)
