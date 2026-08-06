# Write your MySQL query statement below
SELECT pro.product_name,sa.year,sa.price
FROM Product pro
JOIN Sales sa
ON(pro.product_id=sa.product_id)
;