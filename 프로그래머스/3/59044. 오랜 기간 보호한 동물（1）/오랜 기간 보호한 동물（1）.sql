-- 코드를 입력하세요
SELECT i.name,i.dateTime from animal_ins i
left join animal_outs o on i.animal_id = o.animal_id
where o.dateTime is null
order by i.dateTime asc
limit 3