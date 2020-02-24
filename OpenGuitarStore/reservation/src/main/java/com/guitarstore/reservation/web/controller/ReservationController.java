package com.guitarstore.reservation.web.controller;

import com.guitarstore.reservation.dao.ReservationDao;
import com.guitarstore.reservation.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController implements HealthIndicator {

    @Autowired
    ReservationDao reservationDao;

    @Override
    public Health health() {

        List<Reservation> reservations = reservationDao.findAll();

        if (reservations.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @GetMapping("/findall")
    public Reservation findAll() {

        List<Reservation> customers = reservationDao.findAll();
        System.out.println(customers);
        return customers.get(0);

    }

}
