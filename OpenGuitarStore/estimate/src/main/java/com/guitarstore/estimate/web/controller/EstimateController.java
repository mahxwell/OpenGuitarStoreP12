package com.guitarstore.estimate.web.controller;

import com.guitarstore.estimate.dao.EstimateDao;
import com.guitarstore.estimate.model.Estimate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstimateController  implements HealthIndicator {

    @Autowired
    EstimateDao estimateDao;

    @Override
    public Health health() {

        List<Estimate> estimates = estimateDao.findAll();

        if(estimates.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @GetMapping("/findall")
    public Estimate findAll() {

        List<Estimate> customers = estimateDao.findAll();
        System.out.println(customers);
        return customers.get(0);

    }
}
