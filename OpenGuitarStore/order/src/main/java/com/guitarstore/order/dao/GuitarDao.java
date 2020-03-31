package com.guitarstore.order.dao;

import com.guitarstore.order.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {
    Guitar findById(int id);
}
