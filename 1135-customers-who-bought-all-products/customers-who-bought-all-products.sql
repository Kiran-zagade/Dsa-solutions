# Write your MySQL query statement below
SELECT distinct cu.customer_id
FROM Customer cu
JOIN Product pr ON(cu.product_key=pr.product_key)
GROUP by cu.customer_id
HAVING count(distinct cu.product_key) =(
    SELECT COUNT(*)
    FROM Product
);
