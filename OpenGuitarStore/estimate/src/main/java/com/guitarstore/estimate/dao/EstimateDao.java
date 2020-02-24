package com.guitarstore.estimate.dao;

import com.guitarstore.estimate.model.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimateDao extends JpaRepository<Estimate, Integer> {
}
