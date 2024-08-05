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

insert into person(first_name, last_name) values ('John', 'Smith');
insert into person(first_name, last_name) values ('Jane', 'Smith');

insert into passport(number, country, person_id) values ('BM2013483', 'BY', 1);
insert into passport(number, country, person_id) values ('BM2012383', 'BY', 2);

insert into author (name) values ('Stephen King');
insert into author (name) values ('Mark Twain');
insert into author (name) values ('Marcel Proust');

insert into book(title, isbn) values ('11/22/63: A Novel', '0019034210');
insert into book(title, isbn) values ('Doctor Sleep: A Novel', '0019034211');
insert into book(title, isbn) values ('In Search of Lost Time', '0019034212');

insert into book_authors(book_id, author_id) values (1, 1);
insert into book_authors(book_id, author_id) values (1, 2);
insert into book_authors(book_id, author_id) values (2, 2);

insert into post (content) values ('Post 1');
insert into post (content) values ('Post 2');

insert into comment(content) values ('Comment 1');
insert into comment(content) values ('Comment 2');
UPDATE comment SET post_id = 1 WHERE
comment.id
 = 1;
UPDATE comment SET post_id = 1 WHERE
comment.id
 = 2;

insert into phone(number) values ('111');
insert into phone(number) values ('222');

insert into subscriber (first_name, last_name) values ('John', 'Doe');
insert into subscriber (first_name, last_name) values ('Jane', 'Deer');

UPDATE phone SET subscriber_id = 1 WHERE id = 1;
UPDATE phone SET subscriber_id = 1 WHERE id = 2;

delete from album;
delete from artist;

insert into album (title) values ('Tennessee ');
insert into album (title) values ('Promised Land ');
insert into album (title) values ('Don''t Be Cruel');

insert into artist(name) values ('Elvis Presley');
insert into artist(name) values ('Elton John');
insert into artist(name) values ('Pink Floyd');

insert into album_artists(artist_id, album_id) values (1, 1);
insert into album_artists(artist_id, album_id) values (2, 1);
insert into album_artists(artist_id, album_id) values (2, 2);
insert into album_artists(artist_id, album_id) values (3, 3);