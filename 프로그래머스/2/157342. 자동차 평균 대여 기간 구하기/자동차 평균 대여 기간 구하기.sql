-- 코드를 입력하세요
SELECT car_id, round(avg(datediff(end_date,start_date)+1),1) average_duration
from Car_rental_company_rental_history
group by car_id
having avg(datediff(end_date,start_date)+1)>=7
order by 2 desc,car_id desc;