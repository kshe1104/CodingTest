-- 코드를 작성해주세요
select
id,
email,
first_name,
last_name
from developers dev
where dev.skill_code &(select bit_or(code)
                      from skillcodes
                      where name in('Python','C#')
                      >0)
                      order by id asc;