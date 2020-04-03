package com.guitarstore.review;

import com.guitarstore.review.model.Review;
import com.guitarstore.review.web.controller.ReviewController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * Review Controller
     */
    @Autowired
    ReviewController reviewController;

    /**
     * Review Constructor for Tests
     *
     * @param reviewdate
     * @param reviewcomment
     * @param reviewnote
     * @param reviewcostumername
     * @param guitaridguitar
     * @param costumeridcostumer
     * @return
     */
    private Review initReview(final String reviewdate,
                              final String reviewcomment,
                              final Integer reviewnote,
                              final String reviewcostumername,
                              final Integer guitaridguitar,
                              final Integer costumeridcostumer) {
        Review review = new Review(reviewdate,
                reviewcomment,
                reviewnote,
                reviewcostumername,
                guitaridguitar,
                costumeridcostumer);
        return review;
    }

    /**
     * Find ALl Reviews Test
     */
    @Test
    public void reviewsTest() {
        List<Review> reviews = reviewController.reviews();
        Assert.assertNotNull(reviews);
    }

    /**
     * Find All Reviews By Guitar Test
     */
    @Test
    public void getReviewsByGuitarIdTest() {
        List<Review> reviews = reviewController.getReviewsByGuitarId(1);
        Assert.assertNotNull(reviews);
    }

    /**
     * Add a new Review to Database Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void addReviewTest() {
        Review review = this.initReview((new Date()).toString(),
                "Cool",
                7,
                "Bob",
                1,
                1);
        reviewController.addReview(review);
    }
}
