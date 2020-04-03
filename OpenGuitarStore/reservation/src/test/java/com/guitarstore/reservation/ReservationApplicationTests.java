package com.guitarstore.reservation;

import com.guitarstore.reservation.model.Reservation;
import com.guitarstore.reservation.web.controller.ReservationController;
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
public class ReservationApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * Reservation Controller
     */
    @Autowired
    ReservationController reservationController;

    /**
     * Get All Reservations Test
     */
    @Test
    public void reservationsTest() {
        List<Reservation> reservations = reservationController.reservations();
        Assert.assertNotNull(reservations);
    }

    /**
     * Get Reservation by User id
     */
    @Transactional
    @Rollback(true)
    @Test
    public void findReservationsByUserid() {
        reservationController.addReservation(1, 1);
        List<Reservation> reservations = reservationController.findReservationsByUserid(1);
        Assert.assertNotNull(reservations);
    }

    /**
     * Add Reservation Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void addReservationTest() {
        reservationController.addReservation(1, 1);
    }

	/**
	 * Delete Reservation by Id Test
	 */
	@Transactional
	@Rollback(true)
	@Test
    public void deleteReservationTest() {
        reservationController.addReservation(1, 1);
        List<Reservation> reservations = reservationController.reservations();
        reservationController.deleteReservation(reservations
                .get(reservations.size() - 1).getReservationid());
    }
}
