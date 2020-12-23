package com.example.now.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Menu extends SQLiteOpenHelper {
    public DB_Menu(@Nullable Context context) {
        super(context, "Menu", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE MENU(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text)";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_milk_tea','Trà Sữa')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_rice','Cơm')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_snacks','Ăn Vặt')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_book','Đặt Bàn')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_partner','Đối Tac')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_flower','Hoa')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_medicine','Thuốc')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_beer','Bia')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_helper','Giúp Việc')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_extra','Freeship Xtra')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_delivery','NowShip')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_airpay','Ưu Đãi AirPay')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_store','Quán Mới')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_food','NowFresh')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_supermarket','Siêu Thị')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_dog_foot','Thú Cưng')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_laundry','Giặt Ủi')";
        db.execSQL(sql);
        sql = "INSERT INTO MENU(image, title) VALUES ('icon_cosmetic','Làm Đẹp')";
        db.execSQL(sql);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
