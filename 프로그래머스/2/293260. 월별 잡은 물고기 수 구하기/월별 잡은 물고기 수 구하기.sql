select count(*) as fish_count,
month(TIME) as month
from Fish_info
group by Month
order by month asc