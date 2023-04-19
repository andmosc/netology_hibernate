package ru.AndMosc.datastoragehibernate.dao;

import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

public interface OrderDao {
    List<Order> getProductName(String name);
}
