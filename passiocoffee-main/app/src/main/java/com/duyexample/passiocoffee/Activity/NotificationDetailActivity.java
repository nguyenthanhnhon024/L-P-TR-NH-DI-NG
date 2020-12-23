package com.duyexample.passiocoffee.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.duyexample.passiocoffee.Database.TinTucHelper;
import com.duyexample.passiocoffee.R;

public class NotificationDetailActivity extends AppCompatActivity {
    ImageView back309;

    ImageView proImg309;
    TextView proTitle309, proCmt309;
    String title;
    TinTucHelper helper309;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        back309 = findViewById(R.id.back);
        back309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        Intent i = getIntent();
        title = i.getStringExtra("title");

        helper309 = new TinTucHelper(this);

        proImg309 = findViewById(R.id.pro_image);
        proTitle309 = findViewById(R.id.pro_title);
        proCmt309 = findViewById(R.id.pro_cmt);

        String selectQuery = "SELECT * FROM Danhsachtt WHERE title = '" + title + "'";
        SQLiteDatabase db = helper309.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if (cursor.moveToFirst()){
            do {
                int id = cursor.getInt(0);
                String image = "" + cursor.getString(1);
                String title = "" + cursor.getString(2);
                String cmt = "" + cursor.getString(3);

                proTitle309.setText(title);
                proCmt309.setText(cmt);
                int resId = getResources().getIdentifier(image, "drawable", getPackageName());
                proImg309.setImageResource(resId);
            }while (cursor.moveToNext());
        }
        db.close();
    }
}