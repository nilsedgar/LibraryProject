package com.nilsedgar;

import javax.swing.*;
import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private final String password = "password123";

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
