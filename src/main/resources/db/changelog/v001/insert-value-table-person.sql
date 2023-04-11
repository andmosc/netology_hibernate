--liquibase formatted sql

--changeset AndMosc:insert-value-table-person
INSERT INTO person (name, surname, age, phone_number, city_of_living)
VALUES ('Андрей', 'Иванов', 25, +79270011000, 'Москва'),
       ('Максим', 'Петров', 27, +79270022000, 'Москва'),
       ('Александр', 'Сидоров', 35, +79270033000, 'Санкт-Петербург'),
       ('Ольга', 'Иванова', 28, +79270088000, 'Москва');