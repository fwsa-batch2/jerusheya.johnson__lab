## DCL (Data Control Language)

### GRANT:

```syntax
GRANT privileges_names ON object TO user;
```

#### Parameters Used:

##### privileges_name:
    These are the access rights or privileges granted to the user.
##### object:
    It is the name of the database object to which permissions are being granted. In   the case of granting privileges on a table, this would be the table name.
##### user:
    It is the name of the user to whom the privileges would be granted.


#### 1. GRANT with SELECT,UPDATE,DELETE,UPDATE :
##### (To grant multiple Privileges to a user named “Amit” in a table “users”, the following GRANT statement should be executed.)

```syntax
GRANT SELECT, INSERT, DELETE, UPDATE ON Users TO 'Amit'@'localhost;
```

#### 2. GRANT with ALL :
##### (all the privileges to a user named “Amit” in a table “users”)

```syntax
GRANT ALL ON Users TO 'Amit'@'localhost;
```

#### 3. GRANT with * :
##### (To Grant all privilege to all the users in a table “users”)

```syntax
GRANT ALL ON Users TO '*'@'localhost;
```
#### 4. SHOW GRANTS :

```syntax
SHOW GRANTS FOR 'Amit'@'localhost;
```

### REVOKE :

#### 1. REVOKE with SELECT,UPDATE,DELETE,UPDATE :
##### (To revoke multiple Privileges to a user named “Amit” in a table “users”, the following GRANT statement should be executed.)

```syntax
REVOKE SELECT, INSERT, DELETE, UPDATE ON Users TO 'Amit'@'localhost;
```

#### 2. REVOKE with ALL :
##### (all the privileges to a user named “Amit” in a table “users”)

```syntax
REVOKE ALL ON Users TO 'Amit'@'localhost;
```

#### 3. REVOKE with * :
##### (To Grant all privilege to all the users in a table “users”)

```syntax
REVOKE ALL ON Users TO '*'@'localhost;
```




