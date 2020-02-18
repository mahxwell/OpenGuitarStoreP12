package com.pruduct.dao;

import com.pruduct.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GuitarDao extends JpaRepository<Guitar, Integer> {
}
