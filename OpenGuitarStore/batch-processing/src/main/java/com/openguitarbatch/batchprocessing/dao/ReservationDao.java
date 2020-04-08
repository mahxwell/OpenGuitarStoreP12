package com.openguitarbatch.batchprocessing.dao;

import com.openguitarbatch.batchprocessing.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Reservation Dao Repository For BatchProcessing
 */
@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer> {

    /**
     * Find Reservation List By User Id
     *
     * @param userid
     * @return
     */
    List<Reservation> findReservationByCostumeridcostumer(int userid);
}
