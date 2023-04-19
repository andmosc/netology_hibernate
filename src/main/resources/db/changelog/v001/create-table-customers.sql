--liquibase formatted sql

--changeset AndMosc:create-table-customers
CREATE TABLE customers
(
    id           serial,
    name         varchar(255) NOT NULL,
    surname      varchar(255) NOT NULL,
    age          int CHECK ( age >= 0 and age < 100),
    phone_number varchar(255) NOT NULL,
    PRIMARY KEY (id)
);