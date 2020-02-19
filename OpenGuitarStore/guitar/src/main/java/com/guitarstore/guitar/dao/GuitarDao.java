package com.guitarstore.guitar.dao;

import com.guitarstore.guitar.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {
}
