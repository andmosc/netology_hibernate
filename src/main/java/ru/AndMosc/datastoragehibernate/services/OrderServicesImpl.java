package ru.AndMosc.datastoragehibernate.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.OrderDao;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServicesImpl implements OrderServices {

    private final OrderDao orderDao;

    @Override
    public List<Order> getProductName(String name) {
        return orderDao.getProductName(name);
    }
}
