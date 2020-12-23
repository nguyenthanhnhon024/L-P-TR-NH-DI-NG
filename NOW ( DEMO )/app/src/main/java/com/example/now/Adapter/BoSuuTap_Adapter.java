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

import com.example.now.DTO.Menu;
import com.example.now.R;

import java.util.List;

public class BoSuuTap_Adapter extends BaseAdapter {
    private Context context;
    private List<Menu> menuList;

    public BoSuuTap_Adapter(Context context, List<Menu> menuList){
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
        TextView mLangTitle;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_collection, null);
            holder = new ViewHolder(view);
            holder.mImage = (ImageView) view.findViewById(R.id.image2);
            holder.mLangTitle = (TextView) view.findViewById(R.id.title2);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            Menu p = menuList.get(i);
            String image = p.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage.setImageResource(resId);
            holder.mLangTitle.setText(p.getTitle());
        } catch (Exception ẽx){
        }
        return view;
    }
}
