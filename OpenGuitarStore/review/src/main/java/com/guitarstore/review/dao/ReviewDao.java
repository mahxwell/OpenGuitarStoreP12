package com.guitarstore.review.dao;

import com.guitarstore.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {

    @Query("SELECT r FROM Review r WHERE r.guitaridguitar = ?1")
    public List<Review> getReviewsByGuitarId(@PathVariable int guitaridguitar);
}
