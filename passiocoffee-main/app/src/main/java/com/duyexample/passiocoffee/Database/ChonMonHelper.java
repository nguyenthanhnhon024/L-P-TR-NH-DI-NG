package com.duyexample.passiocoffee.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ChonMonHelper extends SQLiteOpenHelper {
    public ChonMonHelper(@Nullable Context context){
        super(context, "Chonmon", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql1 = "CREATE TABLE Greenxmas(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, price text)";
        sqLiteDatabase.execSQL(sql1);
        sql1 = "INSERT INTO Greenxmas(image, title, price) VALUES ('xmas_1', 'Choco XMas (L)','55.000đ')";
        sqLiteDatabase.execSQL(sql1);
        sql1 = "INSERT INTO Greenxmas(image, title, price) VALUES ('xmas_2', 'Cookie XMas (L)','55.000đ')";
        sqLiteDatabase.execSQL(sql1);

        String sql2 = "CREATE TABLE Ice(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, price text)";
        sqLiteDatabase.execSQL(sql2);
        sql2 = "INSERT INTO Ice(image, title, price) VALUES ('capu', 'Passiopuccino','36.000đ')";
        sqLiteDatabase.execSQL(sql2);
        sql2 = "INSERT INTO Ice(image, title, price) VALUES ('cream', 'Cookie Cream','39.000đ')";
        sqLiteDatabase.execSQL(sql2);
        sql2 = "INSERT INTO Ice(image, title, price) VALUES ('matcha', 'Match Green Tea','49.000đ')";
        sqLiteDatabase.execSQL(sql2);
        sql2 = "INSERT INTO Ice(image, title, price) VALUES ('choco', 'Iced Chocolate','44.000đ')";
        sqLiteDatabase.execSQL(sql2);
        sql2 = "INSERT INTO Ice(image, title, price) VALUES ('mocha', 'PassioChoco','39.000đ')";
        sqLiteDatabase.execSQL(sql2);

        String sql3 = "CREATE TABLE Soda(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, price text)";
        sqLiteDatabase.execSQL(sql3);
        sql3 = "INSERT INTO Soda(image, title, price) VALUES ('soda_1', 'Ananas Tea','39.000đ')";
        sqLiteDatabase.execSQL(sql3);
        sql3 = "INSERT INTO Soda(image, title, price) VALUES ('soda_2', 'Oinky Summer','42.000đ')";
        sqLiteDatabase.execSQL(sql3);

        String sql4 = "CREATE TABLE Coffee(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, price text)";
        sqLiteDatabase.execSQL(sql4);
        sql4 = "INSERT INTO Coffee(image, title, price) VALUES ('cafe', 'While Coffee','35.000đ')";
        sqLiteDatabase.execSQL(sql4);
        sql4 = "INSERT INTO Coffee(image, title, price) VALUES ('bacxiu', 'Espresso Bạc Xĩu','25.000đ')";
        sqLiteDatabase.execSQL(sql4);
        sql4 = "INSERT INTO Coffee(image, title, price) VALUES ('caramel', 'Hot Latte','35.000đ')";
        sqLiteDatabase.execSQL(sql4);
        sql4 = "INSERT INTO Coffee(image, title, price) VALUES ('espresso', 'Hot Capuchino','35.000đ')";
        sqLiteDatabase.execSQL(sql4);

        String sql5 = "CREATE TABLE Fresh(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, price text)";
        sqLiteDatabase.execSQL(sql5);
        sql5 = "INSERT INTO Fresh(image, title, price) VALUES ('fresh_1', 'Chanh Tuyết','29.000đ')";
        sqLiteDatabase.execSQL(sql5);
        sql5 = "INSERT INTO Fresh(image, title, price) VALUES ('fresh_2', 'Mojto Tea','39.000đ')";
        sqLiteDatabase.execSQL(sql5);
        sql5 = "INSERT INTO Fresh(image, title, price) VALUES ('fresh_3', 'Peach Tea','39.000đ')";
        sqLiteDatabase.execSQL(sql5);
        sql5 = "INSERT INTO Fresh(image, title, price) VALUES ('fresh_4', 'PINK LADY ICED TEA (L)','42.000đ')";
        sqLiteDatabase.execSQL(sql5);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
