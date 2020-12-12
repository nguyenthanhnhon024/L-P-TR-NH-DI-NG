package com.example.gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Main_Dathang extends AppCompatActivity{
    RecyclerView mRecyclerView_330;
    List<FoodData> myFoodList_330;
    FoodData mFoodData_330;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dathang);

        mRecyclerView_330 = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(Main_Dathang.this,1);
        mRecyclerView_330.setLayoutManager(gridLayoutManager);

        myFoodList_330 = new ArrayList<>();

        mFoodData_330 = new FoodData("MACCA PHỦ SOCOLA","45.000 Đ","4.6","Mã Giảm Giá 30%",R.drawable.mon1);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("CÀ PHÊ LÚA MẠCH ĐÁ","69.000 Đ","3.9","Freeship",R.drawable.mon2);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("CÀ PHÊ LÚA MẠCH NÓNG","69.000 Đ","3.9","Freeship 3km",R.drawable.mon3);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("COLD BREW CAM SẢ","50.000 Đ","4.0","Mã Giảm Giá 20%",R.drawable.mon4);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("TRÀ ĐEN MACCHIATO","42.000 Đ","4.0","Mã Giảm Giá 20%",R.drawable.mon5);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("TRÀ ĐÀO CAM SẢ","45.000 Đ","3.7","FreeShip",R.drawable.mon6);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("CAPPUCCINO","45.000 Đ","5.0","FreeShip 3km",R.drawable.mon7);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("CARAMEL MACCHIATO","55.000 Đ","4.87","Mã Giảm Giá 30%",R.drawable.mon8);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("ESPRESSO","35.000 Đ","4.0","Mã Giảm Giá 30%",R.drawable.mon9);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("TRÀ CÀ PHÊ ĐÁ XAY","59.000 Đ","3.9","FreeShip 3km",R.drawable.mon10);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("CÀ PHÊ ĐÁ XAY","49.000 Đ","4.6","Mã Giảm Giá 30%",R.drawable.mon11);
        myFoodList_330.add(mFoodData_330);
        mFoodData_330 = new FoodData("PHÚC BỒN TỬ CAM ĐÁ XAY","59.000 Đ","4.6","FreeShip",R.drawable.mon12);
        myFoodList_330.add(mFoodData_330);

        MyAdapter myAdapter = new MyAdapter(Main_Dathang.this,myFoodList_330);
        mRecyclerView_330.setAdapter(myAdapter);

        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);

        BottomNavigationView.setSelectedItemId(R.id.item_dathang);

        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_tintuc:
                        Intent INTENT2_330 = new Intent(Main_Dathang.this, MainActivity.class ) ;
                        startActivity( INTENT2_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_dathang:
                        return;
                    case R.id.item_cuahang:
                        Intent INTENT3_330 = new Intent(Main_Dathang.this, MapsActivity.class ) ;
                        startActivity( INTENT3_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_taikhoan:
                        Intent INTENT1_330 = new Intent(Main_Dathang.this, Main_Login.class ) ;
                        startActivity( INTENT1_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }
}
