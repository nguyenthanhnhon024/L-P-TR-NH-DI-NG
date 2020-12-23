package com.duyexample.passiocoffee.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.duyexample.passiocoffee.R;

public class ClickBuyActivity extends AppCompatActivity {

    ImageView proImg309 , tangsl, giamsl;
    TextView proTitle309, proPrice309, solg;

    String title, price;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buy);

        proImg309 = (ImageView) findViewById(R.id.dialog_image);
        proTitle309 = (TextView) findViewById(R.id.dialog_title);
        proPrice309 = (TextView) findViewById(R.id.dialog_price);

        Intent i = getIntent();
        title = i.getStringExtra("title");
        price = i.getStringExtra("price");
        image = i.getIntExtra("image", 0);

        proTitle309.setText(title);
        proPrice309.setText(price);
        proImg309.setImageResource(image);

        tangsl = findViewById(R.id.add_sl);
        tangsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solg = findViewById(R.id.soluong);
                int slg = Integer.parseInt((String) solg.getText());
                int newslq = slg + 1;
                solg.setText(String.valueOf(newslq));
            }
        });
        giamsl = findViewById(R.id.remove_sl);
        giamsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solg = findViewById(R.id.soluong);
                int slg = Integer.parseInt((String) solg.getText());
                if (slg>1){
                    int newslq = slg - 1;
                    solg.setText(String.valueOf(newslq));
                }
            }
        });

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // nút back
                onBackPressed();
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}