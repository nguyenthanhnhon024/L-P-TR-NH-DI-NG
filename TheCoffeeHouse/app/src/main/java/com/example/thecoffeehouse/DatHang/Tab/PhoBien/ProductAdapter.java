package com.example.thecoffeehouse.DatHang.Tab.PhoBien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    Context context;
    ArrayList<ProductModel> productsData;
    LayoutInflater layoutInflater;
    ProductModel productModel;

    public ProductAdapter(Context context, ArrayList<ProductModel> productData) {
        this.context = context;
        this.productsData = productData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return productsData.size();
    }

    @Override
    public Object getItem(int i) {
        return productsData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productsData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;
        if (view1==null) {
            view1 = layoutInflater.inflate(R.layout.row_data_grid_phobien,null, true);
        }
        //getting view in row_data
        TextView name = view1.findViewById(R.id.namegrid);
        ImageView image = view1.findViewById(R.id.imggrid);
        TextView gia = view1.findViewById(R.id.giagrid);

        productModel = productsData.get(position);

        name.setText(productModel.getNamesp());
        image.setImageResource(productModel.getImagesp());
        gia.setText(productModel.getGiasp());
        return view1;
    }
}