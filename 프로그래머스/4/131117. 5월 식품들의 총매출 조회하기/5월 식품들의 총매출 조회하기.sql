SELECT 
    FP.PRODUCT_ID, 
    FP.PRODUCT_NAME, 
    SUM(FO.AMOUNT * FP.PRICE) AS TOTAL_SALES
FROM 
    FOOD_PRODUCT FP
JOIN 
    FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID
WHERE 
    EXTRACT(YEAR FROM FO.PRODUCE_DATE) = 2022 AND 
    EXTRACT(MONTH FROM FO.PRODUCE_DATE) = 5
GROUP BY 
    FP.PRODUCT_ID, 
    FP.PRODUCT_NAME
ORDER BY 
    TOTAL_SALES DESC, 
    FP.PRODUCT_ID ASC;