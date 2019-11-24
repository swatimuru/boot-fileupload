create database bookapi;
use bookapi;

select * from book;

SELECT * FROM bookapi.book;


SELECT @@global.time_zone, @@session.time_zone;
SET @@global.time_zone = '+00:00';
SET @@session.time_zone = '+00:00';

truncate table book;

create database studentapi;
use studentapi;

select * from student;
truncate table student;

create database employee;
use employee;
select * from employees;
select * from user;



insert into user values('$2a$10$ihUYi6H47SztMzX4ZEcsluuYew7XWqogHW8g9IJtQeE5B/n2EW6W2','swathi');



