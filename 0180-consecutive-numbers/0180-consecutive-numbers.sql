# Write your MySQL query statement below
select distinct num as ConsecutiveNums
from(
    select num,Lead(num,1) over(order by id)as next,
    lead(num,2)over(order by id)as nextto
    from Logs
) as temp
where num=next and next=nextto;