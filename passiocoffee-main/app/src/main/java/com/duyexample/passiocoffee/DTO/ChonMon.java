package com.duyexample.passiocoffee.DTO;

public class ChonMon {
    int id;
    String Image, Title, Price;
    public ChonMon(int id, String image, String title, String price) {
        this.id = id;
        Image = image;
        Title = title;
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
