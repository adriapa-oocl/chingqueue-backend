CREATE TABLE MOVIE_DETAILS
(
    movie_details_id int auto_increment primary key,
    movie_id int not null,
    movie_description varchar(255) not null,
    movie_genre varchar(255) not null
);