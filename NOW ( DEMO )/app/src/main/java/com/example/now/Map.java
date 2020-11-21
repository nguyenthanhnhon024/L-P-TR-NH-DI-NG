package com.example.now;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Map extends AppCompatActivity {
    ImageView IMAGE_BACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        IMAGE_BACK = findViewById(R.id.MAP_ICON_BACK);

        IMAGE_BACK = findViewById(R.id.MAP_ICON_BACK);
        IMAGE_BACK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
