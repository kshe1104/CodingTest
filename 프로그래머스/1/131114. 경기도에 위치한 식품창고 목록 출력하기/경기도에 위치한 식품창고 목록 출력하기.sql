-- 코드를 입력하세요
SELECT warehouse_id,warehouse_name,address,ifnull(freezer_yn,'N') from food_wareHouse
where address like '경기도%'