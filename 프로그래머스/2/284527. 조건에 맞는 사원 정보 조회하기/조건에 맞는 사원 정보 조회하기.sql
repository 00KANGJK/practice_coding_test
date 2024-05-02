-- 코드를 작성해주세요
select SCORE,HR_EMPLOYEES.EMP_NO,EMP_NAME,POSITION,EMAIL
from HR_EMPLOYEES
join (select sum(score) as SCORE,EMP_NO
    from HR_GRADE
    group by emp_no) as SCORE_SUM
on HR_EMPLOYEES.EMP_NO = SCORE_SUM.EMP_NO
order by SCORE desc
limit 1;
    