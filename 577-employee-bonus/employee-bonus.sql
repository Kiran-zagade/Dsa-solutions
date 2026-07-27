# Write your MySQL query statement below
SELECT emp.name ,bo.bonus
FROM Employee emp
LEFT JOIN Bonus bo
ON (emp.empId=bo.empId)
WHERE bo.bonus <1000
OR bo.bonus IS NULL;
