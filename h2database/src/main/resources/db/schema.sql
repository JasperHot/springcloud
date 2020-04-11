create table if not exists USER (
ID int not null primary key auto_increment,
NAME varchar(100),
SEX varchar(1),
AGE NUMBER(3),
CREATE_TIME DATE,
MODIFY_TIME DATE);