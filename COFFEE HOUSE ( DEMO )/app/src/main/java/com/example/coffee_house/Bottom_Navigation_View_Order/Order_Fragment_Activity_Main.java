package com.example.coffee_house.Bottom_Navigation_View_Order;

import android.content.Intent;
import android.os.Bundle ;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity ;
import androidx.fragment.app.FragmentStatePagerAdapter ;
import androidx.viewpager.widget.ViewPager ;

import com.example.coffee_house.Bottom_Navigation_View_Account.Account_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_News.News_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Store.Store_Activity_Main;
import com.example.coffee_house.Fragment_Adapter;
import com.example.coffee_house.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout ;

public class Order_Fragment_Activity_Main extends AppCompatActivity
{
    BottomNavigationView BOTTOM_NAVIGATION_VIEW_333 ;
    private TabLayout TAB_LAYOUT_333 ;
    private ViewPager VIEW_PAGER_333 ;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState ) ;
        setContentView( R.layout.order_fragment_activity_main) ;
        FIND_VIEW_BY_ID() ;
        Control() ;


        BOTTOM_NAVIGATION_VIEW_333.setSelectedItemId( R.id.BNV_ITEMS_ORDER ) ;
        BOTTOM_NAVIGATION_VIEW_333.setOnNavigationItemReselectedListener( new BottomNavigationView.OnNavigationItemReselectedListener()
        {
            @Override
            public void onNavigationItemReselected( @NonNull MenuItem MENU_ITEM )
            {
                switch ( MENU_ITEM.getItemId())
                {
                    case R.id.BNV_ITEMS_NEWS :
                        Intent INTENT_05 = new Intent( Order_Fragment_Activity_Main.this , News_Activity_Main.class ) ;
                        startActivity( INTENT_05 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ORDER :
                        return ;
                    case R.id.BNV_ITEMS_STORE :
                        Intent INTENT_07 = new Intent( Order_Fragment_Activity_Main.this , Store_Activity_Main.class ) ;
                        startActivity( INTENT_07 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ACCOUNT :
                        Intent INTENT_08 = new Intent( Order_Fragment_Activity_Main.this , Account_Activity_Main.class ) ;
                        startActivity( INTENT_08 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                }
            }
        }) ;
    }

    private void Control()
    {
//        FragmentManager FRAGMENT_MANAGER = getSupportFragmentManager() ;
        Fragment_Adapter VIEW_PAGER_ADAPTER = new Fragment_Adapter( getSupportFragmentManager() , FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT ) ;
        VIEW_PAGER_333.setAdapter( VIEW_PAGER_ADAPTER ) ;
        TAB_LAYOUT_333.setupWithViewPager( VIEW_PAGER_333 ) ;
        VIEW_PAGER_333.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener( TAB_LAYOUT_333 )) ;
        TAB_LAYOUT_333.setTabsFromPagerAdapter( VIEW_PAGER_ADAPTER ) ; //deprecated ;
    }

    public void FIND_VIEW_BY_ID()
    {
        BOTTOM_NAVIGATION_VIEW_333 = findViewById( R.id.ORDER_FRAGMENT_ONE_ACTIVITY_MAIN_BNV ) ;
        TAB_LAYOUT_333 = ( TabLayout ) findViewById( R.id.ORDER_FRAGMENT_ONE_ACTIVITY_MAIN_TL ) ;
        VIEW_PAGER_333 = ( ViewPager ) findViewById( R.id.ORDER_FRAGMENT_ONE_ACTIVITY_MAIN_VP ) ;
    }
}
