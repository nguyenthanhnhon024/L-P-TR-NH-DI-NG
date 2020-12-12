package com.example.coffee_house.Bottom_Navigation_View_News;

public class News_Menu_Items
{
    private int NEWS_ACTIVITY_MAIN_IV_MENU_333 ;
    private String NEWS_ACTIVITY_MAIN_MENU_TV_333 ;

    public News_Menu_Items() {}

    public News_Menu_Items( int NEWS_ACTIVITY_MAIN_IV_MENU , String NEWS_ACTIVITY_MAIN_TV_MENU )
    {
        this.NEWS_ACTIVITY_MAIN_IV_MENU_333 = NEWS_ACTIVITY_MAIN_IV_MENU ;
        this.NEWS_ACTIVITY_MAIN_MENU_TV_333 = NEWS_ACTIVITY_MAIN_TV_MENU ;
    }

    public int getNEWS_ACTIVITY_MAIN_IV_MENU()
    {
        return NEWS_ACTIVITY_MAIN_IV_MENU_333 ;
    }

    public String getNEWS_ACTIVITY_MAIN_TV_MENU()
    {
        return NEWS_ACTIVITY_MAIN_MENU_TV_333 ;
    }

    public void setNEWS_ACTIVITY_MAIN_IV_MENU( int NEWS_ACTIVITY_MAIN_IV_MENU )
    {
        this.NEWS_ACTIVITY_MAIN_IV_MENU_333 = NEWS_ACTIVITY_MAIN_IV_MENU ;
    }

    public void setNEWS_ACTIVITY_MAIN_TV_MENU( String NEWS_ACTIVITY_MAIN_TV_MENU )
    {
        this.NEWS_ACTIVITY_MAIN_MENU_TV_333 = NEWS_ACTIVITY_MAIN_TV_MENU ;
    }
}
