package ru.AndMosc.datastoragehibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

public interface OrderDao {
    List<Order> getProductName(String name);
}
