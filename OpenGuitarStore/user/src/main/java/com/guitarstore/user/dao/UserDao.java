package com.guitarstore.user.dao;

import com.guitarstore.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {


    User findByMailAndPassword(String mail, String password);

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findit(int i);
}
