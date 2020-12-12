package com.example.gk;


public class FoodData
{
    private String itemName_330;
    private String itemPrice_330;
    private String itemDanhGia_330;
    private String itemGiamGia_330;
    private  int itemImage_330;

    public FoodData(String itemName, String itemPrice, String itemDanhGia, String itemGiamGia, int itemImage) {
        this.itemName_330 = itemName;
        this.itemPrice_330 = itemPrice;
        this.itemDanhGia_330 = itemDanhGia;
        this.itemGiamGia_330 = itemGiamGia;
        this.itemImage_330 = itemImage;
    }

    public String getItemName() {
        return itemName_330;
    }

    public void setItemName(String itemName) {
        this.itemName_330 = itemName;
    }


    public String getItemPrice() {
        return itemPrice_330;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice_330 = itemPrice;
    }

    public String getItemDanhGia() {
        return itemDanhGia_330;
    }

    public void setItemDanhGia(String itemDanhGia) {
        this.itemDanhGia_330 = itemDanhGia;
    }

    public String getItemGiamGia() {
        return itemGiamGia_330;
    }

    public void setItemGiamGia(String itemGiamGia) {
        this.itemGiamGia_330 = itemGiamGia;
    }

    public int getItemImage() {
        return itemImage_330;
    }

    public void setItemImage(int itemImage) {
        this.itemImage_330 = itemImage;
    }
}

