
### 3. Inserting values into tables:

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
SELECT * FROM User_Detail;
```

| User_ID | UserName       | Email                      | Phone_NO   | Password          |
|:--------|:---------------|:---------------------------|:-----------|:------------------|
|       1 | James Williams | jameswilliams123@gmail.com | 1234567891 | james@123         |
|       2 | Oliver white   | oliverwhite234@gmail.com   | 9898877665 | oliverwhite@234   |
|       3 | Noah Roberts   | noahroberts345@gmail.com   | 8765432109 | noahroberts@345   |
|       4 | Olivia Jackson | oliviajackson456@gmail.com | 7654321098 | oliviajackson@456 |
|       5 | Ava Smith      | avasmith567@gmail.com      | 9999966666 | avasmith@567      |

###### 5 rows in set (0.00 sec)

```syntax
INSERT INTO User_Detail VALUES (6,'Robinson','robinson678@gmail.com','8898877665','robinson@678'),(7,'Johnson','johnson898@gmail.com','8765432898','johnson@898'),(8,'Shruthihasan','shrithihasan654@gmail.com','7654378998','sruthihasan@654'),(9,'Juliet','juliet23456@gmail.com','9967896666','juliet@23456'),(10,'Daphne Christina','daphnechristina@2002gmail.com','9363232559','daphne@christina');
```

###### Query OK, 5 rows affected (0.01 sec)
###### Records: 5  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM User_Detail;
```

| User_ID | UserName         | Email                         | Phone_NO   | Password          |
|:--------|:-----------------|:------------------------------|:-----------|:------------------|
|       1 | James Williams   | jameswilliams123@gmail.com    | 1234567891 | james@123         |
|       2 | Oliver white     | oliverwhite234@gmail.com      | 9898877665 | oliverwhite@234   |
|       3 | Noah Roberts     | noahroberts345@gmail.com      | 8765432109 | noahroberts@345   |
|       4 | Olivia Jackson   | oliviajackson456@gmail.com    | 7654321098 | oliviajackson@456 |
|       5 | Ava Smith        | avasmith567@gmail.com         | 9999966666 | avasmith@567      |
|       6 | Robinson         | robinson678@gmail.com         | 8898877665 | robinson@678      |
|       7 | Johnson          | johnson898@gmail.com          | 8765432898 | johnson@898       |
|       8 | Shruthihasan     | shrithihasan654@gmail.com     | 7654378998 | sruthihasan@654   |
|       9 | Juliet           | juliet23456@gmail.com         | 9967896666 | juliet@23456      |
|      10 | Daphne Christina | daphnechristina@2002gmail.com | 9363232559 | daphne@christina  |

###### 10 rows in set (0.00 sec)

#### 2.Insert into Roles:

```syntax
INSERT INTO Roles VALUES (1,1,'User'),(2,2,'Admin'),(3,3,'User'),(4,4,'Admin'),(5,5,'User'),(6,6,'Admin'),(7,7,'User'),(8,8,'User'),(9,9,'User'),(10,10,'User');
```
###### Query OK, 10 rows affected (0.01 sec)
###### Records: 10  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Roles;
```

| Role_ID | User_ID | Role_Name |
|:--------|:--------|:----------|
|       1 |       1 | User      |
|       2 |       2 | Admin     |
|       3 |       3 | User      |
|       4 |       4 | Admin     |
|       5 |       5 | User      |
|       6 |       6 | Admin     |
|       7 |       7 | User      |
|       8 |       8 | User      |
|       9 |       9 | User      |
|      10 |      10 | User      |

###### 10 rows in set (0.00 sec)

#### add constraint check:

```syntax
ALTER TABLE Reviews ADD CONSTRAINT CHECK(Stars<=5);
```
###### Query OK, 0 rows affected (0.12 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

#### 3. Insert into Reviews:

```syntax
INSERT INTO Reviews VALUES (1,1,'James Williams','2022-01-03',4,'This is just awesome'),(2,3,'Noah Roberts','2022-02-02',5,'It is awesome to have shopping and ticketbooking at once'),(3,5,'Ava Smith','2021-12-28',4,'Awaiting to create more memories with you'),(4,7,'Johnson','2021-11-21',3,'This is a great website for disney lovers'),(5,8,'Shruthi','2022-02-12',4,'Great and enjoyable trip'),(6,9,'Juli','2022-01-18',5,'I just loved it'),(7,10,'Daphne','2022-02-02',4,'Just give it a try to experience the beauty');
```
###### Query OK, 7 rows affected (0.02 sec)
###### Records: 7  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Reviews;
```

