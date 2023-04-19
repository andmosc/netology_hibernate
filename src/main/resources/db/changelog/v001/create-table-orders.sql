--liquibase formatted sql

--changeset AndMosc:create-table-orders
CREATE TABLE orders
(
    id           serial,
    customer_id  int,
    product_name varchar(255) NOT NULL,
    amount       int check ( amount > 0 ),
    date         date         NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES orders (id) ON DELETE CASCADE
);