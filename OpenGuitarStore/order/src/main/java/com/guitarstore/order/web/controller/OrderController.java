package com.guitarstore.order.web.controller;

import com.guitarstore.order.dao.GuitarDao;
import com.guitarstore.order.dao.GuitarmodelDao;
import com.guitarstore.order.dao.OrderDao;
import com.guitarstore.order.model.Guitar;
import com.guitarstore.order.model.Guitarmodel;
import com.guitarstore.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController implements HealthIndicator {

    @Autowired
    OrderDao orderDao;

    @Autowired
    GuitarmodelDao guitarmodelDao;

    @Autowired
    GuitarDao guitarDao;

    @Override
    public Health health() {

        List<Order> orders = orderDao.findAll();

        if (orders.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @CrossOrigin
    @GetMapping("/orders")
    public List<Order> getOrders() {

        List<Order> orders = orderDao.findAll();
        return orders;

    }

    @CrossOrigin
    @GetMapping("/orders/{userid}")
    public List<Order> getOrdersByUser(@PathVariable int userid) {
        List<Order> orders = orderDao.findORderByCostumeridcostumer(userid);
        return orders;
    }


    /**
     * Adding a New Order => Delete One GuitarModel Obj FROM Stock
     */


    @CrossOrigin
    @PostMapping("/orders/add/{guitarid}/{userid}")
    public void addOrder(@PathVariable int guitarid, @PathVariable int userid) {
        Order order = new Order();
        List<Guitarmodel> guitarmodels = guitarmodelDao.findGuitarmodelsByGuitaridguitarOrderByGuitarmodelid(guitarid);
        Guitar guitar = guitarDao.findById(guitarid);
        Date d = new Date();
        String date = d.toString();
        if (guitarmodels != null && guitar != null) {
            order.setGuitarmodelidguitarmodel(guitarmodels.get(0).getGuitarmodelid());
            order.setGuitaridguitar(guitarid);
            order.setGuitarneme(guitar.getGuitarname());
            order.setOrderdate(date);
            order.setOrderdeliverydate(date);
            order.setCostumeridcostumer(userid);
        }
        orderDao.save(order);
    }


    @CrossOrigin
    @DeleteMapping("/orders/modeldelete/{guitarid}")
    public void deleteGuitarModelForOrder(@PathVariable int guitarid) {
        List<Guitarmodel> guitarmodels = guitarmodelDao.findGuitarmodelsByGuitaridguitarOrderByGuitarmodelid(guitarid);
        if (guitarmodels != null)
            guitarmodelDao.deleteById(guitarmodels.get(0).getGuitarmodelid());
        else
            return;
    }


    /**
     * Deleting a Existing Order => Add One GuitarModel Obj TO Stock
     */

    @CrossOrigin
    @DeleteMapping("/orders/delete/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderDao.deleteById(id);
    }

    @CrossOrigin
    @PostMapping("/orders/modeladd")
    public void addModel(@RequestBody Guitarmodel guitarmodel) {
        guitarmodelDao.save(guitarmodel);
    }

}
