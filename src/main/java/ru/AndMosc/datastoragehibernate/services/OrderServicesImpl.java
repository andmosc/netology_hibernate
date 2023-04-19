package ru.AndMosc.datastoragehibernate.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.OrderDaoImpl;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServicesImpl implements OrderServices {

    private final OrderDaoImpl orderDao;

    @Override
    public List<Order> getProductName(String name) {
        return orderDao.getProductName(name);
    }
}
