package com.example.thecoffeehouse.TinTuc.UuDaiDacBIet;

public class ListUuDaiDacBiet {

    int imguudd;
    String nameuudd,chitietuudd;

    public ListUuDaiDacBiet(int imguudd, String nameuudd, String chitietuudd) {
        this.imguudd = imguudd;
        this.nameuudd = nameuudd;
        this.chitietuudd = chitietuudd;
    }

    public int getImguudd() {
        return imguudd;
    }

    public String getNameuudd() {
        return nameuudd;
    }

    public String getChitietuudd() {
        return chitietuudd;
    }
}
