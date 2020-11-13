package com.example.tuan10;

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

        mFoodData = new FoodData("Chả Cá Xào Chua Ngọt","Miếng chả cá dai dai béo béo với hương vị đặc trưng được sốt cùng với cà chua, làm cho món ăn có thêm vị chua chua thật là kích thích vị giác, rất đưa cơm đấy!","69.000đ",R.drawable.chaca);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Ba Chỉ","Món ba chỉ chấm với nước chấm mắm tôm thơm ngon","49.000đ",R.drawable.bachi);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Canh Mít","Canh Mít nấu với tôm hương vị quê nhà","69.000đ",R.drawable.canhmit);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Cá Bông Lau Kho Tộ","Món cá kho tộ từ lâu đã ở trong tiềm thức của những người con miền Nam","59.000đ",R.drawable.ca);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);

    }

}