package com.example.now.DTO;

public class CollectionBST {
    private int id;
    private String Image, Title;

    public CollectionBST(int id, String image, String title) {
        this.id = id;
        Image = image;
        Title = title;
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
}