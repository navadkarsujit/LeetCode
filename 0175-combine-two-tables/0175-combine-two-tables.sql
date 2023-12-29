# Write your MySQL query statement below
SELECT Person.firstname as firstName,person.lastname as lastName,Address.city,Address.state
FROM Person
left JOIN Address ON Address.personId=Person.personId;