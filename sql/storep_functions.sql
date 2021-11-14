CREATE PROCEDURE `p1` (IN vn varchar(50))
BEGIN
	select * 
    from person
    where vaccine_name=vn;
END

CREATE PROCEDURE `p2` (IN s_id smallint)
BEGIN
	select state_name 
    from state
    where state_id=s_id;
END

CREATE FUNCTION `f1` (v_n varchar(50))
RETURNS varchar(50)
deterministic
BEGIN
	declare vaccine_cost smallint;
    select cost into vaccine_cost 
    from vaccine
    where vaccine_name=v_n;
RETURN vaccine_cost;
END

CREATE FUNCTION `f2` (country varchar(50))
RETURNS bigint
deterministic
BEGIN
	declare popu bigint;
    select population into popu
    from country
    where country_name=country;
RETURN popu;

END