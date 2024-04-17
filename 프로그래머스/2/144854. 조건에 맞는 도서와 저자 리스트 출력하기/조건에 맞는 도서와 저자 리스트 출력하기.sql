SELECT b.BOOK_ID, a.AUTHOR_NAME, DATE_FORMAT(b.PUBLISHED_DATE, "%Y-%m-%d") as PUBLISHED_DATE
FROM BOOK b
JOIN AUTHOR a
ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE CATEGORY = '경제'
ORDER BY PUBLISHED_DATE