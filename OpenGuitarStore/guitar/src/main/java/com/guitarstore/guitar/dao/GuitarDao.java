package com.guitarstore.guitar.dao;

import com.guitarstore.guitar.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Guitar Dao Repository For Guitar MicroService
 */
@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {

    /**
     * Find One Guitar By Guitar Id
     *
     * @param id
     * @return
     */
    Guitar findById(int id);

    /**
     * Find a Guitar List By Guitar Name => Search Engine
     *
     * @param search String Input
     * @return
     */
    List<Guitar> findGuitarByGuitarnameLike(String search);
}
