package com.example.now.TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.now.DTO.DiaDiem;
import com.example.now.Database.DB_Map;

import java.util.ArrayList;

public class DiaDiem_TV {
    DB_Map helper;
    public DiaDiem_TV(Context context){
        helper = new DB_Map(context);
    }
    public ArrayList<DiaDiem> getAll(){
        ArrayList<DiaDiem> ds = new ArrayList<>();
        SQLiteDatabase db =helper.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM DIADIEM", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            int id = cs.getInt(0);
            String image = cs.getString(1);
            String quan = cs.getString(2);
            String diachi = cs.getString(3);
            DiaDiem a = new DiaDiem(id, image, quan,diachi);
            ds.add(a);
            cs.moveToNext();
        }
        cs.close();
        return ds;
    }
}
