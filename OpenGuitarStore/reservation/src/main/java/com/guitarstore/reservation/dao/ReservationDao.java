package com.guitarstore.reservation.dao;

import com.guitarstore.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Reservation Dao Repository For Reservation MicroService
 */
@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer> {
}
