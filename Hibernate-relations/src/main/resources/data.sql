delete from address;
delete from employee;
delete from passport;
delete from person;
delete from books;
delete from authors;
delete from comment;
delete from post;
delete from phone;
delete from subscriber;

insert into address(city, street) values ('Vitebsk', 'Pobedy st.');
insert into address(city, street) values ('Vitebsk', 'Moskow st.');
insert into address(city, street) values ('Minsk', 'Pobediteley st.');
insert into address(city, street) values ('Vitebsk', 'Stroiteley st.');

insert into employee(first_name, last_name, age, address_id) values ('Ivan', 'Ivanov', 20, 1);
insert into employee(first_name, last_name, age, address_id) values ('Petr', 'Petrov', 21, 2);
insert into employee(first_name, last_name, age, address_id) values ('John', 'Petrov', 21, 3);

