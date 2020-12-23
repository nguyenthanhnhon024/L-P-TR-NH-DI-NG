package com.example.now.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Bosuutap extends SQLiteOpenHelper {
    public DB_Bosuutap(@Nullable Context context) {
        super(context, "Bosuutap", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql2 = "CREATE TABLE BOSUUTAP(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text)";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_sale_20k','6 giờ vàng ăn sáng')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_sale_10k','Siêu deal thứ 3 chỉ 10k')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_drink_11k','Đồ uống chỉ 11k')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_sale_21k','Ăn chỉ 21k')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_combo','Combo mua 1 tặng 1')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_super_combo_210k','Siêu combo 210k')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_summer','Hè không nghỉ')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_fast_foods','Món ăn nhanh')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_specialties_da_nang','Đặc sản Đà Nẵng')";
        db.execSQL(sql2);
        sql2 = "INSERT INTO BOSUUTAP(image, title) VALUES ('now_freeship_xtra','Freeship Xtra + Giảm 50%')";
        db.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
