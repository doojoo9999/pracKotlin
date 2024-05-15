SELECT i.NAME, i.DATETIME
FROM animal_ins i 
LEFT JOIN animal_outs o 
ON i.animal_id = o.animal_id
WHERE o.DATETIME IS NULL
ORDER BY i.DATETIME LIMIT 3