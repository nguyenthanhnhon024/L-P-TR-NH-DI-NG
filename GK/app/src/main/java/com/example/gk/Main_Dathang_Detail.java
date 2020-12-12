package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Dathang_Detail extends AppCompatActivity {

    TextView foodDanhGia1_330,foodPrice1_330,foodTitle1_330,back_330;
    ImageView foodImage_330;
    RatingBar ratingBar_330;
    Button btSubmit_330;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dathang_detail);

        foodImage_330 =(ImageView)findViewById(R.id.ivImage2);
        foodDanhGia1_330 = (TextView) findViewById(R.id.danhgia1);
        foodPrice1_330 = (TextView) findViewById(R.id.tvPrice1);
        foodTitle1_330 = (TextView) findViewById(R.id.title1);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){
            foodImage_330.setImageResource(mBundle.getInt("Image"));
            foodDanhGia1_330.setText(mBundle.getString("DanhGia"));
            foodPrice1_330.setText(mBundle.getString("Price"));
            foodTitle1_330.setText(mBundle.getString("Title"));
        }

        ratingBar_330 = findViewById(R.id.rating_bar);
        btSubmit_330 = findViewById(R.id.bt_submit);

        btSubmit_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(ratingBar_330.getRating());
                Toast.makeText(getApplicationContext(),s+" Star", Toast.LENGTH_SHORT).show();
            }
        });

        back_330 = findViewById(R.id.title1);
        back_330.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}