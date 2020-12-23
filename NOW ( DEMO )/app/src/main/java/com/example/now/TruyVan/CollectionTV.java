
package com.example.now.TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.now.DTO.CollectionBST;
import com.example.now.Database.Collection;

import java.util.ArrayList;

public class CollectionTV {
   Collection helper;
    public CollectionTV(Context context){
        helper = new Collection(context);
    }
    public ArrayList<CollectionBST> getAll(){
        ArrayList<CollectionBST> ds = new ArrayList<>();
        SQLiteDatabase db =helper.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM DanhsachBST", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            int id = cs.getInt(0);
            String image = cs.getString(1);
            String title = cs.getString(2);
            CollectionBST a = new CollectionBST(id, image, title);
            ds.add(a);
            cs.moveToNext();
        }
        cs.close();
        return ds;
    }

}
