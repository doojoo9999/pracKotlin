select fi.ID, fn.FISH_NAME, fi.LENGTH
from FISH_INFO fi
join FISH_NAME_INFO fn ON fi.FISH_TYPE = fn.FISH_TYPE
where fi.LENGTH = (
    select MAX(LENGTH)
    from FISH_INFO
    where FISH_TYPE = fi.FISH_TYPE and LENGTH is not null
    )
order by fi.ID asc;