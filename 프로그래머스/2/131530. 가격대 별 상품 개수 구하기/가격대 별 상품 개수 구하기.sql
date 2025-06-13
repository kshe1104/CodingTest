select
case 
        WHEN (PRICE/10000) < 1 THEN 0
        WHEN (PRICE/10000) < 2 THEN 10000
        WHEN (PRICE/10000) < 3 THEN 20000
        WHEN (PRICE/10000) < 4 THEN 30000
        WHEN (PRICE/10000) < 5 THEN 40000
        WHEN (PRICE/10000) < 6 THEN 50000
        WHEN (PRICE/10000) < 7 THEN 60000
        WHEN (PRICE/10000) < 8 THEN 70000
        WHEN (PRICE/10000) < 9 THEN 80000
        end as price_group,
        count(*) as products
        from product
        group by price_group
        order by price_group asc;