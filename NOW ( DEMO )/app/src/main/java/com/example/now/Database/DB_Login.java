package com.example.now.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Login extends SQLiteOpenHelper {
    public DB_Login(@Nullable Context context) {
        super(context, "Login", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE ACCOUNT(id INTEGER PRIMARY KEY AUTOINCREMENT,user text, pass text)";
        db.execSQL(sql);
        sql = "INSERT INTO ACCOUNT(user, pass) VALUES ('nhon','123')";
        db.execSQL(sql);
        sql = "INSERT INTO ACCOUNT(user, pass) VALUES ('nhon2','123')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists ACCOUNT");
    }

    public boolean insertData(String user, String pass){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("user", user);
        values.put("pass", pass);
        long result = db.insert("ACCOUNT",null, values );
        if(result == -1){
            return false;
        }else {
            return true;
        }
    }

    // Kiểm tra mật khẩu 1 vs 2 trùng nhau hay k
    public boolean chkuser(String user){
         SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from ACCOUNT where user=?",new String[]{user});
        if(cursor.getCount()>0) return  false;
        else return true;
    }

    // Kiểm tra đăng nhập
    public boolean userpass(String user ,String pass){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from ACCOUNT where user=? and pass=?",new String[]{user,pass});
        if(cursor.getCount()>0) return  true;
        else return false;
    }
}
