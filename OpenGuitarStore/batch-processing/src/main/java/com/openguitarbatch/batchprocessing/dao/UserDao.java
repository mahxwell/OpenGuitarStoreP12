package com.openguitarbatch.batchprocessing.dao;

import com.openguitarbatch.batchprocessing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User Dao Repository For BatchProcessing
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    User findUserById(int id);
}
