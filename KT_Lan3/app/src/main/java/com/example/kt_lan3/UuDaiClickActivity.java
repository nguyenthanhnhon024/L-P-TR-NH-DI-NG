package com.example.kt_lan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kt_lan3.R;

public class UuDaiClickActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    TextView tvbackbst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uudai_clickitem);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.tvName);

        Intent intent = getIntent();
        if(intent.getExtras() != null){
            String selectedName = intent.getStringExtra("name");
            int selectedImage = intent.getIntExtra("image",0);

            textView.setText(selectedName);
            imageView.setImageResource(selectedImage);
        }
        tvbackbst = (TextView) findViewById(R.id.backbst);
        tvbackbst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UuDaiClickActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
