package com.example.now.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.now.Activity_Milk_Tea;
import com.example.now.DTO.DiaDiem;
import com.example.now.DTO.Menu;
import com.example.now.R;

import java.util.List;

public class DiaDiem_Adapter extends BaseAdapter {
    private Context context;
    private List<DiaDiem> menuList;

    public DiaDiem_Adapter(Context context, List<DiaDiem> menuList){
        this.context = context;
        this.menuList = menuList;
    }
    @Override
    public int getCount() {
        return menuList.size();
    }

    @Override
    public Object getItem(int i) {
        return menuList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage;
        TextView mLangQuan;
        TextView mLangDiachi;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_maps, null);
            holder = new ViewHolder(view);
            holder.mImage = (ImageView) view.findViewById(R.id.imgst);
            holder.mLangQuan = (TextView) view.findViewById(R.id.namest);
            holder.mLangDiachi = (TextView) view.findViewById(R.id.chitietst);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            DiaDiem p = menuList.get(i);
            String image = p.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage.setImageResource(resId);
            holder.mLangQuan.setText(p.getQuan());
            holder.mLangDiachi.setText(p.getDiachi());


        } catch (Exception ẽx){
        }
        return view;
    }
}
