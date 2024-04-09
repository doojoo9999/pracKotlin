select hour(datetime) as HOUR, count(animal_id) as COUNT
from animal_outs
where hour(datetime) >= 9 and hour(datetime) < 20
group by hour(datetime)
order by hour(datetime) asc