package com.guitarstore.reservation.dao;

import com.guitarstore.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer> {
    List<Reservation> findReservationByCostumeridcostumer(int userid);
}
