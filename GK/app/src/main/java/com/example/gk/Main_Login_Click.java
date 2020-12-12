package com.example.gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main_Login_Click extends AppCompatActivity {
    TextView tv_330;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_click);

        tv_330 = (TextView) findViewById(R.id.tv_back);

        tv_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Login_Click.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
