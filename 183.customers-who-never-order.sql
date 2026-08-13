

-- SELECT Customers.name FROM Customers 

-- LEFT JOIN Orders ON Customers.id = Orders.customerId 

-- WHERE Orders.customerId  IS NULL;

SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);