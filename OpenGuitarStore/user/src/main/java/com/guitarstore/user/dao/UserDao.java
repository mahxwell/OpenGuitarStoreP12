package com.guitarstore.user.dao;

import com.guitarstore.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User Dao Repository For User MicroService
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    /**
     * Find User by Mail and Password for Authentications
     *
     * @param mail
     * @param password
     * @return
     */
    User findByMailAndPassword(String mail, String password);

    /**
     * Find User by Id
     *
     * @param id
     * @return
     */
    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findit(int id);
}
