package com.guitarstore.order;

import com.guitarstore.order.model.Guitar;
import com.guitarstore.order.model.Guitarmodel;
import com.guitarstore.order.model.Order;
import com.guitarstore.order.web.controller.OrderController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * Order Controller
     */
    @Autowired
    OrderController orderController;

    /**
     * Initialize Guitarmodel Object For Tests
     *
     * @param guitarid
     * @return
     */
    private Guitarmodel initGuitarmodel(final Integer guitarid) {
        Guitarmodel guitarmodel = new Guitarmodel(guitarid);
        return guitarmodel;
    }

    /**
     * Get All Orders (Only for Tests)
     */
    @Test
    public void getOrdersTest() {
        List<Order> orders = orderController.getOrders();
        Assert.assertNotNull(orders);
    }

    /**
     * Get All Orders By User id Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void getOrdersByUserTest() {
        orderController.addOrder(1, 1);
        List<Order> orders = orderController.getOrdersByUser(1);
        Assert.assertNotNull(orders);
    }

    /**
     * Get Three first Guitars Test
     */
    @Test
    public void getGuitarByOrder() {
        List<Guitar> guitars = orderController.getGuitarByOrder();
        Assert.assertEquals(guitars.size(), 3);
    }

    /**
     * Add Order Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void addOrderTest() {
        orderController.addOrder(1, 1);
    }

    /**
     * Delete Order Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void deleteOrderByIdTest() {
        orderController.addOrder(1, 1);
        List<Order> orders = orderController.getOrders();
        orderController.deleteOrder(orders.get(orders.size() - 1).getOrderid());
    }

    /**
     * Add Guitarmodel Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void addGuitarmodelTest() {
        Guitarmodel guitarmodel = this.initGuitarmodel(1);
        orderController.addModel(guitarmodel);
    }

    /**
     * Delete Guitarmodel Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void deleteGuitarmodelTest() {
        orderController.deleteGuitarModelForOrder(1);
    }
}
