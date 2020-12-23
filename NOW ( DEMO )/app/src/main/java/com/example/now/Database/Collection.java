package com.example.now.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Collection extends SQLiteOpenHelper {
    public Collection(@Nullable Context context) {
        super(context, "BoSuuTap", null, 1);
    } //mặc định phải có tên đătt tùy ý

    public Collection(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE DanhsachBST(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text)";
        sqLiteDatabase.execSQL(sql);

        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n13', 'Giảm 25%')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n14', 'Giảm 20K')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n15', 'Now 0đ')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n16', 'Mua 2 tặng 1')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n1', 'Giờ vàng 40%')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n2', 'Áp dụng trên 50k')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n3', 'Ăn sang 50%')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n4', 'Ăn miễn phí vs AIRPAY')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n5', 'Top sản phẩm giảm 25%')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n6', 'Thứ 3 mỗi tuần')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n7', 'Gợi ý ăn sáng')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n8', 'Món ăn khuya')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n9', 'Đặt bàn trên NowTable')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n10', 'Top món mềm dẻo')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n11', 'Giảm 90%')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO DanhsachBST(image, title) VALUES ('n12', 'Giảm 150K')";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
