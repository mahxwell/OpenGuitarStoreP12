package com.guitarstore.order.dao;

import com.guitarstore.order.model.Guitarmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * GuitarModel Dao Repository For Order MicroService
 */
@Repository
public interface GuitarmodelDao extends JpaRepository<Guitarmodel, Integer> {

    /**
     * Get All Guitarmodel by Guitar Id Then Order id by Guitarmodel Id
     *
     * @param guitaridguitar
     * @return
     */
    List<Guitarmodel> findGuitarmodelsByGuitaridguitarOrderByGuitarmodelid(@PathVariable int guitaridguitar);
}
