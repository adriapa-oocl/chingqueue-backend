  CREATE TABLE MOVIES_REVIEWS
  (
  review_id int auto_increment primary key,
  movie_details_id int not null,
  user_id int not null,
  create_dt DATE,
  review_content varchar(max) not null
  );