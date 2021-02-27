/* Write your PL/SQL query statement below */
select person.FirstName FirstName, person.LastName LastName, 
address.city City, address.state State from 
Person person left outer join Address address 
on person.personId = address.personId