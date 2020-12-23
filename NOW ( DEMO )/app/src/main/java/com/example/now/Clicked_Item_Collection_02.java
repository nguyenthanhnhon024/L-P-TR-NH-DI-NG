package com.example.now;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.now.Database.Collection;

public class Clicked_Item_Collection_02 extends AppCompatActivity {


    ImageView proImg;
    TextView proTitle,backbst;
    String title;
    Collection helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicked_item_collection_02);
        backbst = findViewById(R.id.backbst);
        backbst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), Main_Collection.class);
                startActivity(intent1);
            }
        });

        Intent i = getIntent();
        title = i.getStringExtra("title");

        helper = new Collection(this);

        proImg = findViewById(R.id.imageView);
        proTitle = findViewById(R.id.tvName1);


        String selectQuery = "SELECT * FROM DanhsachBST WHERE title = '" + title + "'";
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if (cursor.moveToFirst()){
            do {
                int id = cursor.getInt(0);
                String image = "" + cursor.getString(1);
                String title = "" + cursor.getString(2);


                proTitle.setText(title);
                int resId = getResources().getIdentifier(image, "drawable", getPackageName());
                proImg.setImageResource(resId);
            }while (cursor.moveToNext());
        }
        db.close();
    }



}
