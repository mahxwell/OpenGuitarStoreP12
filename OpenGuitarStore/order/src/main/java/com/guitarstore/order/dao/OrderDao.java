package com.guitarstore.order.dao;

import com.guitarstore.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Order  Dao Repository For Order MicroService
 */
@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

    /**
     * Find Order By User Id
     *
     * @param userid
     * @return
     */
    List<Order> findORderByCostumeridcostumer(int userid);
}
