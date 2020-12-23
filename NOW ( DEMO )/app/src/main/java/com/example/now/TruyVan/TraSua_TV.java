package com.example.now.TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.now.DTO.TraSua;
import com.example.now.Database.DB_Menu;
import com.example.now.DTO.Menu;
import com.example.now.Database.DB_Trasua;

import java.util.ArrayList;

public class TraSua_TV {
    DB_Trasua helper;
    public TraSua_TV (Context context){
        helper = new DB_Trasua(context);
    }
    public ArrayList<TraSua> getAll(){
        ArrayList<TraSua> ds = new ArrayList<>();
        SQLiteDatabase db =helper.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM TRASUA", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            int id = cs.getInt(0);
            String image = cs.getString(1);
            String name = cs.getString(2);
            String description = cs.getString(3);
            String price = cs.getString(3);
            String star = cs.getString(4);
            String km = cs.getString(5);
            String sale = cs.getString(6);
            TraSua a = new TraSua(id, image, name,description,price,star,km,sale);
            ds.add(a);
            cs.moveToNext();
        }
        cs.close();
        return ds;
    }
}