create table users
(
    id         uuid,
    last_name  varchar(1024),
    first_name varchar(1024),
    constraint users_pk primary key (id)
)