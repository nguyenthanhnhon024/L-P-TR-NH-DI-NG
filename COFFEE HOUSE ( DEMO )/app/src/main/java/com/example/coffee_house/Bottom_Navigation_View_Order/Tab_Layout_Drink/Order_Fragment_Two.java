package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Drink;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffee_house.R;

import java.util.ArrayList;
import java.util.List;


public class Order_Fragment_Two extends Fragment
{
    List< Order_Fragment_Two_Items > LIST_OFTI_COFFEE_333 , LIST_OFTI_ICE_333 ;
    Order_Fragment_Two_Items OFTI_COFFEE_333 , OFTI_ICE_333 ;
    RecyclerView RECYCLER_VIEW_COFFEE_333 , RECYCLER_VIEW_ICE_333 ;
    ImageView IMAGE_VIEW_333;
    TextView TV_PRICE_333 , TV_TITLE_333 , TV_STAR_333 ;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater LAYOUT_INFLATER , @Nullable ViewGroup VIEW_GROUP , Bundle savedInstanceState )
    {
        View VIEW = LAYOUT_INFLATER.inflate( R.layout.order_fragment_two , VIEW_GROUP , false ) ;

        IMAGE_VIEW_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_IV ) ;
        RECYCLER_VIEW_COFFEE_333 = ( RecyclerView ) VIEW.findViewById( R.id.RECYCLER_VIEW_COFFEE ) ;
        RECYCLER_VIEW_ICE_333 = VIEW.findViewById( R.id.RECYCLER_VIEW_ICE ) ;
        TV_PRICE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_TITLE ) ;
        TV_TITLE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_PRICE ) ;
        TV_STAR_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_STAR ) ;

        //  Cà Phê
        LIST_OFTI_COFFEE_333 = new ArrayList<> () ;
        OFTI_COFFEE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_01 , "Cà Phê Sữa Đá" , "32.000" , "4.5") ;
        LIST_OFTI_COFFEE_333.add( OFTI_COFFEE_333 ) ;
        OFTI_COFFEE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_02 , "Bạc Xỉu" , "32.000" , "3.3") ;
        LIST_OFTI_COFFEE_333.add( OFTI_COFFEE_333 ) ;
        OFTI_COFFEE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_03 , "Cà Phê Đá Xay - Lạnh" , "59.000" , "5.0") ;
        LIST_OFTI_COFFEE_333.add( OFTI_COFFEE_333 ) ;

        Order_Fragment_Two_Adapter OFTI_ADAPTER_COFFEE = new Order_Fragment_Two_Adapter( getActivity() , LIST_OFTI_COFFEE_333 ) ;
        RECYCLER_VIEW_COFFEE_333.setAdapter( OFTI_ADAPTER_COFFEE ) ;

        LinearLayoutManager LL_MANAGEMENT_COFFEE = new LinearLayoutManager( getActivity() , LinearLayoutManager.VERTICAL , false ) ;
        RECYCLER_VIEW_COFFEE_333.setLayoutManager( LL_MANAGEMENT_COFFEE ) ;

        //  Thức uống đá xay
        LIST_OFTI_ICE_333 = new ArrayList<> () ;
        OFTI_ICE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_04 , "Phúc Bồn Tử Cam Đá Xay" , "59.000" , "3.9") ;
        LIST_OFTI_ICE_333.add( OFTI_ICE_333 ) ;
        OFTI_ICE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_03 , "Cà Phê Đá Xay - Lạnh" , "59.000" , "5.0") ;
        LIST_OFTI_ICE_333.add( OFTI_ICE_333 ) ;
        OFTI_ICE_333 = new Order_Fragment_Two_Items( R.drawable.image_drink_05 , "Cookie Đá Xay" , "59.000" , "4.0") ;
        LIST_OFTI_ICE_333.add( OFTI_ICE_333 ) ;

        Order_Fragment_Two_Adapter OFTI_ADAPTER_ICE = new Order_Fragment_Two_Adapter( getActivity() , LIST_OFTI_ICE_333 ) ;
        RECYCLER_VIEW_ICE_333.setAdapter( OFTI_ADAPTER_ICE ) ;

        LinearLayoutManager LL_MANAGEMENT_ICE = new LinearLayoutManager( getActivity() , LinearLayoutManager.VERTICAL , false ) ;
        RECYCLER_VIEW_ICE_333.setLayoutManager( LL_MANAGEMENT_ICE ) ;

        return VIEW ;
    }
}