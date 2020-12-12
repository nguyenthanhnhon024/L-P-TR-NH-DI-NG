package com.example.coffee_house ;

import androidx.annotation.NonNull ;
import androidx.fragment.app.Fragment ;
import androidx.fragment.app.FragmentManager ;
import androidx.fragment.app.FragmentStatePagerAdapter ;

import com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Common.Order_Fragment_One;
import com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Drink.Order_Fragment_Two;
import com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Food.Fragment_Three;

public class Fragment_Adapter extends FragmentStatePagerAdapter
{
    public Fragment_Adapter( @NonNull FragmentManager FRAGMENT_MANAGER , int BEHAVIOR )
    {
        super( FRAGMENT_MANAGER , BEHAVIOR ) ;
    }

    @NonNull
    @Override
    public Fragment getItem( int POSITION )
    {
        Fragment FRAGMENT = null ;
        switch ( POSITION )
        {
            case 0 :
                FRAGMENT = new Order_Fragment_One() ;
                break ;
            case 1 :
                FRAGMENT = new Order_Fragment_Two() ;
                break ;
            case 2 :
                FRAGMENT = new Fragment_Three() ;
                break ;

            default :
                FRAGMENT = new Order_Fragment_One() ;
        }
        return FRAGMENT ;
    }

    @Override
    public int getCount()
    {
        return 3 ;
    }

    @Override
    public CharSequence getPageTitle( int POSITION )
    {
        String TITLE = "" ;
        switch ( POSITION )
        {
            case 0 :
                TITLE = "Phổ Biến" ;
                break ;
            case 1 :
                TITLE = "Thức uống" ;
                break ;
            case 2 :
                TITLE = "Đồ ăn" ;
                break ;
        }
        return TITLE ;
    }
}
