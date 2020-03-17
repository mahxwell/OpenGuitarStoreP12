package com.guitarstore.user.web.controller;

import com.guitarstore.user.dao.UserDao;
import com.guitarstore.user.model.User;
import com.guitarstore.user.web.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController implements HealthIndicator {

    @Autowired
    UserDao userDao;

    @Override
    public Health health() {

        List<User> users = userDao.findAll();

        if (users.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @CrossOrigin
    @GetMapping("/findall")
    public List<User> findAll() {

        List<User> customers = userDao.findAll();
        return customers;

    }


    //Récuperer un produit par son id
    @GetMapping(value = "/user/{id}")
    public Optional<User> recupererUnUser(@PathVariable int id) {

        Optional<User> user = userDao.findit(id);

        if (!user.isPresent())
            throw new UserNotFoundException("L utilisateur correspondant à l'id " + id + " n'existe pas");

        return user;
    }
}
