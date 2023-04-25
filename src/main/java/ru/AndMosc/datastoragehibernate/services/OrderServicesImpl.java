package ru.AndMosc.datastoragehibernate.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.AndMosc.datastoragehibernate.dao.OrderDao;
import ru.AndMosc.datastoragehibernate.model.Order;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServicesImpl implements OrderServices {

    private final OrderDao orderDao;

    @Override
    public List<String> getProductName(String name) {
        return orderDao.getProductName(name);
    }
}
