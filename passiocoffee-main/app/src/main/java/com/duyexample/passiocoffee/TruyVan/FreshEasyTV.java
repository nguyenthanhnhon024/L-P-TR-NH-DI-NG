package com.duyexample.passiocoffee.TruyVan;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.duyexample.passiocoffee.DTO.Notification;
import com.duyexample.passiocoffee.Database.ChonMonHelper;

import java.util.ArrayList;

public class FreshEasyTV {
    ChonMonHelper helper309;
    public FreshEasyTV(Context context){
        helper309 = new ChonMonHelper(context);
    }
    public ArrayList<Notification> getAll(){
        ArrayList<Notification> ds309 = new ArrayList<>();
        SQLiteDatabase db309 =helper309.getReadableDatabase();
        Cursor cs309 = db309.rawQuery("SELECT * FROM Fresh", null);
        cs309.moveToFirst();
        while (!cs309.isAfterLast()) {
            int id = cs309.getInt(0);
            String image = cs309.getString(1);
            String title = cs309.getString(2);
            String price = cs309.getString(3);
            Notification a309 = new Notification(id, image, title, price);
            ds309.add(a309);
            cs309.moveToNext();
        }
        cs309.close();
        return ds309;
    }
}
