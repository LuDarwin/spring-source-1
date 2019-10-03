package com.java.spring.test.demo1;

import com.java.spring.demo1.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(value = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IoCTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        System.out.println(this.user);
    }
}
