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

class List_Menu_Adapter extends ArrayAdapter<String>
{
    Context context;
    String rTitle[];
    int rImages[];

    List_Menu_Adapter (Context c, String title[], int imgs[]) {
        super(c, R.layout.item_menu, R.id.textView1, title);
        this.context = c;
        this.rTitle = title;
        this.rImages = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = layoutInflater.inflate(R.layout.item_menu, parent, false);
        ImageView images = row.findViewById(R.id.image);
        TextView myTitle = row.findViewById(R.id.textView1);
        images.setImageResource(rImages[position]);
        myTitle.setText(rTitle[position]);
        return row;
    }
}