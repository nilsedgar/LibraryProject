package com.nilsedgar;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private Boolean access;

    public User(String name, Boolean access) {
        this.name = name;
        this.access = access;
    }

    public String getName(){
        return name;
    }
}
