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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Rest Controller for Order MicroService
 */
@RestController
public class OrderController implements HealthIndicator {

    /**
     * Order Dao
     */
    @Autowired
    OrderDao orderDao;

    /**
     * Guitarmodel Dao
     */
    @Autowired
    GuitarmodelDao guitarmodelDao;

    /**
     * Guitar Dao
     */
    @Autowired
    GuitarDao guitarDao;

    /**
     * Health Indicator
     *
     * @return
     */
    @Override
    public Health health() {
        List<Order> orders = orderDao.findAll();
        if (orders.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    /**
     * Get All Orders (Used just for testing)
     *
     * @return
     */
    @CrossOrigin
    @GetMapping("/orders")
    public List<Order> getOrders() {
        List<Order> orders = orderDao.findAll();
        return orders;
    }

    /**
     * Get All Orders By User id
     *
     * @param userid
     * @return
     */
    @CrossOrigin
    @GetMapping("/orders/{userid}")
    public List<Order> getOrdersByUser(@PathVariable int userid) {
        List<Order> orders = orderDao.findORderByCostumeridcostumer(userid);
        return orders;
    }

    /**
     * Get Order For Welcome Menu
     *
     * @return
     */
    @CrossOrigin
    @GetMapping("/welcomeorder")
    public List<Guitar> getGuitarByOrder() {
        List<Guitar> guitars = guitarDao.findAll();
        List<Guitar> guitarsToThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            guitarsToThree.add(guitars.get(i));
        }
        return guitarsToThree;
    }

    /**
     * ADDING A NEW ORDER : Two Part of Adding a New Order :
     * => Add a New Order
     * THEN
     * =>Delete One GuitarModel Obj FROM Stock
     */

    /**
     * First Add a New Order To Database
     *
     * @param guitarid
     * @param userid
     */
    @CrossOrigin
    @PostMapping("/orders/add/{guitarid}/{userid}")
    public void addOrder(@PathVariable int guitarid, @PathVariable int userid) {

        /**
         * Find FIRST Guitarmodel with given Guitar id
         */
        Order order = new Order();
        List<Guitarmodel> guitarmodels = guitarmodelDao.findGuitarmodelsByGuitaridguitarOrderByGuitarmodelid(guitarid);

        /**
         * Find Guitar with given Guitar id
         */
        Guitar guitar = guitarDao.findById(guitarid);

        /**
         * Create two Date
         * dateNowStr => Date now
         * dateToDelivery => Date of expected delivery (Add 3 days for shipping => just an example here)
         */
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String dateNowStr = format.format(new Date());

        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, 3);
        d = c.getTime();
        String dateToDelivery = format.format(d);

        /**
         * Set Order Object
         */

        if (guitarmodels != null && guitar != null) {
            order.setGuitarmodelidguitarmodel(guitarmodels.get(0).getGuitarmodelid());
            order.setGuitaridguitar(guitarid);
            order.setGuitarneme(guitar.getGuitarname());
            order.setGuitarimageurl(guitar.getGuitarimageurl());
            order.setOrderdate(dateNowStr);
            order.setOrderdeliverydate(dateToDelivery);
            order.setCostumeridcostumer(userid);
        }

        /**
         * Add Order Object previously set to Database
         */
        orderDao.save(order);
    }

    /**
     * Then Delete ONE Guitarmodel From guitarmodel Table => Minus one in Guitar Stock
     *
     * @param guitarid
     */
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

    /**
     * DELETING AN ORDER : Two Part of Deleting an Order :
     * => Delete an Order
     * THEN
     * =>Add One GuitarModel Obj TO Stock
     */

    /**
     * Delete Order by Id From Database
     *
     * @param id
     */
    @CrossOrigin
    @DeleteMapping("/orders/delete/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderDao.deleteById(id);
    }

    /**
     * Adding ('Re-adding') guitarmodel of Deleted Order to Database
     *
     * @param guitarmodel
     */
    @CrossOrigin
    @PostMapping("/orders/modeladd")
    public void addModel(@RequestBody Guitarmodel guitarmodel) {
        guitarmodelDao.save(guitarmodel);
    }

}
