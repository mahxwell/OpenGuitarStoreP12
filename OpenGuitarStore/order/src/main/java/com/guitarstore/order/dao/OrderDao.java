package com.guitarstore.order.dao;

import com.guitarstore.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

    List<Order> findORderByCostumeridcostumer(int userid);
}
