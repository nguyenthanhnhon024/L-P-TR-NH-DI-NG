package com.duyexample.passiocoffee.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.duyexample.passiocoffee.Adapter.TinTucAdapter;
import com.duyexample.passiocoffee.DTO.TinTuc;
import com.duyexample.passiocoffee.R;
import com.duyexample.passiocoffee.TruyVan.TintucTV;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ImageView im, coupon309, thongbao309, chonmon309, map309;
    RelativeLayout profile309;

    GridView gv309;
    ArrayList<TinTuc> arrayList309;
    TinTucAdapter adapter309;
    TintucTV tintucTV309;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tintucTV309 = new TintucTV(HomeActivity.this);
        arrayList309 = tintucTV309.getAll();
        gv309 = findViewById(R.id.grid_tt);
        adapter309 = new TinTucAdapter(HomeActivity.this, arrayList309);
        gv309.setAdapter(adapter309);

        im = findViewById(R.id.card);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(getApplication(), MemberCardActivity.class);
                startActivity(Intent);
            }
        });

        coupon309 = findViewById(R.id.coupon);
        coupon309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), MyCouponActivity.class);
                startActivity(intent1);
            }
        });

        TextView acc_name = findViewById(R.id.acc_name);
        acc_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageView book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });

        map309 = findViewById(R.id.location);
        map309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplication(), Map.class);
                startActivity(intent4);
            }
        });

        ImageView noti = findViewById(R.id.noti);
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ThongBaoActivity.class);
                startActivity(intent);
            }
        });
    }
}