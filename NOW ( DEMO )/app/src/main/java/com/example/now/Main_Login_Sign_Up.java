package com.example.now;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main_Login_Sign_Up extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private Button btndkdn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btndkdn = (Button) findViewById(R.id.btlg);
        bottomNavigationView = findViewById(R.id.BNV);

        btndkdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Login_Sign_Up.this, Login.class);
                startActivity(intent);
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.item_about);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_list:
                        return;
                    case R.id.item_save:
                        startActivity(new Intent(getApplicationContext(), Saved_Activity_Main.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_notice:
                        startActivity(new Intent(getApplicationContext(), Thongbao.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_about:
                        return;
                }
            }
        });
    }

}
