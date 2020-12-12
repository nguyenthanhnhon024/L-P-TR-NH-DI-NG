package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Drink;

public class Order_Fragment_Two_Items
{

    int IMAGE_DRINK_333;
    String NAME_DRINK_333 , PRICE_DRINK_333, STAR_333;

    public Order_Fragment_Two_Items(int IMAGE_DRINK, String NAME_DRINK, String PRICE_DRINK , String STAR )
    {
        this.IMAGE_DRINK_333 = IMAGE_DRINK;
        this.NAME_DRINK_333 = NAME_DRINK;
        this.PRICE_DRINK_333 = PRICE_DRINK;
        this.STAR_333 = STAR ;
    }

    public int getIMAGE_DRINK()
    {
        return IMAGE_DRINK_333;
    }

    public String getNAME_DRINK()
    {
        return NAME_DRINK_333;
    }

    public String getPRICE_DRINK()
    {
        return PRICE_DRINK_333;
    }

    public String getSTAR()
    {
        return STAR_333;
    }

    public void setIMAGE_DRINK(int IMAGE_DRINK) {
        this.IMAGE_DRINK_333 = IMAGE_DRINK;
    }

    public void setNAME_DRINK(String NAME_DRINK) {
        this.NAME_DRINK_333 = NAME_DRINK;
    }

    public void setPRICE_DRINK(String PRICE_DRINK) {
        this.PRICE_DRINK_333 = PRICE_DRINK;
    }

    public void setSTAR(String STAR) {
        this.STAR_333 = STAR;
    }
}
