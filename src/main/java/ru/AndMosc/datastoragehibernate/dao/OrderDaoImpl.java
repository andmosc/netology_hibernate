package ru.AndMosc.datastoragehibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Order> getProductName(String name) {
        return entityManager.createNamedQuery("QUERY_GET_ALL_ORDERS_BY_NAME", Order.class).setParameter("name", name).getResultList();
    }
}
