package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.TinTuc.TinTucFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ManHinhKhoiDau extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;
    Animation topAnim, bottonAnim, midAnim;
    ImageView bk1, bk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_khoi_dau);
        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottonAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        midAnim = AnimationUtils.loadAnimation(this, R.anim.mid_animation);
        // hooks
        bk1 = findViewById(R.id.bk1);
        bk1.setAnimation(topAnim);
        bk2 = findViewById(R.id.bk2);
        bk2.setAnimation(bottonAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ManHinhKhoiDau.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}