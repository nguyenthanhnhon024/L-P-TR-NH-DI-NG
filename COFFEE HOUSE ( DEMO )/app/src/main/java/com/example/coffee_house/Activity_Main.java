package com.example.coffee_house ;

import android.content.Intent ;
import android.os.Bundle ;
import android.os.Handler ;

import androidx.appcompat.app.AppCompatActivity ;

import com.example.coffee_house.Bottom_Navigation_View_News.News_Activity_Main;

public class Activity_Main extends AppCompatActivity
{
    private static  int SPLASH_SCREEN_333 = 2000 ;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState ) ;
        setContentView( R.layout.activity_main ) ;

        new Handler().postDelayed( new Runnable()
        {
            @Override
            public void run()
            {
                Intent INTENT = new Intent( Activity_Main.this , News_Activity_Main.class ) ;
                startActivity( INTENT ) ;
                finish() ;
            }
        } ,
        SPLASH_SCREEN_333 ) ;
    }
}