package com.example.gk1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Trà Sữa Cherry","138 Hải Phòng,Thanh Khê,Đà Nẵng","23.000đ","3.6","2.3km","Mã Giảm Giá 30%",R.drawable.ts1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Hẻm","12 Cao Thắng,Hải Châu,Đà Nẵng","45.000đ","3.9","3.8km","Freeship",R.drawable.ts2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Milo Dầm BonBon","78 Đống Đa,Hải Châu,Đà Nẵng","30.000đ","2.5","6.7km","Freeship 3km",R.drawable.ts3);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Sữa Tươi Trân Châu Đường Đen","12 Lê Duẫn,Thanh Khê,Đà Nẵng","55.000đ","4.0","1.1km","Mã Giảm Giá 20%",R.drawable.ts4);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Full Plan BonBon","78 Đống Đa,Hải Châu,Đà Nẵng","55.000đ","4.0","1.1km","Mã Giảm Giá 20%",R.drawable.ts5);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Thái Xanh BonBon","12 Ngô Gia Tự,Hải Châu,Đà Nẵng","55.000đ","3.7","3.0km","FreeShip 3km",R.drawable.ts6);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);

    }

}