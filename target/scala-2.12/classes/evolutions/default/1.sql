# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  line1                         varchar(255) not null,
  line2                         varchar(255),
  line3                         varchar(255),
  constraint pk_address primary key (line1)
);

create table department (
  name                          varchar(255) not null,
  description                   varchar(255),
  constraint pk_department primary key (name)
);

create table employee (
  emp_id                        bigint auto_increment not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  address_line1                 varchar(255),
  age                           integer not null,
  position                      varchar(255),
  constraint uq_employee_address_line1 unique (address_line1),
  constraint pk_employee primary key (emp_id)
);

create table project (
  project_name                  varchar(255) not null,
  category                      varchar(255),
  description                   varchar(255),
  constraint pk_project primary key (project_name)
);

create table project_employee (
  project_project_name          varchar(255) not null,
  employee_emp_id               bigint not null,
  constraint pk_project_employee primary key (project_project_name,employee_emp_id)
);

create table user (
  position                      varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table employee add constraint fk_employee_address_line1 foreign key (address_line1) references address (line1) on delete restrict on update restrict;

alter table project_employee add constraint fk_project_employee_project foreign key (project_project_name) references project (project_name) on delete restrict on update restrict;
create index ix_project_employee_project on project_employee (project_project_name);

alter table project_employee add constraint fk_project_employee_employee foreign key (employee_emp_id) references employee (emp_id) on delete restrict on update restrict;
create index ix_project_employee_employee on project_employee (employee_emp_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_address_line1;

alter table project_employee drop constraint if exists fk_project_employee_project;
drop index if exists ix_project_employee_project;

alter table project_employee drop constraint if exists fk_project_employee_employee;
drop index if exists ix_project_employee_employee;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

drop table if exists project_employee;

drop table if exists user;

