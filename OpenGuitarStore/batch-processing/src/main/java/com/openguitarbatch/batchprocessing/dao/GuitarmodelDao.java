package com.openguitarbatch.batchprocessing.dao;

import com.openguitarbatch.batchprocessing.model.Guitarmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GuitarModel Dao Repository For BatchProcessing
 */
@Repository
public interface GuitarmodelDao extends JpaRepository<Guitarmodel, Integer> {

    /**
     * Allow to Find Remaining Stock for a Guitar Object
     *
     * @param guitarmodelid
     * @return
     */
    @Query("SELECT gm FROM Guitarmodel gm WHERE gm.guitaridguitar = ?1")
    List<Guitarmodel> findStock(int guitarmodelid);
}
