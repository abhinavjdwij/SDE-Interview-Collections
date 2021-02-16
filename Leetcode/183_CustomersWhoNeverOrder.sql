/* Write your PL/SQL query statement below */
select name Customers from Customers where id not in (select distinct customerId from Orders)