package com.guitarstore.guitar.dao;

import com.guitarstore.guitar.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {

    Guitar findById(int id);
}
