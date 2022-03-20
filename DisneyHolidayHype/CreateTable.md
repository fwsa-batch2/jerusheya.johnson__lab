### Table creations:

#### 1.User_Detail table:

```syntax
CREATE TABLE User_Detail (User_ID tinyint PRIMARY KEY AUTO_INCREMENT,UserName varchar(30) NOT NULL,Email varchar(100) UNIQUE NOT NULL,Phone_NO int UNIQUE NOT NULL,Password varchar(20) UNIQUE NOT NULL);
```

###### Query OK, 0 rows affected (0.02 sec)

```syntax
DESC User_Detail;
```

| Field    | Type         | Null | Key | Default | Extra          |
|:---------|:-------------|:-----|:----|:--------|:---------------|
| User_ID  | tinyint      | NO   | PRI | NULL    | auto_increment |
| UserName | varchar(30)  | NO   |     | NULL   |                |
| Email    | varchar(100) | NO   | UNI | NULL    |                |
| Phone_NO | int          | NO   | UNI | NULL    |                |
| Password | varchar(20)  | NO   | UNI | NULL    |                |

###### 5 rows in set (0.01 sec)

#### 2. Roles table:

```syntax
CREATE TABLE Roles (Role_ID tinyint PRIMARY KEY AUTO_INCREMENT,User_ID tinyint, Role_Name varchar(50) NOT NULL,FOREIGN KEY(User_ID) REFERENCES User_Detail(User_ID));
```
###### Query OK, 0 rows affected (0.04 sec)

```syntax
DESC Roles;
```

| Field     | Type        | Null | Key | Default | Extra          |
|:----------|:------------|:-----|:----|:--------|:---------------|
| Role_ID   | tinyint     | NO   | PRI | NULL    | auto_increment |
| User_ID   | tinyint     | YES  | MUL | NULL    |                |
| Role_Name | varchar(50) | NO   |     | NULL    |                |

###### 3 rows in set (0.00 sec)

#### 3. Add_Category table:

```syntax
CREATE TABLE Add_Category (Category_ID tinyint PRIMARY KEY AUTO_INCREMENT,User_ID tinyint,Category_Name varchar(100) UNIQUE NOT NULL,FOREIGN KEY(User_ID) REFERENCES User_Detail(User_ID));
```
###### Query OK, 0 rows affected (0.07 sec)

```syntax
DESC Add_Category;
```

| Field         | Type         | Null | Key | Default | Extra          |
|:--------------|:-------------|:-----|:----|:--------|:---------------|
| Category_ID   | tinyint      | NO   | PRI | NULL    | auto_increment |
| User_ID       | tinyint      | YES  | MUL | NULL    |                |
| Category_Name | varchar(100) | NO   | UNI | NULL    |                |

###### 3 rows in set (0.00 sec)

#### 4.Add_Product table:

```syntax
CREATE TABLE Add_Product (Product_ID tinyint PRIMARY KEY AUTO_INCREMENT,Category_ID tinyint,Product_Name varchar(100) NOT NULL,Cost_Detail_inRupees varchar(100),Product_Detail varchar(300),FOREIGN KEY(Category_ID) REFERENCES Add_Category(Category_ID));
```
###### Query OK, 0 rows affected (0.06 sec)

```syntax
DESC Add_Product;
```

| Field                | Type         | Null | Key | Default | Extra          |
|:---------------------|:-------------|:-----|:----|:--------|:---------------|
| Product_ID           | tinyint      | NO   | PRI | NULL    | auto_increment |
| Category_ID          | tinyint      | YES  | MUL | NULL    |                |
| Product_Name         | varchar(100) | NO   |     | NULL    |                |
| Cost_Detail_inRupees | varchar(100) | YES  |     | NULL    |                |
| Product_Detail       | varchar(300) | YES  |     | NULL    |                |

###### 5 rows in set (0.00 sec)

#### 5. Shop_Payment table:

```syntax
CREATE TABLE Shop_Payment (Payment_ID tinyint PRIMARY KEY AUTO_INCREMENT,Shop_ID tinyint NOT NULL,CardHolder_Name varchar(20) NOT NULL,Account_NO bigint NOT NULL,Total_Amount_inRupees varchar(100) NOT NULL,Transaction_Date DATE NOT NULL,FOREIGN KEY(Shop_ID) REFERENCES Shopping(Shop_ID));
```
###### Query OK, 0 rows affected (0.05 sec)

