CREATE TABLE USER
(
    user_id int auto_increment primary key,
    full_name varchar(255) not null,
    Username varchar(255) not null,
    Password varchar(255) not null,
    Address varchar(255),
    Contact_num varchar(255),
    Create_Dt DATE
);