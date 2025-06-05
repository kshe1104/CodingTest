-- 코드를 입력하세요
SELECT history_id,car_id,
date_format(start_date,'%Y-%m-%d') as start_date,
date_format(end_date,'%Y-%m-%d') as End_date,
case
when datediff(END_Date,Start_date)+1>=30 then '장기 대여'
else '단기 대여'
end as RENT_TYPE
from car_rental_company_rental_history
where date_format(start_date,'%Y-%m')='2022-09'
order by History_id desc;