-- 코드를 입력하세요
SELECT distinct (OS1.USER_ID), OS1.PRODUCT_ID
from ONLINE_SALE OS1, ONLINE_SALE OS2
where OS1.ONLINE_SALE_ID != OS2.ONLINE_SALE_ID
and OS1.USER_ID = OS2.USER_ID
and OS1.PRODUCT_ID = OS2.PRODUCT_ID
order by USER_ID, PRODUCT_ID DESC;