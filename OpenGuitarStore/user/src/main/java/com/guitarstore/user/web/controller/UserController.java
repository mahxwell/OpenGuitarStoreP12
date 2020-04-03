package com.guitarstore.user.web.controller;

import com.guitarstore.user.dao.UserDao;
import com.guitarstore.user.model.User;
import com.guitarstore.user.web.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * Rest Controller for User MicroService
 */
@RestController
public class UserController implements HealthIndicator {

    /**
     * User Dao
     */
    @Autowired
    UserDao userDao;

    /**
     * Health Indicator
     *
     * @return
     */
    @Override
    public Health health() {

        List<User> users = userDao.findAll();

        if (users.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    /**
     * Get All Users (Used just for testing)
     *
     * @return
     */
    @CrossOrigin
    @GetMapping("/findall")
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        return users;
    }


    /**
     * Get User by Identification Number
     *
     * @param id User Indentification Number
     * @return
     */
    @GetMapping(value = "/user/{id}")
    public Optional<User> getOneUser(@PathVariable int id) {

        Optional<User> user = userDao.findit(id);
        if (!user.isPresent())
            throw new UserNotFoundException("L utilisateur correspondant à l'id " + id + " n'existe pas");
        return user;
    }

    /**
     * Get User By Mail And Password -> To Log to session
     *
     * @param mail     User Mail Address
     * @param password User Password
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/get/{mail}/{password}")
    public User getUser(@PathVariable String mail, @PathVariable String password) {

        User user = userDao.findByMailAndPassword(mail, password);
        if (user == null) throw new UserNotFoundException("Mauvais Identifiants");
        user.setPassword(null);
        return user;
    }


    /**
     * Add a New User to DataBase
     *
     * @param user New User Object to Add to Database
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/add")
    public ResponseEntity<Void> addUser(@RequestBody User user) {
        User userAdded = userDao.save(user);
        if (userAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    /**
     * Update Existing User Informations
     *
     * @param user User Object with modifications
     */
    @CrossOrigin
    @PutMapping(value = "/update")
    public void updateUser(@RequestBody User user) {
        userDao.save(user);
    }

    /**
     * Delete a User from Database by Identication Number
     *
     * @param id User Identification Number
     */
    @CrossOrigin
    @DeleteMapping(value = "user/delete/{id}")
    public void deleteUserById(@PathVariable int id) {
        userDao.deleteById(id);
    }

}