| Review_ID | User_ID | Name           | Date       | Stars | Feedback                                                 |
|:----------|:--------|:---------------|:-----------|:------|:---------------------------------------------------------|
|         1 |       1 | James Williams | 2022-01-03 |     4 | This is just awesome                                     |
|         2 |       3 | Noah Roberts   | 2022-02-02 |     5 | It is awesome to have shopping and ticketbooking at once |
|         3 |       5 | Ava Smith      | 2021-12-28 |     4 | Awaiting to create more memories with you                |
|         4 |       7 | Johnson        | 2021-11-21 |     3 | This is a great website for disney lovers                |
|         5 |       8 | Shruthi        | 2022-02-12 |     4 | Great and enjoyable trip                                 |
|         6 |       9 | Juli           | 2022-01-18 |     5 | I just loved it                                          |
|         7 |      10 | Daphne         | 2022-02-02 |     4 | Just give it a try to experience the beauty              |

###### 7 rows in set (0.00 sec)

#### 4.Insert into Ticket_Booking:

```syntax
INSERT INTO Ticket_Booking VALUES (1,1,'jameswilliams123@gmail.com','1234567891','2022-05-23','20'),(2,3,'noahroberts345@gmail.com','8765432109','2022-08-26','5'),(3,5,'avasmith567@gmail.com','9999966666','2022-07-15','8'),(4,7,'johnson898@gmail.com','8765432898','2022-05-10','3'),(5,8,'shrithihasan654@gmail.com','7654378998','2022-07-17','15'),(6,9,'juliet23456@gmail.com','9967896666','2022-09-29','10'),(7,10,'daphnechristina@2002gmail.com','9363232559','2022-08-16','12');
```
###### Query OK, 7 rows affected (0.01 sec)
###### Records: 7  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Ticket_Booking;
```

| Ticket_ID | User_ID | Email                         | Phone_NO   | Date_Of_Journey | No_Of_Passengers |
|:----------|:--------|:------------------------------|:-----------|:----------------|:-----------------|
|         1 |       1 | jameswilliams123@gmail.com    | 1234567891 | 2022-05-23      |               20 |
|         2 |       3 | noahroberts345@gmail.com      | 8765432109 | 2022-08-26      |                5 |
|         3 |       5 | avasmith567@gmail.com         | 9999966666 | 2022-07-15      |                8 |
|         4 |       7 | johnson898@gmail.com          | 8765432898 | 2022-05-10      |                3 |
|         5 |       8 | shrithihasan654@gmail.com     | 7654378998 | 2022-07-17      |               15 |
|         6 |       9 | juliet23456@gmail.com         | 9967896666 | 2022-09-29      |               10 |
|         7 |      10 | daphnechristina@2002gmail.com | 9363232559 | 2022-08-16      |               12 |

###### 7 rows in set (0.00 sec)

#### 5.Insert into Ticket_Payment:

```syntax
INSERT INTO Ticket_Payment VALUES (10,4,'Johnson','8394859282938472','Rs.10,000','2022-03-24','Gpay'),(11,6,'Juliet','7834783489239012','Rs.10,000','2022-07-01','NetBanking'),(12,7,'Daphne Christina','2345345645675678','Rs.30,000','2022-05-03','Gpay');
```
###### Query OK, 3 rows affected (0.01 sec)
###### Records: 3  Duplicates: 0  Warnings: 0

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

```syntax
SELECT * FROM Ticket_Payment;
```

| Payment_ID | Ticket_ID | Cardholder_Name  | Acccount_NO      | Total_Amount | Transaction_Date | Mode_Of_Payment |
|:-----------|:----------|:-----------------|:-----------------|:-------------|:-----------------|:----------------|
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

###### 12 rows in set (0.00 sec)

#### renaming a column:
```syntax
ALTER TABLE Ticket_Payment RENAME COLUMN Acccount_NO TO Account_NO;
```
###### Query OK, 0 rows affected (0.03 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Ticket_Payment;
```

