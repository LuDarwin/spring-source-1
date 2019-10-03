package com.java.spring.test.demo1;

import com.java.spring.demo1.config.UserConfig;
import com.java.spring.demo1.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    private ApplicationContext context;
    private User user;

    @Before
    public void setUp() {
        this.context = new AnnotationConfigApplicationContext(UserConfig.class);
        this.user = this.context.getBean(User.class);
    }

    @Test
    public void test() {
        System.out.println(this.user);
    }
}
