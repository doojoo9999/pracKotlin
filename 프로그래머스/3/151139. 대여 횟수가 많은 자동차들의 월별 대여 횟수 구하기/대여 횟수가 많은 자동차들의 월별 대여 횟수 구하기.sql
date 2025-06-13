WITH car_cnt AS 
           (
           SELECT car_id
           FROM car_rental_company_rental_history
           WHERE start_date BETWEEN DATE '2022-08-01' 
                            AND DATE '2022-10-31'
           GROUP BY car_id 
           HAVING COUNT(*) > 4 
           )

SELECT     EXTRACT(MONTH FROM c.start_date) AS month
         , c.car_id, COUNT(*) AS records
FROM       car_rental_company_rental_history c
INNER JOIN car_cnt cnt ON 
           c.car_id = cnt.car_id
AND        c.start_date BETWEEN DATE '2022-08-01' 
                        AND DATE '2022-10-31'
GROUP BY   EXTRACT(MONTH FROM c.start_date)
         , c.car_id
HAVING     COUNT(*) <> 0
ORDER BY   month ASC
         , c.car_id DESC;