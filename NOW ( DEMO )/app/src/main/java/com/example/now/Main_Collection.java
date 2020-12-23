package com.example.now;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.now.Adapter.CollectionAdapter;
import com.example.now.DTO.CollectionBST;
import com.example.now.TruyVan.CollectionTV;

import java.util.ArrayList;

public class Main_Collection extends AppCompatActivity {

    ImageView back;
    GridView gv;
    ArrayList<CollectionBST> collectionBSTArrayList;
    CollectionAdapter adapter;
    com.example.now.TruyVan.CollectionTV CollectionTV;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        CollectionTV = new CollectionTV(Main_Collection.this);
        collectionBSTArrayList = CollectionTV.getAll();
        gv = findViewById(R.id.gridview);
        adapter = new CollectionAdapter(Main_Collection.this, collectionBSTArrayList);
        gv.setAdapter(adapter);

        back = findViewById(R.id.back);
        back.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View VIEW )
            {
                Intent INTENT_03 = new Intent(Main_Collection.this, MainActivity.class ) ;
                startActivity( INTENT_03 ) ;
            }
        }) ;
    }
}