package com.example.now.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Trasua extends SQLiteOpenHelper {
    public DB_Trasua(@Nullable Context context) {
        super(context, "Trasuu", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE TRASUU(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, name text,description text,price text,star text,km text,sale text)";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts1','Trà Sữa Cherry','138 Hải Phòng, Thanh Khê, Đà Nẵng','23.000đ','4','2.3km','Mã Giảm Giá 30%')";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts2','Trà Sữa Hẻm','12 Cao Thắng, Hải Châu, Đà Nẵng','45.000đ','3.9','3.8km','Mã Giảm Giá 30%')";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts3','Milo Dầm BonBon','78 Đống Đa, Hải Châu, Đà Nẵng','30.000đ','3.9','6.8km','Mã Giảm Giá 30%')";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts4','Sữa Tươi Trân Châu Đường Đen','12 Lê Duẫn, Thanh Khê, Đà Nẵng','55.000đ','4.9','7.8km','Mã Giảm Giá 30%')";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts5','Trà Sữa Full Plan BonBon','78 Đống Đa, Hải Châu, Đà Nẵng','55.000đ','4.9','7.8km','Mã Giảm Giá 30%')";
        db.execSQL(sql);
        sql = "INSERT INTO TRASUA(image,name,description,price,star,sale) VALUES ('ts6','Trà Sữa Thái Xanh BonBon','12 Ngô Gia Tự, Hải Châu, Đà Nẵng','55.000đ','4.9','7.8km','Mã Giảm Giá 30%')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
