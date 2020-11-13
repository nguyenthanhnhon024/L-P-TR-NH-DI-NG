package com.example.kiemtralan2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class hinhAnhAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<hinhAnh> hinhAnhList;

    public hinhAnhAdapter(Context context, int layout, List<hinhAnh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        ImageView imgHinh;
        TextView strName;
        TextView strTittle;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.img);
            holder.strName = (TextView) convertView.findViewById(R.id.name);
            holder.strTittle = (TextView) convertView.findViewById(R.id.tittle);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        hinhAnh hinhAnh  = hinhAnhList.get(position);
        holder.imgHinh.setImageResource(hinhAnh.getImg());
        holder.strName.setText(hinhAnh.getName());
        holder.strTittle.setText(hinhAnh.getTittle());
        return convertView;
    }
}
