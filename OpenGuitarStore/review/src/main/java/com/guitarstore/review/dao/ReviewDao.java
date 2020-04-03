package com.guitarstore.review.dao;

import com.guitarstore.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Review Dao Repository For Review MicroService
 */
@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {

    /**
     * Find All Review List By Guitar Id
     *
     * @param guitaridguitar
     * @return
     */
    @Query("SELECT r FROM Review r WHERE r.guitaridguitar = ?1")
    public List<Review> getReviewsByGuitarId(@PathVariable int guitaridguitar);
}
