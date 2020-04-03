package com.guitarstore.reservation.web.controller;

import com.guitarstore.reservation.dao.GuitarDao;
import com.guitarstore.reservation.dao.ReservationDao;
import com.guitarstore.reservation.model.Guitar;
import com.guitarstore.reservation.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Rest Controller for Reservation MicroService
 */
@RestController
public class ReservationController implements HealthIndicator {

    /**
     * Reservation Dao
     */
    @Autowired
    ReservationDao reservationDao;

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

        List<Reservation> reservations = reservationDao.findAll();

        if (reservations.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    /**
     * Get All Reservations From Database
     *
     * @return
     */
    @CrossOrigin
    @GetMapping("/reservations")
    public List<Reservation> reservations() {
        List<Reservation> reservations = reservationDao.findAll();
        return reservations;
    }

    /**
     * Get All Reservations by User id From Database
     *
     * @param userid
     * @return
     */
    @CrossOrigin
    @GetMapping("/reservations/{userid}")
    public List<Reservation> findReservationsByUserid(@PathVariable int userid) {
        List<Reservation> reservations = reservationDao.findReservationByCostumeridcostumer(userid);
        return reservations;
    }

    /**
     * Add a New Reservation Object to Database
     *
     * @param guitarid
     * @param userid
     */
    @CrossOrigin
    @PostMapping("/reservations/add/{guitarid}/{userid}")
    public void addReservation(@PathVariable int guitarid, @PathVariable int userid) {

        Reservation reservation = new Reservation();
        Guitar guitar = guitarDao.findById(guitarid);

        /**
         * Add 7 days to Date now => Estimated time for new Stock (7 days for exemple)
         */
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, 7);
        d = c.getTime();
        String date = format.format(d);

        /**
         * Set Reservation Object thanks to guitar id and user id
         */
        reservation.setGuitarbrand(guitar.getGuitarbrand());
        reservation.setGuitarname(guitar.getGuitarname());
        reservation.setDeliverydate(date);
        reservation.setGuitarimageurl(guitar.getGuitarimageurl());
        reservation.setCostumeridcostumer(userid);
        reservation.setGuitaridguitar(guitarid);

        /**
         * Add Reservation Object previously set
         */
        reservationDao.save(reservation);
    }

    /**
     * Delete a Reservation Object by ID
     *
     * @param reservationid
     */
    @CrossOrigin
    @DeleteMapping("/reservations/delete/{reservationid}")
    public void deleteReservation(@PathVariable int reservationid) {
        reservationDao.deleteById(reservationid);
    }
}
