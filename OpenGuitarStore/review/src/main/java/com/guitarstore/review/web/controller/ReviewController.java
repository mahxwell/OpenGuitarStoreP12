package com.guitarstore.review.web.controller;

import com.guitarstore.review.dao.ReviewDao;
import com.guitarstore.review.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController implements HealthIndicator {

    @Autowired
    ReviewDao reviewDao;

    @Override
    public Health health() {

        List<Review> reviews = reviewDao.findAll();

        if (reviews.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @CrossOrigin
    @GetMapping("/findall")
    public Review findAll() {

        List<Review> customers = reviewDao.findAll();
        System.out.println(customers);
        return customers.get(0);

    }

    @CrossOrigin
    @GetMapping("/reviews/{guitaridguitar}")
    public List<Review> getReviewsByGuitarId(@PathVariable int guitaridguitar) {
        List<Review> reviews = reviewDao.getReviewsByGuitarId(guitaridguitar);
        return reviews;
    }

    /**
     * Add a New Review to DataBase
     *
     * @param review New Review Object to Add to Database
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/addreview")
    public Void addUser(@RequestBody Review review) {
            reviewDao.save(review);
            return null;
    }
}
