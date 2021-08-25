CREATE TABLE CINEMA
(
    cinema_id int auto_increment primary key,
    cinema_company varchar(255) not null,
    cinema_location varchar(255) not null,
    movie_Id int not null,
    cinema_timeSlot varchar(255) not null
);