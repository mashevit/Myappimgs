package com.example.android.myappimgs.network;

public class User {
String username;
String password;

    public String getUsername() {
        return username;
    }

    public User() {
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
