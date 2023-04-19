package ru.AndMosc.datastoragehibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.AndMosc.datastoragehibernate.model.Order;
import ru.AndMosc.datastoragehibernate.services.OrderServices;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class OrderController {
    private final OrderServices orderServices;

    @RequestMapping("/fetch-product")
    public List<Order> getProductName(@RequestParam(name = "name") String name) {
        return orderServices.getProductName(name);
    }

}
