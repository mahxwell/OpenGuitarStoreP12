package com.guitarstore.user;

import com.guitarstore.user.model.User;
import com.guitarstore.user.web.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * User Controller
     */
    @Autowired
    UserController userController;

    /**
     * User Constructor For Tests
     *
     * @param name
     * @param surname
     * @param pseudo
     * @param mail
     * @param password
     * @param newsletter
     * @return
     */
    private User initUser(final Integer id,
                          final String name,
                          final String surname,
                          final String pseudo,
                          final String mail,
                          final String password,
                          final boolean newsletter) {
        User user = new User(name, surname, pseudo, mail, password, newsletter);
        return user;
    }

    /**
     * Find All Users Test
     */
    @Test
    public void findAllUserTest() {
        List<User> users = userController.findAll();
        Assert.assertTrue(users.size() >= 1);
    }

    /**
     * Get One User by Mail and Password for Authentication Test
     */
    @Test
    public void getUserTest() {
        List<User> users = userController.findAll();
        if (users.size() > 0) {
            User user = userController.getUser(users.get(0).getMail(), users.get(0).getPassword());
            Assert.assertNotNull(user);
        }
    }

    /**
     * Get One User by Id Test
     */
    @Test
    public void getOneUserTest() {
        List<User> users = userController.findAll();
        if (users.size() > 0) {
            Optional<User> user = userController.getOneUser(users.get(0).getId());
            Assert.assertNotNull(user);
        }
    }

    /**
     * Add User Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void addUserTest() {
        User user = this.initUser(null,
                "newuser",
                "newuser",
                "newuser",
                "newuser",
                "newuser",
                false);
        userController.addUser(user);
    }

    /**
     * Update User Test
     */

    @Transactional
    @Rollback(true)
    @Test
    public void updateUserTest() {
        List<User> users = userController.findAll();
        if (users.size() > 0) {
            User user = this.initUser(users.get(0).getId(),
                    "update",
                    "update",
                    "update",
                    "update",
                    "update",
                    true);
            userController.updateUser(user);
        }
    }

    /**
     * Delete User Test
     */
    @Transactional
    @Rollback(true)
    @Test
    public void deleteUserTest() {
        User user = this.initUser(null,
                "newuser",
                "newuser",
                "newuser",
                "newuser",
                "newuser",
                false);
        userController.addUser(user);
        List<User> users = userController.findAll();
        User userToDelete = users.get(users.size() - 1);
        userController.deleteUserById(userToDelete.getId());

    }
}
