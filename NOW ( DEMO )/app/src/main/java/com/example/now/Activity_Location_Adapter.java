package com.example.now;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_Location_Adapter extends BaseAdapter {
    Context context;
    ArrayList<Location> productsData;
    LayoutInflater layoutInflater;
    Location productModel;

    public Activity_Location_Adapter(Context context, ArrayList<Location> productData) {
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
        if (view1 == null) {
            view1 = layoutInflater.inflate(R.layout.item_location, null, true);
        }
        //getting view in row_data
        TextView name = view1.findViewById(R.id.idten);
        TextView sl = view1.findViewById(R.id.iddd);

        productModel = productsData.get(position);

        name.setText(productModel.getName());
        sl.setText(productModel.getsl());
        return view1;
    }
}
