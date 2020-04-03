package com.guitarstore.order.dao;

import com.guitarstore.order.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Guitar Dao Repository For Order MicroService
 */
@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {

    /**
     * Find One Guitar By Guitar Id
     *
     * @param id
     * @return
     */
    Guitar findById(int id);
}
