drop database if exists teststruts2;
create database teststruts2;
use teststruts2;
create table users(
username varchar(255),password varchar(255)
);
insert into users values('kitajima','111'),('taro','222'),('hanako','333');
