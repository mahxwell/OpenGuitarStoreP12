package com.guitarstore.order.dao;

import com.guitarstore.order.model.Guitarmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface GuitarmodelDao extends JpaRepository<Guitarmodel, Integer> {

        List<Guitarmodel> findGuitarmodelsByGuitaridguitarOrderByGuitarmodelid(@PathVariable int guitaridguitar);
}
