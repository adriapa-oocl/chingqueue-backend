CREATE TABLE CINEMA_SEAT
(
    cinema_seat_pk int auto_increment primary key,
    seat_Id int not null,
    cinema_Id int not null,
    availability boolean not null
);