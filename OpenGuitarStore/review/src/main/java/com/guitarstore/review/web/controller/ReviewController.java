package com.guitarstore.review.web.controller;

import com.guitarstore.review.dao.ReviewDao;
import com.guitarstore.review.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest Controller for Review MicroService
 */
@RestController
public class ReviewController implements HealthIndicator {

    /**
     * Review Dao
     */
    @Autowired
    ReviewDao reviewDao;

    /**
     * Health Indicator
     *
     * @return
     */
    @Override
    public Health health() {

        List<Review> reviews = reviewDao.findAll();

        if (reviews.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    /**
     * Get All Reviews (Used just for testing)
     *
     * @return
     */
    @CrossOrigin
    @GetMapping("/reviews")
    public List<Review> reviews() {
        List<Review> reviews = reviewDao.findAll();
        return reviews;
    }

    /**
     * Get Reviews List By Guitar Id
     *
     * @param guitaridguitar
     * @return
     */
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
    public Void addReview(@RequestBody Review review) {
        reviewDao.save(review);
        return null;
    }

    /**
     * Improvement to do next ?
     */
/*    @CrossOrigin
    @GetMapping("/reviews/average/{guitaridguitar}")
    public Integer getReviewsAverageByGuitar(@PathVariable int guitaridguitar) {
        List<Review> reviews = reviewDao.getReviewsByGuitarId(guitaridguitar);

        int finale = 0;
        if (!reviews.isEmpty()) {
            int result = 0;
            int n = reviews.size();
            for (int i = 0; i < n; i++) {
                result = result + reviews.get(i).getReviewnote();
            }

            finale = result / n;
        }
        return finale;
    }*/
}
