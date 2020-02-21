package com.guitarstore.user.web.controller;

import com.guitarstore.user.dao.UserDao;
import com.guitarstore.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements HealthIndicator {

    @Autowired
    UserDao userDao;

    @Override
    public Health health() {

        List<User> users= userDao.findAll();

        if(users.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    @GetMapping("/findall")
    public User findAll() {

        List<User> customers = userDao.findAll();
        System.out.println(customers);
        return customers.get(0);

    }

}
