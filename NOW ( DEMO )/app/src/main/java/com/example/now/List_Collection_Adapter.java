package com.example.now;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class List_Collection_Adapter extends ArrayAdapter<String>
{
    Context context2;
    String rTitle2[];
    int rImages2[];

    List_Collection_Adapter (Context c2, String title2[], int imgs2[]) {
        super(c2, R.layout.item_menu, R.id.textView1, title2);
        this.context2 = c2;
        this.rTitle2 = title2;
        this.rImages2 = imgs2;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = layoutInflater.inflate(R.layout.item_collection, parent, false);
        ImageView images2 = row.findViewById(R.id.image2);
        TextView myTitle2 = row.findViewById(R.id.textView2);
        images2.setImageResource(rImages2[position]);
        myTitle2.setText(rTitle2[position]);
        return row;
    }
}