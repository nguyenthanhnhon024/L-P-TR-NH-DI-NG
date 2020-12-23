package com.example.now;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Thongbao extends AppCompatActivity {
    ImageView caidat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        caidat = findViewById(R.id.caidat);
        caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VIEW) {
                Intent INTENT_02 = new Intent(Thongbao.this, Caidat.class);
                startActivity(INTENT_02);
            }
        });


        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);

        BottomNavigationView.setSelectedItemId(R.id.item_notice);

        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_home:
                        Intent INTENT_02 = new Intent(Thongbao.this, MapsActivity.class ) ;
                        startActivity( INTENT_02 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_list:
                        return;
                    case R.id.item_save:
                        Intent INTENT_01 = new Intent(Thongbao.this, Saved_Activity_Main.class ) ;
                        startActivity( INTENT_01 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_notice:
                        return;
                    case R.id.item_about:
                        Intent INTENT_05 = new Intent(Thongbao.this, Main_Login_Sign_Up.class ) ;
                        startActivity( INTENT_05 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }
}