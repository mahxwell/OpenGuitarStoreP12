package com.guitarstore.order.web.controller;

import com.guitarstore.order.dao.OrderDao;
import com.guitarstore.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController implements HealthIndicator  {

    @Autowired
    OrderDao orderDao;

    @Override
    public Health health() {

        List<Order> orders= orderDao.findAll();

        if(orders.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @GetMapping("/findall")
    public Order findAll() {

        List<Order> customers = orderDao.findAll();
        System.out.println(customers);
        return customers.get(0);

    }

}
