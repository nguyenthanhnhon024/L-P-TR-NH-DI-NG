package com.duyexample.passiocoffee.TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.duyexample.passiocoffee.DTO.TinTuc;
import com.duyexample.passiocoffee.Database.TinTucHelper;

import java.util.ArrayList;

public class TintucTV {
    TinTucHelper helper309;
    public TintucTV(Context context){
        helper309 = new TinTucHelper(context);
    }
    public ArrayList<TinTuc> getAll(){
        ArrayList<TinTuc> ds309 = new ArrayList<>();
        SQLiteDatabase db309 =helper309.getReadableDatabase();
        Cursor cs309 = db309.rawQuery("SELECT * FROM Danhsachtt", null);
        cs309.moveToFirst();
        while (!cs309.isAfterLast()) {
            int id = cs309.getInt(0);
            String image = cs309.getString(1);
            String title = cs309.getString(2);
            String cmt = cs309.getString(3);
            TinTuc a309 = new TinTuc(id, image, title, cmt);
            ds309.add(a309);
            cs309.moveToNext();
        }
        cs309.close();
        return ds309;
    }
}
