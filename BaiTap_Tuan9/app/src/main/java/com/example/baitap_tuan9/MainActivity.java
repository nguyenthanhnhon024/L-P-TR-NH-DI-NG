package com.example.baitap_tuan9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv;
    final Context context = this;
    ListView lv;
    GridView gv;
    GridViewAdapter gridViewAdapter;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    int idd=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.mygridview);
        arr_bean = new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.vietnam,"Việt Nam"));
        arr_bean.add(new ListViewBean(R.drawable.american,"American"));
        arr_bean.add(new ListViewBean(R.drawable.cambodia,"Campuchia"));
        arr_bean.add(new ListViewBean(R.drawable.lao,"Lào"));
        arr_bean.add(new ListViewBean(R.drawable.malaysia,"Malaysia"));
        arr_bean.add(new ListViewBean(R.drawable.myanmar,"Myanmar"));
        arr_bean.add(new ListViewBean(R.drawable.thailan,"Thái Lan"));
        arr_bean.add(new ListViewBean(R.drawable.singapore,"Singapore"));
        arr_bean.add(new ListViewBean(R.drawable.philippines,"Philippines"));
        arr_bean.add(new ListViewBean(R.drawable. indonesia,"Indonesia"));
        gridViewAdapter = new GridViewAdapter(this, R.id.mygridview, arr_bean) {
            @Override
            public long getItemId(int i) {
                return 0;
            }
        };
        gv.setAdapter(gridViewAdapter);

        GridView Lv = findViewById(R.id.mygridview);

        gv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                idd=position;
                return false;
            }

        });

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), arr_bean.get(i).getLangName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),ProductDetails.class);
                intent.putExtra("name",arr_bean.get(i).getLangName());
                intent.putExtra("image",arr_bean.get(i).getImage());
                startActivity(intent);
            }
        });



        registerForContextMenu(Lv);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuinfo){
        super.onCreateContextMenu(menu, v, menuinfo);
        menu.setHeaderTitle("Chose your option");
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.op1:
                Toast.makeText(this, "Thêm Mới", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op2:
                Toast.makeText(this, "Sửa Đổi", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.xoa:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                alertDialogBuilder.setTitle("Xác nhận");
                alertDialogBuilder.setMessage("Bạn có đồng ý Xóa không?");
                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Delete",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        arr_bean.remove(idd);
                                        idd=-1;
                                        gridViewAdapter.notifyDataSetChanged();
                                        Toast.makeText(MainActivity.this,"Delete success",Toast.LENGTH_LONG).show();
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}