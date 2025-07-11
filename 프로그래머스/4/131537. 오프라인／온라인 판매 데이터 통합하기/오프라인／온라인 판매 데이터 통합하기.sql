-- 코드를 입력하세요
SELECT date_format(sales_date,'%Y-%m-%d') as sales_date,product_id,user_id,sales_amount
from (
select sales_date,product_id,user_id,sales_amount
from online_sale
union -- 중복없이 합침
select sales_date,product_id,null,sales_amount
from offline_sale)
A -- 서브쿼리는 별칭을 붙여야 함
where sales_date like '2022-03%'
order by sales_date,product_id,user_id;