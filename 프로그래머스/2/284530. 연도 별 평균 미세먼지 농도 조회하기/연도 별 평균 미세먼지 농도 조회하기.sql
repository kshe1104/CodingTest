-- 코드를 작성해주세요
select year(YM) YEAR, round(avg(PM_VAL1),2) as "PM10" ,round(avg(pm_val2),2) as "PM2.5"
from air_pollution
where LOCATION2 like '수원'
group by year
order by YEAR asc;