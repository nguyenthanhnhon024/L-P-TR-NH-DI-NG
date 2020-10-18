package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_signup(View view) {
        startActivity(new Intent(getApplicationContext(),SignUp.class));
    }

    public void btn_signup1(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
    }
}