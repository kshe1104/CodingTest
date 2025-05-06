-- 코드를 입력하세요
SELECT 
B.Title, 
B.Board_ID, 
R.reply_id,
R.Writer_id,
R.Contents,
DATE_FORMAT(R.created_Date,'%Y-%m-%d') as CREATED_DATE
from used_goods_board B
JOIN used_goods_reply R
    on B.board_id = R.board_id
where B.Created_Date like '2022-10%'
order by Created_DATE asc , title asc;