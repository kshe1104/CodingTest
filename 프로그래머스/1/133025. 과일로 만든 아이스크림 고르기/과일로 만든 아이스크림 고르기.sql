# select f.flavor from FIRST_HALF f
# join Icecream_Info i 
# on f.flavor = i.flavor
# where f.total_order>3000 and
# i.ingredient_type like 'fruit_based'
# order by total_order desc;

select f.flavor from FIRST_HALF f 
join icecream_info i
on f.flavor = i.flavor
where f.total_order>3000 and i.ingredient_type like 'fruit_based'
order by f.total_order desc;