package com.example.now.DTO;

public class Account {
    private int id;
    private String User, Pass;

    public Account(int id, String user, String pass) {
        this.id = id;
        User = user;
        Pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

}

