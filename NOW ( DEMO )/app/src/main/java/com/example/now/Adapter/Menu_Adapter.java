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
import com.example.now.DTO.Menu;
import com.example.now.R;

import java.util.List;

public class Menu_Adapter extends BaseAdapter {
    private Context context;
    private List<Menu> menuList;

    public Menu_Adapter(Context context, List<Menu> menuList){
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
            view = LayoutInflater.from(context).inflate(R.layout.item_menu, null);
            holder = new ViewHolder(view);
            holder.mImage = (ImageView) view.findViewById(R.id.image);
            holder.mLangTitle = (TextView) view.findViewById(R.id.title);

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

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Activity_Milk_Tea.class);

                    context.startActivity(intent);
                }
            });

        } catch (Exception ẽx){
        }
        return view;
    }
}
