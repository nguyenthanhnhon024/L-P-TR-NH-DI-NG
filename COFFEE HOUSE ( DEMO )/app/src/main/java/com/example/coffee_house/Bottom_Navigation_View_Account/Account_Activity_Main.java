package com.example.coffee_house.Bottom_Navigation_View_Account ;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coffee_house.Bottom_Navigation_View_News.News_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Order.Order_Fragment_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Store.Store_Activity_Main;
import com.example.coffee_house.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Account_Activity_Main extends AppCompatActivity
{
    BottomNavigationView BOTTOM_NAVIGATION_VIEW_333 ;
    TextView TV_LOGIN_333 ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_activity_main);

        TV_LOGIN_333 = (TextView) findViewById(R.id.tvlg);
        BOTTOM_NAVIGATION_VIEW_333 = findViewById(R.id.ACCOUNT_ACTIVITY_MAIN_BNV);

        TV_LOGIN_333.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INTENT = new Intent(Account_Activity_Main.this, Account_Login.class);
                startActivity( INTENT ) ;
            }
        });

        BOTTOM_NAVIGATION_VIEW_333.setSelectedItemId( R.id.BNV_ITEMS_ACCOUNT ) ;
        BOTTOM_NAVIGATION_VIEW_333.setOnNavigationItemReselectedListener( new BottomNavigationView.OnNavigationItemReselectedListener()
        {
            @Override
            public void onNavigationItemReselected( @NonNull MenuItem MENU_ITEM )
            {
                switch ( MENU_ITEM.getItemId())
                {
                    case R.id.BNV_ITEMS_NEWS :
                        Intent INTENT_13 = new Intent( Account_Activity_Main.this , News_Activity_Main.class ) ;
                        startActivity( INTENT_13 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ORDER :
                        Intent INTENT_14 = new Intent( Account_Activity_Main.this , Order_Fragment_Activity_Main.class ) ;
                        startActivity( INTENT_14 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_STORE :
                        Intent INTENT_15 = new Intent( Account_Activity_Main.this , Store_Activity_Main.class ) ;
                        startActivity( INTENT_15 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ACCOUNT :
                        return ;
                }
            }
        }) ;
    }

}
