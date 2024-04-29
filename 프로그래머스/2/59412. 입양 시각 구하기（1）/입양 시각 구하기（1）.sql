# hour를 통해서 시간을 뽑아낼 수 있음 
SELECT HOUR(DATETIME) 'HOUR', count(DATETIME) 'COUNT'
from ANIMAL_OUTS
where HOUR(DATETIME) >=9 and HOUR(DATETIME) <=19
group by HOUR
order by HOUR(DATETIME)