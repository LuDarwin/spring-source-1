package com.java.spring.demo1.config;

import com.java.spring.demo1.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 建立了一个配置类，这个配置类等于与applicationContext.xml
@Configuration
public class UserConfig {

    /**
     * 向Spring容器注入了一个Bean，返回值类型就是Bean的类型
     * 方法名就是Bean的id（名称）
     *
     *
     * <bean id="user" class="User"></>
     *
     * @return
     */
    @Bean
    public User user() {
        User user = new User();
        user.setId(1000);
        user.setName("lisi");
        user.setPassword("123456");
        user.setSalary(12.34F);
        return user;
    }
}
