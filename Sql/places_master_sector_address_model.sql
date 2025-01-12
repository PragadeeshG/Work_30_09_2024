create table if not exists places_master_sector_address_model(
places_master_key Integer not null,
place_type varchar(255) null,
places_origin varchar(255) null,
address_line1 varchar(255) null,
address_line2 varchar(255) null,
address_line3 varchar(255) null,
address_line4 varchar(255) null,
address_line5 varchar(255) null,
city varchar(255) null,
state varchar(255) null,
country_code varchar(255) null,
is_default char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint places_master_sector_address_model_pk primary key(places_master_key));