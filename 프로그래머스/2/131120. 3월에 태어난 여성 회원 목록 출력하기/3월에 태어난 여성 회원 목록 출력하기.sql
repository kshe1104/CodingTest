# -- 코드를 입력하세요
# SELECT member_id, member_name, gender,DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH from member_profile
# where tlno is not null && MONTH(date_Of_BIRTH) = 03 && gender = 'W';

select member_id,member_name,gender,date_format(date_of_birth,'%Y-%m-%d') as date_of_birth from member_profile
where tlno is not null and Month(date_of_birth) like 03 and gender like 'W'