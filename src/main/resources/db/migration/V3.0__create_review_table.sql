CREATE TABLE REVIEW
(
    review_id int primary key auto_increment,
    rating varchar(255),
    user_id int,
    review_content varchar(255),
    Create_Dt DATE,
    movie_fk int,
    foreign key (movie_fk) references movie(movie_id)
);