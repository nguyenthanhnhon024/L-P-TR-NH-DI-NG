package com.duyexample.passiocoffee.DTO;

public class News {
    int id;
    String Image, Title, Cmt;

    public News(int id, String image, String title, String cmt) {
        this.id = id;
        Image = image;
        Title = title;
        Cmt = cmt;
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

    public String getCmt() {
        return Cmt;
    }

    public void setCmt(String cmt) {
        Cmt = cmt;
    }
}
