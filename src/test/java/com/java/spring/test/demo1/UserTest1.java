package com.java.spring.test.demo1;

import com.java.spring.demo1.config.UserConfig;
import com.java.spring.demo1.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = UserConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest1 {

    @Autowired
    private User user;

    @Test
    public void test() {
        System.out.println(this.user);
    }
}
