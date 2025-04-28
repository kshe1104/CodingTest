-- 코드를 작성해주세요
SELECT ID,
EMAIL, 
FIRST_NAME, 
LAST_NAME from DEVELOPER_INFOS
where "python" in (Skill_1,Skill_2,skill_3)
order by id asc ;