```syntax
DESC Shop_Payment;
```

| Field                 | Type         | Null | Key | Default | Extra          |
|:----------------------|:-------------|:-----|:----|:--------|:---------------|
| Payment_ID            | tinyint      | NO   | PRI | NULL    | auto_increment |
| Shop_ID               | tinyint      | NO   | MUL | NULL    |                |
| CardHolder_Name       | varchar(20)  | NO   |     | NULL    |                |
| Account_NO            | bigint       | NO   |     | NULL    |                |
| Total_Amount_inRupees | varchar(100) | NO   |     | NULL    |                |
| Transaction_Date      | date         | NO   |     | NULL    |                |

###### 6 rows in set (0.00 sec)

#### 6.Reviews table:

```syntax
 CREATE TABLE Reviews (Review_ID tinyint PRIMARY KEY AUTO_INCREMENT,User_ID tinyint,Name varchar(30) NOT NULL,Date DATE NOT NULL,Stars tinyint NOT NULL,Feedback varchar(100),FOREIGN KEY (User_ID) REFERENCES User_Detail (User_ID));
 ```
###### Query OK, 0 rows affected (0.09 sec)

```syntax
DESC Reviews;
```

| Field     | Type         | Null | Key | Default | Extra          |
|:----------|:-------------|:-----|:----|:--------|:---------------|
| Review_ID | tinyint      | NO   | PRI | NULL    | auto_increment |
| User_ID   | tinyint      | YES  | MUL | NULL    |                |
| Name      | varchar(30)  | NO   |     | NULL    |                |
| Date      | date         | NO   |     | NULL    |                |
| Stars     | tinyint      | NO   |     | NULL    |                |
| Feedback  | varchar(100) | YES  |     | NULL    |                |

###### 6 rows in set (0.01 sec)

#### 7. Ticket_Booking table:

```syntax
CREATE TABLE Ticket_Booking (Ticket_ID tinyint PRIMARY KEY AUTO_INCREMENT,User_ID tinyint,Email varchar(300) NOT NULL,Phone_NO bigint NOT NULL,Date_Of_Journey DATE NOT NULL,No_Of_Passengers int NOT NULL,FOREIGN KEY(User_ID) REFERENCES User_Detail(User_ID));
```
###### Query OK, 0 rows affected (0.06 sec)

```syntax
DESC Ticket_Booking;
```

| Field            | Type         | Null | Key | Default | Extra          |
|:-----------------|:-------------|:-----|:----|:--------|:---------------|
| Ticket_ID        | tinyint      | NO   | PRI | NULL    | auto_increment |
| User_ID          | tinyint      | YES  | MUL | NULL    |                |
| Email            | varchar(300) | NO   |     | NULL    |                |
| Phone_NO         | bigint       | NO   |     | NULL    |                |
| Date_Of_Journey  | date         | NO   |     | NULL    |                |
| No_Of_Passengers | int          | NO   |     | NULL    |                |

###### 6 rows in set (0.01 sec)

#### 8. Ticket_Payment table:

```syntax
CREATE TABLE Ticket_Payment (Payment_ID tinyint PRIMARY KEY AUTO_INCREMENT,Ticket_ID tinyint,Cardholder_Name varchar(30) NOT NULL,Acccount_NO bigint NOT NULL,Total_Amount varchar(100) NOT NULL,Transaction_Date DATE NOT NULL,Mode_Of_Payment varchar(50) NOT NULL,FOREIGN KEY(Ticket_ID) REFERENCES Ticket_Booking(Ticket_ID));
```
###### Query OK, 0 rows affected (0.06 sec)

```syntax
DESC Ticket_Payment;
```

| Field            | Type         | Null | Key | Default | Extra          |
|:-----------------|:-------------|:-----|:----|:--------|:---------------|
| Payment_ID       | tinyint      | NO   | PRI | NULL    | auto_increment |
| Ticket_ID        | tinyint      | YES  | MUL | NULL    |                |
| Cardholder_Name  | varchar(30)  | NO   |     | NULL    |                |
| Acccount_NO      | bigint       | NO   |     | NULL    |                |
| Total_Amount     | varchar(100) | NO   |     | NULL    |                |
| Transaction_Date | date         | NO   |     | NULL    |                |
| Mode_Of_Payment  | varchar(50)  | NO   |     | NULL    |                |

###### 7 rows in set (0.01 sec)