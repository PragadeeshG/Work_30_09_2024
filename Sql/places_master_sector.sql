create table if not exists places_master_sector(
places_master_key Integer not null,
area_code Integer null,
effective_date varchar(255) null,
area_sequence Integer null,
port_auth varchar(255) null,
principal_facility varchar(255) null,
place_name varchar(255) null,
place_code varchar(255) null,
entity_state varchar(255) null,
modified_date varchar(255) null,
remarks varchar(255) null,
constraint places_master_sector_pk primary key(places_master_key));