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

public class Main_Tichdiem extends AppCompatActivity {
    TextView tvclose_330;
    Button btdn_330;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tichdiem);

        tvclose_330 = (TextView) findViewById(R.id.tvclose);
        tvclose_330.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btdn_330 = (Button) findViewById(R.id.bt_dn);
        btdn_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Tichdiem.this, Main_Login_Click.class);
                startActivity(intent);
            }
        });
    }

}
