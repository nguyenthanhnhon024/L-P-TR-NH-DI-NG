package com.example.thecoffeehouse.DatHang.Tab.ThucUong;

public class ListThucUong {

    int imgtu;
    String nametu,giatu;

    public ListThucUong(int imgtu, String nametu, String giatu) {
        this.imgtu = imgtu;
        this.nametu = nametu;
        this.giatu = giatu;
    }

    public int getImgtu() {
        return imgtu;
    }

    public String getNametu() {
        return nametu;
    }

    public String getGiatu() {
        return giatu;
    }
}
