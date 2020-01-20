package com.nilsedgar;

public class Admin extends User {

    private String password = "admin123";

    public Admin(String name, String password) {
        super(name, password);
    }

}
