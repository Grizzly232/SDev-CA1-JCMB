# --- !Ups

delete from user;

insert into user (email,name,password,position) values ( 'programmer@jcmb.com', 'Peter Programmer', 'password', 'java' );

insert into user (email,name,password,position) values ( 'supervisor@jcmb.com', 'Sam Supervisor', 'password', 'super' );