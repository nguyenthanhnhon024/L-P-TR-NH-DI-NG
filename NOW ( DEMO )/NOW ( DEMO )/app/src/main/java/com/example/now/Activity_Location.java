package com.example.now;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity_Location extends AppCompatActivity {
    GridView gridView;
    Context context;
    ArrayList<Location> productData;
    Activity_Location_Adapter productAdapter;
    Location productModel;
    ImageView IV_LOCATION_ICON_BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_location);

        IV_LOCATION_ICON_BACK = findViewById(R.id.IV_LOCATION_ICON_BACK);
        gridView = findViewById(R.id.gridView);
        productData = new ArrayList<>();

        populateProductData();
        productAdapter = new Activity_Location_Adapter(context, productData);
        gridView.setAdapter(productAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, productData.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        IV_LOCATION_ICON_BACK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void populateProductData() {
        productModel = new Location();
        productModel.setName("TP.Hồ Chí Minh");
        productModel.setsl("50076 địa điểm");
        productData.add(productModel);

        //product2
        productModel = new Location();
        productModel.setName("Hà Nội");
        productModel.setsl("24783 địa điểm");
        productData.add(productModel);

        //product3
        productModel = new Location();
        productModel.setName("Cần Thơ");
        productModel.setsl("2458 địa điểm");
        productData.add(productModel);

        //product4
        productModel = new Location();
        productModel.setName("Hải Phòng");
        productModel.setsl("2440 địa điểm");
        productData.add(productModel);

        //product5
        productModel = new Location();
        productModel.setName("Huế");
        productModel.setsl("1318 địa điểm");
        productData.add(productModel);

        //product6
        productModel = new Location();
        productModel.setName("Nghệ An");
        productModel.setsl("1454 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Khánh Hòa");
        productModel.setsl("1520 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Đồng Nai");
        productModel.setsl("1729 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Vũng Tàu");
        productModel.setsl("1311 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Bắc Ninh");
        productModel.setsl("358 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Bình Dương");
        productModel.setsl("1123 địa điểm");
        productData.add(productModel);

        productModel = new Location();
        productModel.setName("Quảng Nam");
        productModel.setsl("697 địa điểm");
        productData.add(productModel);
    }
}
