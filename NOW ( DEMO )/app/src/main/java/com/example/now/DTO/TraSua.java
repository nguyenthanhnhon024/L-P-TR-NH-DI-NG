package com.example.now.DTO;

public class TraSua {
    private  int id;
    private String Image;
    private  String Name;
    private String Description;
    private String Price;
    private String Star;
    private String Km;
    private String Sale;

    public TraSua(int id ,String image, String name, String description, String price, String star,String km, String sale) {
        this.id = id;
        this.Image = image;
        this.Name = name;
        this.Description = description;
        this.Price = price;
        this.Star = star;
        this.Km = km;
        this.Sale = sale;
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

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Image = name;
    }

    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }

    public String getStar() {
        return Star;
    }
    public void setStar(String star) {
        Star = star;
    }

    public String getKm() {
        return Km;
    }
    public void setKm(String km) {
        Km = km;
    }

    public String getSale() {
        return Sale;
    }
    public void setSale(String sale) {
        Sale = sale;
    }


}
