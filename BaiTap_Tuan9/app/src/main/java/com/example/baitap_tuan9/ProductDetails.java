package com.example.baitap_tuan9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {

    ImageView img;
    TextView proName;

    String name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Intent i = getIntent();

         name = i.getStringExtra("name");
         image = i.getIntExtra("image", 0);

         proName = findViewById(R.id.productName);
         img = findViewById(R.id.big_image);

         proName.setText(name);
         img.setImageResource(image);
    }

}
