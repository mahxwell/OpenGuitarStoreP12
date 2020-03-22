package com.guitarstore.guitar.dao;

import com.guitarstore.guitar.model.Guitarmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuitarmodelDao extends JpaRepository<Guitarmodel, Integer> {

    @Query("SELECT gm FROM Guitarmodel gm WHERE gm.guitaridguitar = ?1")
    List<Guitarmodel> findStock(int guitarmodelid);
}
