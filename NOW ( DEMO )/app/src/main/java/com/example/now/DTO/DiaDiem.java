package com.example.now.DTO;

public class DiaDiem {
    private int id;
    private String Image, Quan,Diachi;

    public DiaDiem(int id, String image, String quan,String diachi) {
        this.id = id;
        Image = image;
        Quan = quan;
        Diachi=diachi;
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

    public String getQuan() {
        return Quan;
    }

    public void setQuan(String quan) {
        Quan = quan;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

}

