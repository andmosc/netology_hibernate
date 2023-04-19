package ru.AndMosc.datastoragehibernate.services;

import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

public interface OrderServices {
    List<Order> getProductName(String name);
}

