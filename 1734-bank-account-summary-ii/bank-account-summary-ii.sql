# Write your MySQL query statement below
SELECT 
    (SELECT name FROM Users WHERE account = t.account) AS name,
    SUM(t.amount) AS balance
FROM Transactions t
GROUP BY t.account
HAVING balance > 10000;