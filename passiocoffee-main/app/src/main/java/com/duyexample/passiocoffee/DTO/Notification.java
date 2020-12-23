package com.duyexample.passiocoffee.DTO;

public class Notification {
    private int id309;
    private String Image309, Title309, Price309;

    public Notification(int id, String image309, String title309, String price309) {
        this.id309 = id;
        Image309 = image309;
        Title309 = title309;
        Price309 = price309;
    }

    public int getId() {
        return this.id309;
    }

    public void setId(int id) {
        this.id309 = id;
    }

    public String getImage() {
        return Image309;
    }

    public void setImage(String image) {
        Image309 = image;
    }

    public String getTitle() {
        return Title309;
    }

    public void setTitle(String title309) {
        Title309 = title309;
    }

    public String getPrice() {
        return Price309;
    }

    public void setPrice(String price309) {
        Price309 = price309;
    }
}

