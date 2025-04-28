# select count(i.fish_type) as fish_count from fish_info i
# join fish_name_info n on i.fish_type = n.fish_type
# where n.fish_name like 'BASS' or n.fish_name like 'SNAPPER

select count(id) as fish_count from fish_info i
join fish_name_info n on i.fish_type = n.fish_type
where n.fish_name like 'BASS' or n.fish_name like 'SNAPPER'