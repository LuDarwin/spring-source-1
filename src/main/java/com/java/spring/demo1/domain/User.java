package com.java.spring.demo1.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1292530168987664626L;

    private Integer id;
    private String name;
    private String password;
    private Float salary;

    public User() {
        System.out.println("User()");
    }
}
