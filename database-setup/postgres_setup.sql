drop database filterdb;
drop user filter;
create user filter with password 'password';
create database filterdb with template=template0 owner=filter;
\connect filterdb;
alter default privileges grant all on tables to filter;
alter default privileges grant all on sequences to filter;

create table users(
	id integer primary key not null,
	firstname varchar(50) not null,
	surname varchar(50) not null,
	role varchar(50) not null,
	age integer not null
);

create sequence users_id_seq increment 1 start 1000 owned by users.id;

insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Arline', 'Dresse', 'Web Designer III', 51);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Glory', 'Walton', 'Tax Accountant', 41);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Morly', 'Queyos', 'Electrical Engineer', 88);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Moss', 'Sobey', 'Pharmacist', 63);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Northrup', 'Loftie', 'Environmental Tech', 29);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Gracie', 'Brockie', 'Business Systems Development Analyst', 92);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Brynn', 'Stallwood', 'GIS Technical Architect', 24);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Meggi', 'Solesbury', 'Analyst Programmer', 37);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Ivar', 'Tuminelli', 'Nurse', 56);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Allard', 'Foxall', 'Analyst Programmer', 85);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Cos', 'Broun', 'Media Manager II', 24);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Thom', 'Prew', 'Structural Engineer', 53);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Shandie', 'Kubik', 'Mechanical Systems Engineer', 56);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Chandra', 'Eddington', 'Accounting Assistant II', 47);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Nedi', 'Privost', 'Librarian', 26);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Mayne', 'Francesco', 'Compensation Analyst', 22);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Geri', 'Gabbitus', 'Community Outreach Specialist', 75);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Nicola', 'Pettingall', 'Speech Pathologist', 70);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Clemence', 'Ruegg', 'Project Manager', 88);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Leoline', 'Niccols', 'Senior Developer', 99);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Estell', 'Reppaport', 'Senior Editor', 13);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Clayson', 'Romei', 'Community Outreach Specialist', 21);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Thedric', 'Poizer', 'Clinical Specialist', 90);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Oralee', 'Kirkup', 'Senior Sales Associate', 55);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Cristie', 'Bradder', 'Developer III', 35);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Adriaens', 'Lackington', 'Assistant Manager', 25);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Ariadne', 'Lightwood', 'Research Assistant IV', 67);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Cheslie', 'Benninck', 'Senior Financial Analyst', 91);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Henderson', 'Lidstone', 'Programmer Analyst III', 17);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Tonnie', 'Tallquist', 'Business Systems Development Analyst', 98);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Alena', 'Scraney', 'Nurse Practicioner', 91);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Kenneth', 'Kment', 'Business Systems Development Analyst', 75);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Terry', 'Bidwell', 'Analyst Programmer', 97);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Mariann', 'Moger', 'Software Engineer III', 37);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Raymond', 'Dudeney', 'Office Assistant II', 34);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Brooke', 'Sange', 'Safety Technician II', 54);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Leona', 'MacGruer', 'Electrical Engineer', 46);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Archy', 'Bettanay', 'Staff Scientist', 94);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Minette', 'Reavey', 'Developer III', 52);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Candida', 'Monshall', 'Financial Analyst', 81);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Alasdair', 'Gatherell', 'Account Representative III', 45);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Arabel', 'Hastings', 'Engineer I', 96);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Cecilla', 'Bartlomiejczyk', 'Structural Engineer', 57);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Marmaduke', 'Larkworthy', 'Teacher', 27);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'D''arcy', 'Sheirlaw', 'Chief Design Engineer', 20);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Lauretta', 'Comiam', 'Administrative Assistant I', 42);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Zak', 'Stutter', 'Legal Assistant', 96);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Silvie', 'Gisborne', 'Human Resources Manager', 48);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Hanan', 'Bruckshaw', 'Analog Circuit Design manager', 89);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Elnora', 'Rowbottam', 'Staff Scientist', 48);