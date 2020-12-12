package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Drink;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coffee_house.R;

public class Order_Fragment_Two_Items_Details extends AppCompatActivity {
    
    TextView STAR_333;
    TextView PRICE_333;
    TextView TITLE_333;
    ImageView IMAGE_333;
    RatingBar RATING_BAR_333;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_fragment_two_items_details);

        IMAGE_333 =(ImageView)findViewById(R.id.ivImage2);
        STAR_333 = (TextView) findViewById(R.id.danhgia1);
        PRICE_333 = (TextView) findViewById(R.id.tvPrice1);
        TITLE_333 = (TextView) findViewById(R.id.title1);
        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){
            IMAGE_333.setImageResource(mBundle.getInt("Image"));
            TITLE_333.setText(mBundle.getString("Name"));
            PRICE_333.setText(mBundle.getString("Price"));
            STAR_333.setText(mBundle.getString("Star"));
        }

        RATING_BAR_333 = findViewById(R.id.rating_bar);
        btSubmit = findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(RATING_BAR_333.getRating());
                Toast.makeText(getApplicationContext(),s+" Star", Toast.LENGTH_SHORT).show();
            }
        });
    }
}