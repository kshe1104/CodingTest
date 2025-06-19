-- 코드를 작성해주세요
select id,
(select count(*)
from ecoli_data as child
where child.parent_id = parent.id) as child_count
from ecoli_data parent
order by id asc;