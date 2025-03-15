SELECT c.ID
FROM ECOLI_DATA a
JOIN ECOLI_DATA b ON a.ID = b.PARENT_ID
JOIN ECOLI_DATA c ON b.ID = c.PARENT_ID
WHERE a.PARENT_ID IS NULL
ORDER BY c.ID;