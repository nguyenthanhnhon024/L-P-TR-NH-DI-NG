package com.example.now.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Map extends SQLiteOpenHelper {
    public DB_Map(@Nullable Context context) {
        super(context, "DIADIEM", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE DIADIEM(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, quan text, diachi)";
        db.execSQL(sql);
        sql = "INSERT INTO DIADIEM(image, quan,diachi) VALUES ('pasteur','Quận Hải Châu','80 Pasteur')";
        db.execSQL(sql);
        sql = "INSERT INTO DIADIEM(image, quan,diachi) VALUES ('trieunuvuong','Quận Hải Châu','9 Triệu Nữ Vương')";
        db.execSQL(sql);
        sql = "INSERT INTO DIADIEM(image, quan,diachi) VALUES ('leduan','Quận Thanh Khê','435 Lê Duẩn')";
        db.execSQL(sql);
        sql = "INSERT INTO DIADIEM(image, quan,diachi) VALUES ('nguyenchithanh','Quận Hải Châu','80 Nguyễn C.Thanh')";
        db.execSQL(sql);
        sql = "INSERT INTO DIADIEM(image, quan,diachi) VALUES ('nguyenvanlinh','Quận Hải Châu','A4-2 Nguyễn V.Linh')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
