package com.di;

public abstract class User {
    protected String username = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract void displayInfo();
}