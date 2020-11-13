package com.example.tuan10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView foodDescription;
    ImageView foodImage;
    RatingBar ratingBar;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDescription = (TextView)findViewById(R.id.txtDescription);
        foodImage =(ImageView)findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){
            foodDescription.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));
        }

        ratingBar = findViewById(R.id.rating_bar);
        btSubmit = findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),s+" Star", Toast.LENGTH_SHORT).show();
            }
        });
    }
}