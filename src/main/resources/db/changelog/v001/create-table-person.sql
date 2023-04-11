--liquibase formatted sql

--changeset AndMosc:create-table-person
CREATE TABLE person
(
    name           varchar(255)       NOT NULL,
    surname        varchar(255)       NOT NULL,
    age            smallint           NOT NULL CHECK ( age >= 0 AND age <= 100),
    phone_number   varchar(15) UNIQUE NOT NULL,
    city_of_living varchar(100)       NOT NULL,
    PRIMARY KEY (name, surname, age)
);