package com.example.now.TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.now.Database.DB_Menu;
import com.example.now.DTO.Menu;

import java.util.ArrayList;

public class Menu_TV {
    DB_Menu helper;
    public Menu_TV(Context context){
        helper = new DB_Menu(context);
    }
    public ArrayList<Menu> getAll(){
        ArrayList<Menu> ds = new ArrayList<>();
        SQLiteDatabase db =helper.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM MENU", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            int id = cs.getInt(0);
            String image = cs.getString(1);
            String title = cs.getString(2);
            Menu a = new Menu(id, image, title);
            ds.add(a);
            cs.moveToNext();
        }
        cs.close();
        return ds;
    }
}
