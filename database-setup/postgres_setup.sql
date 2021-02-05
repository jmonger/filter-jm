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

create sequence users_id_seq increment 1 start 1 owned by users.id;

insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Arline', 'Dresse', 'Web Designer III', 100);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Glory', 'Walton', 'Tax Accountant', 41);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Morly', 'Queyos', 'Electrical Engineer', 88);
insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'), 'Moss', 'Sobey', 'Pharmacist', 63);
--insert into users (id, firstname, surname, role, age) values (5, 'Northrup', 'Loftie', 'Environmental Tech', 29);
--insert into users (id, firstname, surname, role, age) values (6, 'Gracie', 'Brockie', 'Business Systems Development Analyst', 92);
--insert into users (id, firstname, surname, role, age) values (7, 'Brynn', 'Stallwood', 'GIS Technical Architect', 4);
--insert into users (id, firstname, surname, role, age) values (8, 'Meggi', 'Solesbury', 'Analyst Programmer', 7);
--insert into users (id, firstname, surname, role, age) values (9, 'Ivar', 'Tuminelli', 'Nurse', 56);
--insert into users (id, firstname, surname, role, age) values (10, 'Allard', 'Foxall', 'Analyst Programmer', 85);
--insert into users (id, firstname, surname, role, age) values (11, 'Cos', 'Broun', 'Media Manager II', 14);
--insert into users (id, firstname, surname, role, age) values (12, 'Thom', 'Prew', 'Structural Engineer', 53);
--insert into users (id, firstname, surname, role, age) values (13, 'Shandie', 'Kubik', 'Mechanical Systems Engineer', 56);
--insert into users (id, firstname, surname, role, age) values (14, 'Chandra', 'Eddington', 'Accounting Assistant II', 47);
--insert into users (id, firstname, surname, role, age) values (15, 'Nedi', 'Privost', 'Librarian', 26);
--insert into users (id, firstname, surname, role, age) values (16, 'Mayne', 'Francesco', 'Compensation Analyst', 22);
--insert into users (id, firstname, surname, role, age) values (17, 'Geri', 'Gabbitus', 'Community Outreach Specialist', 75);
--insert into users (id, firstname, surname, role, age) values (18, 'Nicola', 'Pettingall', 'Speech Pathologist', 70);
--insert into users (id, firstname, surname, role, age) values (19, 'Clemence', 'Ruegg', 'Project Manager', 88);
--insert into users (id, firstname, surname, role, age) values (20, 'Leoline', 'Niccols', 'Senior Developer', 99);
--insert into users (id, firstname, surname, role, age) values (21, 'Estell', 'Reppaport', 'Senior Editor', 13);
--insert into users (id, firstname, surname, role, age) values (22, 'Clayson', 'Romei', 'Community Outreach Specialist', 21);
--insert into users (id, firstname, surname, role, age) values (23, 'Thedric', 'Poizer', 'Clinical Specialist', 90);
--insert into users (id, firstname, surname, role, age) values (24, 'Oralee', 'Kirkup', 'Senior Sales Associate', 15);
--insert into users (id, firstname, surname, role, age) values (25, 'Cristie', 'Bradder', 'Developer III', 35);
--insert into users (id, firstname, surname, role, age) values (26, 'Adriaens', 'Lackington', 'Assistant Manager', 25);
--insert into users (id, firstname, surname, role, age) values (27, 'Ariadne', 'Lightwood', 'Research Assistant IV', 67);
--insert into users (id, firstname, surname, role, age) values (28, 'Cheslie', 'Benninck', 'Senior Financial Analyst', 91);
--insert into users (id, firstname, surname, role, age) values (29, 'Henderson', 'Lidstone', 'Programmer Analyst III', 17);
--insert into users (id, firstname, surname, role, age) values (30, 'Tonnie', 'Tallquist', 'Business Systems Development Analyst', 98);
--insert into users (id, firstname, surname, role, age) values (31, 'Alena', 'Scraney', 'Nurse Practicioner', 91);
--insert into users (id, firstname, surname, role, age) values (32, 'Kenneth', 'Kment', 'Business Systems Development Analyst', 75);
--insert into users (id, firstname, surname, role, age) values (33, 'Terry', 'Bidwell', 'Analyst Programmer', 97);
--insert into users (id, firstname, surname, role, age) values (34, 'Mariann', 'Moger', 'Software Engineer III', 37);
--insert into users (id, firstname, surname, role, age) values (35, 'Raymond', 'Dudeney', 'Office Assistant II', 34);
--insert into users (id, firstname, surname, role, age) values (36, 'Brooke', 'Sange', 'Safety Technician II', 54);
--insert into users (id, firstname, surname, role, age) values (37, 'Leona', 'MacGruer', 'Electrical Engineer', 16);
--insert into users (id, firstname, surname, role, age) values (38, 'Archy', 'Bettanay', 'Staff Scientist', 94);
--insert into users (id, firstname, surname, role, age) values (39, 'Minette', 'Reavey', 'Developer III', 52);
--insert into users (id, firstname, surname, role, age) values (40, 'Candida', 'Monshall', 'Financial Analyst', 81);
--insert into users (id, firstname, surname, role, age) values (41, 'Alasdair', 'Gatherell', 'Account Representative III', 5);
--insert into users (id, firstname, surname, role, age) values (42, 'Arabel', 'Hastings', 'Engineer I', 96);
--insert into users (id, firstname, surname, role, age) values (43, 'Cecilla', 'Bartlomiejczyk', 'Structural Engineer', 57);
--insert into users (id, firstname, surname, role, age) values (44, 'Marmaduke', 'Larkworthy', 'Teacher', 17);
--insert into users (id, firstname, surname, role, age) values (45, 'D''arcy', 'Sheirlaw', 'Chief Design Engineer', 20);
--insert into users (id, firstname, surname, role, age) values (46, 'Lauretta', 'Comiam', 'Administrative Assistant I', 42);
--insert into users (id, firstname, surname, role, age) values (47, 'Zak', 'Stutter', 'Legal Assistant', 96);
--insert into users (id, firstname, surname, role, age) values (48, 'Silvie', 'Gisborne', 'Human Resources Manager', 48);
--insert into users (id, firstname, surname, role, age) values (49, 'Hanan', 'Bruckshaw', 'Analog Circuit Design manager', 89);
--insert into users (id, firstname, surname, role, age) values (50, 'Elnora', 'Rowbottam', 'Staff Scientist', 48);