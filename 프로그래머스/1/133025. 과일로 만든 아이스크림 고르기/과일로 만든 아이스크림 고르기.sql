SELECT F.FLAVOR
FROM FIRST_HALF F
JOIN ICECREAM_INFO I ON F.FLAVOR = I.FLAVOR
WHERE F.TOTAL_ORDER >= 3000 AND I.INGREDIENT_TYPE LIKE '%fruit%'