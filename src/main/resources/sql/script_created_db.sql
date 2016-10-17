drop database if exists traffic;
create database traffic;

use traffic;

create table users(
  id_user int NOT NULL AUTO_INCREMENT,
  first_name char(100), 
  last_name char(100),
  email char(100) NOT NULL,
  PRIMARY KEY (id_user)
);

create table user_traffic (
  id_user_traffic int NOT NULL AUTO_INCREMENT,
  id_user int NOT NULL,
  date_traffic datetime,
  uplink_traffic char(255),
  downlink_traffic char(255),
  PRIMARY KEY (id_user_traffic),
  FOREIGN KEY (id_user) REFERENCES users (id_user)
);

INSERT INTO users (id_user, first_name, last_name, email) VALUES
(1,'Sergey','Ivanov','sergo@mail.ru'),
(2,'Lena','Lenskaya','lenskay@yandex.ru'),
(3,'Oleg','Semin','lenskaya@gmail.ru'),
(4,'Viktor','Komlev','victor@mail.ru'),
(5,'Vera','Pobedova','verap@rambler.ru');

INSERT INTO user_traffic (id_user_traffic, id_user, date_traffic, uplink_traffic, downlink_traffic) VALUES
(1,2,'2011-04-11','10','20'),
(2,2,'2011-04-12','10','20'),
(3,2,'2011-04-13','10','20'),
(4,2,'2011-04-14','10','20'),
(5,3,'2011-04-11','10','20'),
(6,3,'2011-04-11','10','20'),
(7,5,'2011-04-11','10','20'),
(8,5,'2011-04-11','10','20');
