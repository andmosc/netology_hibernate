package ru.AndMosc.datastoragehibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
    @Query(value = "select o.productName from Order o left join Customer c ON o.customer = c.id WHERE c.name = :name")
    List<String> getProductName(@Param("name") String name);
}
