package com.example.kiemtralan2;

public class hinhAnh {
    private int img;
    private String name;
    private String tittle;

    public hinhAnh(int img, String name, String tittle) {
        this.img = img;
        this.name = name;
        this.tittle = tittle;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
