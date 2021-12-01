drop database vaccine;
create database vaccine;
use vaccine;
-- uncomment the below to delete all the tables
-- drop -- table entity1;
-- -- drop table user;
-- -- drop table vaccine_order;
-- -- drop table person;
-- -- drop table zip_code;
-- drop table state;
-- drop table country;
-- drop table vaccine;

create table user(username varchar(50),
				  password varchar(50),
                  email varchar(50),
                  primary key (username));

create table entity1(username varchar(50),
				  password varchar(50),
                  email varchar(50),
                  primary key (username));

create table vaccine(vaccine_name varchar(20),
					 temperature float NOT NULL,
                     vaccine_quantity int NOT NULL,
                     cost double NOT NULL,
                     Primary Key (vaccine_name));
                     
create table country(country_id smallint, 
					 vaccine_name varchar(20),
                     country_name varchar(50) NOT NULL,
                     population int NOT NULL,
                     cost int NOT NULL,
                     percentage_vaccinated float NOT NULL,
                     primary key (country_id, vaccine_name),
                     foreign key (vaccine_name) references vaccine(vaccine_name)
                     on delete cascade  on update cascade
                     );
                     

create table vaccine_order(order_id mediumint,
					vaccine_name varchar(20),
					country_id smallint,
					quantity integer not null, 
					order_date date not null,
                    Primary key(order_id, vaccine_name),
                    foreign key (country_id, vaccine_name) references country(country_id, vaccine_name) on delete cascade   on update cascade
                    ,
                    foreign key (vaccine_name) references vaccine(vaccine_name) on delete cascade    on update cascade
                    );

create table state(
        state_id smallint not null,
        vaccine_name varchar(50) ,
        country_id smallint ,
        state_name varchar(50),
        population bigint not null, 
        percentage float4,
        PRIMARY KEY(state_id,vaccine_name),
            foreign key (country_id, vaccine_name)
            references country(country_id,vaccine_name)
            on delete cascade  on update cascade
);

create table zip_code(
        zip_code mediumint,
        vaccine_name varchar(50) ,
        state_id smallint not null,
        percentage float4 not null,
        num_vaccination_center smallint not null,
            PRIMARY KEY(zip_code,vaccine_name),
            foreign key (state_id,vaccine_name)
            references state(state_id,vaccine_name)
            on delete cascade on update cascade
);

create table person(
        person_id varchar(50),
        vaccine_name varchar(50),
        person_zip_code mediumint not null,
        vaccine_received boolean,
        person_name varchar(50),
        person_age smallint,
            PRIMARY KEY(person_id,vaccine_name),
            foreign key (person_zip_code,vaccine_name)
            references zip_code(zip_code,vaccine_name)
            on delete cascade  on update cascade
);
-- create index per_age
-- on person(person_age);

-- create index cou_pop
-- on country(population);

-- create index sta_id
-- on state(state_id);

-- create index zip_id
-- on zip_code(zip_code);

-- create index vorder_id
-- on vaccine_order(order_id);

					-- foreign key (country_id)
-- 					References country(country_id));

                     
