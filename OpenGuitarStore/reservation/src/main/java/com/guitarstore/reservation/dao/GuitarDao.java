package com.guitarstore.reservation.dao;

import com.guitarstore.reservation.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Guitar Dao Repository For Reservation MicroService
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
