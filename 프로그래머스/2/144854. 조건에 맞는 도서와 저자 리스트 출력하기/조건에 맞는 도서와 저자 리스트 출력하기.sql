-- 코드를 입력하세요
SELECT b.Book_Id, a.author_name, DATE_FORMAT(b.published_date,'%Y-%m-%d') from Book b
join author a
on b.author_id = a.author_id
where category like '경제'
order by published_date asc;