-- 코드를 입력하세요
SELECT BOOK_ID,AUTHOR_NAME,date_format(PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
FROM BOOK join AUTHOR on BOOK.AUTHOR_ID = AUTHOR.AUTHOR_ID
where CATEGORY like '경제'
order by PUBLISHED_DATE;
# select *
# from BOOK
# where CATEGORY like '경제'