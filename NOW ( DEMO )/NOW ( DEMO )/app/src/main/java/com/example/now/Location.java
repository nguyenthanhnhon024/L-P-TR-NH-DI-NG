package com.example.now;

public class Location {
    int id;
    String ten;
    String sl;
    public String getName() {
        return ten;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String ten) {
        this.ten = ten;
    }

    public String getsl() {
        return sl;
    }
    public void setsl(String sl) {
        this.sl = sl;
    }
}
