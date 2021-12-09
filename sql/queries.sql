CREATE VIEW `611` AS
select * from vaccine_order where quantity >100 order by country_id;

CREATE VIEW `621` AS
Select country_id, country_name, Concat(country_id, ' ', country_name) id_country_name from country group by country_id;

CREATE VIEW `631` AS
Select vaccine_name, vaccine_quantity from vaccine where temperature > (select avg(temperature) from vaccine);


CREATE VIEW `612` AS

select * 
from vaccine
where cost < 1000
order by cost ;

CREATE VIEW `622` AS
select *
from vaccine
where abs(cost)>1000;

CREATE VIEW `632` AS
select a.country_name ,b.state_name
from country a
inner join state b
on a.country_id=b.country_id;