| Payment_ID | Ticket_ID | Cardholder_Name  | Account_NO       | Total_Amount | Transaction_Date | Mode_Of_Payment |
|:-----------|:----------|:-----------------|:-----------------|:-------------|:-----------------|:----------------|
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


###### 12 rows in set (0.00 sec)

```syntax
INSERT INTO Add_Category VALUES (1,2,'Kids'),(2,4,'Men'),(3,2,'Women'),(4,2,'Gadgets'),(5,4,'Toys'),(6,6,'Homeware'),(7,6,'Fashion and Accessories'),(8,2,'Stationery'),(9,4,'Backpacks'),(10,6,'Serveware'),(11,2,'Comfort Tees');
```
###### Query OK, 11 rows affected (0.01 sec)
###### Records: 11  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Add_Category;
```

| Category_ID | User_ID | Category_Name           |
|:------------|:--------|:------------------------|
|           1 |       2 | Kids                    |
|           2 |       4 | Men                     |
|           3 |       2 | Women                   |
|           4 |       2 | Gadgets                 |
|           5 |       4 | Toys                    |
|           6 |       6 | Homeware                |
|           7 |       6 | Fashion and Accessories |
|           8 |       2 | Stationery              |
|           9 |       4 | Backpacks               |
|          10 |       6 | Serveware               |
|          11 |       2 | Comfort Tees            |

###### 11 rows in set (0.00 sec)

#### 6.Insert into Add_Product:
```syntax
INSERT INTO Add_Product VALUES (1,1,'Marvel Spider-Man Blue Sweatshirt','Rs.840','Blue color and for kids');
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
INSERT INTO Add_Product VALUES (2,1,'Star Wars Watch','Rs.639','1 year warranty black and white watch'),(3,2,'Mickey and Friends Sweatshirt','Rs.800','Red sweatshirt for men'),(4,3,'Disney Mickey
Cloth set','Rs.450','4 set of kerchief'),(5,3,'Disney Princess Navy Blue Hoodle','Rs.920','Gauranteed Hoodle for women'),(6,4,'Disney Mickey Mouse Kids Battery Powered LED Torch','Rs.349','3 years of warranty'),(7,4,'Disney Minnie Mouse kids interchangable Frame Sunglasses','Rs.699','2 years of warranty and red coloured'),(8,5,'Hamley Toys','Rs.1199','12 number of toys'),(9,5,'Disney Frozen Toy Storage
Box','Rs.499','for above 3 years kids');
```
###### Query OK, 8 rows affected (0.01 sec)
###### Records: 8  Duplicates: 0  Warnings: 0

```syntax
INSERT INTO Add_Product VALUES (10,6,'Disney Frozen Multipurpose Ludo game table','Rs.499','can be used in 3 different ways'),(11,6,'Fun Homes Disney Mickey Mouse and Friends Pillows','Rs.870','Reverisble pillows pack of 4'),(12,6,'Mickey mouse Bath Towel','Rs.585','Soft as feather'),(13,6,'SPACES mickey Cotton Single Bed Dohar','Rs.1999','5 years of warranty'),(14,7,',Adidas kids trainers Disney
 Mickey FortaRun shoes','Rs.1600','Fast running shoes with great grip'),(15,8,'Disney Minnie mouse pencil pouch','Rs.399','Red with white coloured'),(16,8,'Disney Princess 5 in 1 writing Board','Rs.999','can be used in 5 different ways');
 ```
###### Query OK, 7 rows affected (0.00 sec)
###### Records: 7  Duplicates: 0  Warnings: 0

```syntax
INSERT INTO Add_Product VALUES (17,8,'Fame forever casual shoes','Rs.1699','Pink coloured shoes with 1 year warranty'),(18,10,'Disney Frozen Cherry Mug','Rs.359','Blue coloured'),(19,10,'Disney Mouse Johny Vacuum Insulated Red water bottles','Rs.599','2 years of warranty'),(20,11,'Pixar Car t-shirt','Rs.431','t-shirt for both men and women');
```
###### Query OK, 4 rows affected (0.01 sec)
###### Records: 4  Duplicates: 0  Warnings: 0

```syntax
SELECT * FROM Add_Product;
```

| Product_ID | Category_ID | Product_Name                                             | Cost_Detail_inRupees | Product_Detail                           |
|:-----------|:------------|:---------------------------------------------------------|:---------------------|:-----------------------------------------|
|          1 |           1 | Marvel Spider-Man Blue Sweatshirt                        | Rs.840               | Blue color and for kids                  |
|          2 |           1 | Star Wars Watch                                          | Rs.639               | 1 year warranty black and white watch    |
|          3 |           2 | Mickey and Friends Sweatshirt                            | Rs.800               | Red sweatshirt for men                   |
|          4 |           3 | Disney Mickey Cloth set                                  | Rs.450               | 4 set of kerchief                        |
|          5 |           3 | Disney Princess Navy Blue Hoodle                         | Rs.920               | Gauranteed Hoodle for women              |
|          6 |           4 | Disney Mickey Mouse Kids Battery Powered LED Torch       | Rs.349               | 3 years of warranty                      |
|          7 |           4 | Disney Minnie Mouse kids interchangable Frame Sunglasses | Rs.699               | 2 years of warranty and red coloured     |
|          8 |           5 | Hamley Toys                                              | Rs.1199              | 12 number of toys                        |
|          9 |           5 | Disney Frozen Toy Storage Box                            | Rs.499               | for above 3 years kids                   |
|         10 |           6 | Disney Frozen Multipurpose Ludo game table               | Rs.499               | can be used in 3 different ways          |
|         11 |           6 | Fun Homes Disney Mickey Mouse and Friends Pillows        | Rs.870               | Reverisble pillows pack of 4             |
|         12 |           6 | Mickey mouse Bath Towel                                  | Rs.585               | Soft as feather                          |
|         13 |           6 | SPACES mickey Cotton Single Bed Dohar                    | Rs.1999              | 5 years of warranty                      |
|         14 |           7 | ,Adidas kids trainers Disney Mickey FortaRun shoes       | Rs.1600              | Fast running shoes with great grip       |
|         15 |           8 | Disney Minnie mouse pencil pouch                         | Rs.399               | Red with white coloured                  |
|         16 |           8 | Disney Princess 5 in 1 writing Board                     | Rs.999               | can be used in 5 different ways          |
|         17 |           8 | Fame forever casual shoes                                | Rs.1699              | Pink coloured shoes with 1 year warranty |
|         18 |          10 | Disney Frozen Cherry Mug                                 | Rs.359               | Blue coloured                            |
|         19 |          10 | Disney Mouse Johny Vacuum Insulated Red water bottles    | Rs.599               | 2 years of warranty                      |
|         20 |          11 | Pixar Car t-shirt                                        | Rs.431               | t-shirt for both men and women           |


###### 20 rows in set (0.00 sec)

#### 7.Insert into Shopping: