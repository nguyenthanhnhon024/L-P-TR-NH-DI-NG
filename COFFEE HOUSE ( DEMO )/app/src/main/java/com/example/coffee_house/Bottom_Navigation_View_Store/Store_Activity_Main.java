package com.example.coffee_house.Bottom_Navigation_View_Store;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.example.coffee_house.Bottom_Navigation_View_Account.Account_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_News.News_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Order.Order_Fragment_Activity_Main;
import com.example.coffee_house.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class Store_Activity_Main extends FragmentActivity implements OnMapReadyCallback
{

    BottomNavigationView BOTTOM_NAVIGATION_VIEW_333 ;
    private static Store_Activity_Main INSTANCE = null ;
    GridView GRID_VIEW_333 ;
    GoogleMap GOOGLE_MAP_333 ;
    MapView mapView ;
    Spinner SPINNER_333 ;

    private int [] IMAGE_VIEW_333 = { R.drawable.image_address_01 , R.drawable.image_address_02 , R.drawable.image_address_03 ,
                                      R.drawable.image_address_04 , R.drawable.image_address_05 } ;
    private String [] TV_TITLE_333 = { "Quận Hải Châu" , "Quận Hải Châu" , "Quận Sơn Trà" , "Quận Sơn Trà" , "Quận Hải Châu" } ;
    private String [] TV_PRICE_333 = { "1 Núi Thành" , "A4-2 Nguyễn Vă..." , "461 Trần Hưng Đ..." , "195 Nguyễn Văn ..." , "9 Triệu Nữ Vương"} ;

    public Store_Activity_Main() {}

    public static Store_Activity_Main getINSTANCE(){
        if (INSTANCE==null)
            INSTANCE=new Store_Activity_Main();
        return INSTANCE;
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState ) ;
        setContentView( R.layout.store_activity_main ) ;
        FIND_VIEW_BY_ID() ;

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        final ArrayList<String> arrayListdanhsach = new ArrayList<String> ();
        arrayListdanhsach.add("Cần Thơ");
        arrayListdanhsach.add("Thanh Hóa");
        arrayListdanhsach.add("Đồng Nai");
        arrayListdanhsach.add("Bình Dương");
        arrayListdanhsach.add("Hồ Chí Minh");
        arrayListdanhsach.add("Bà Rịa Vũng Tàu");
        arrayListdanhsach.add("Dak Lak");
        arrayListdanhsach.add("Đà Nẵng");
        arrayListdanhsach.add("Nghệ An");
        arrayListdanhsach.add("Hà Nội");
        arrayListdanhsach.add("Hải Phòng");
        arrayListdanhsach.add("Khánh Hòa");
        arrayListdanhsach.add("Thừa Thiên Huế");
        arrayListdanhsach.add("Bắc Ninh");
        arrayListdanhsach.add("Tiền Giang");

        ArrayAdapter arrayAdapter = new ArrayAdapter (Store_Activity_Main.this, android.R.layout.simple_spinner_item,arrayListdanhsach );
        arrayAdapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item ) ;
        SPINNER_333.setAdapter ( arrayAdapter ) ;

        SPINNER_333.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {
                Toast.makeText(Store_Activity_Main.this,arrayListdanhsach.get ( position ), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {
                Toast.makeText(Store_Activity_Main.this, "onNothingSelected", Toast.LENGTH_SHORT).show();
            }
        });

        Store_Items_Adapter STORE_ITEMS_ADAPTER = new Store_Items_Adapter( this , IMAGE_VIEW_333 , TV_TITLE_333 , TV_PRICE_333 ) ;
        GRID_VIEW_333.setAdapter( STORE_ITEMS_ADAPTER ) ;

        BOTTOM_NAVIGATION_VIEW_333.setSelectedItemId( R.id.BNV_ITEMS_STORE ) ;
        BOTTOM_NAVIGATION_VIEW_333.setOnNavigationItemReselectedListener( new BottomNavigationView.OnNavigationItemReselectedListener()
        {
            @Override
            public void onNavigationItemReselected( @NonNull MenuItem MENU_ITEM )
            {
                switch ( MENU_ITEM.getItemId())
                {
                    case R.id.BNV_ITEMS_NEWS :
                        Intent INTENT_09 = new Intent( Store_Activity_Main.this , News_Activity_Main.class ) ;
                        startActivity( INTENT_09 ) ;
                        overridePendingTransition( 0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ORDER :
                        Intent INTENT_10 = new Intent( Store_Activity_Main.this , Order_Fragment_Activity_Main.class ) ;
                        startActivity( INTENT_10 ) ;
                        overridePendingTransition( 0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_STORE :
                        return ;
                    case R.id.BNV_ITEMS_ACCOUNT :
                        Intent INTENT_11 = new Intent( Store_Activity_Main.this , Account_Activity_Main.class ) ;
                        startActivity( INTENT_11 ) ;
                        overridePendingTransition( 0 ,0 ) ;
                        return ;
                }
            }
        });
    }

    public void FIND_VIEW_BY_ID()
    {
        BOTTOM_NAVIGATION_VIEW_333 = findViewById( R.id.STORE_ACTIVITY_MAIN_BNV ) ;
        GRID_VIEW_333 = findViewById( R.id.STORE_ACTIVITY_MAIN_GV ) ;
        SPINNER_333 = findViewById ( R.id.STORE_ACTIVITY_MAIN_SPINNER ) ;
    }
/*
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        mapView=view.findViewById(R.id.mapsView);
        if(mapView!=null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

 */
    @Override
    public void onMapReady( GoogleMap GOOGLE_MAP )
    {
        GOOGLE_MAP_333 = GOOGLE_MAP ;
        LatLng HCM = new LatLng( 16.0672657,108.2139959 ) ;
        GOOGLE_MAP_333.addMarker( new MarkerOptions().position( HCM ).title( "COFFEE HOUSE" )) ;
        CameraPosition CAMERA_POSITION = new CameraPosition.Builder().target( HCM ).zoom( 16 ).build() ;
        GOOGLE_MAP_333.animateCamera(CameraUpdateFactory.newCameraPosition( CAMERA_POSITION )) ;
    }
}