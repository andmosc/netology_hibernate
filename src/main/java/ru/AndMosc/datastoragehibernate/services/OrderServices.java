package ru.AndMosc.datastoragehibernate.services;

import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

public interface OrderServices {
    List<String> getProductName(String name);
}

