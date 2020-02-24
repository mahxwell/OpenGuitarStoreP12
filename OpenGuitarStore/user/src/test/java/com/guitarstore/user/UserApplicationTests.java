package com.guitarstore.user;

import com.guitarstore.user.model.User;
import com.guitarstore.user.web.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    UserController userController;

    @Test
    public void findAllTest() {
        User user = userController.findAll();
        Assert.assertTrue(user != null);
    }
}