# Sql Notes

SQL (Structure Query Language)
How to create a Database
---------------------------
syntax Create Database DB_Name
eg:  Create Database Amazon

How to create a Table in Database
<pre>
<code>
create table table_name(attributes,dataypes)
Eg:
use Amazon;
CREATE TABLE amazon_detail (
    order_id INTEGER,
    order_date DATE,
    total INTEGER,
    payment_method VARCHAR(50),
    product_name VARCHAR(40)
);
</code>
</pre>
Insert the values into the tables
<pre>
<code>
INSERT INTO TABLE_NAME VALUES(DATAA)
Eg:
use Amazon;
INSERT INTO amazon_detail VALUES(
    1,"2025-5-5",100,"GPAY","BABYMILK"
);
</code>
</pre>

Print the value of the table
---------------------------------
<pre>
<code>
syntax: Select * from table_name
eg:
SELECT * FROM amazon_detail;
</code>
</pre>
if we want to sort the data than we use the Order by
<pre>
<code>
syntax: SELECT  * FROM table_name order by attribute_name ;

eg:
SELECT  * FROM amazon_detail ORDER_BY product_name ;
</code>
</pre>