package com.duyexample.passiocoffee.Adapter;

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

import com.duyexample.passiocoffee.DTO.News;
import com.duyexample.passiocoffee.R;
import com.duyexample.passiocoffee.Activity.NotificationDetailActivity;

import java.util.List;

public class NewsAdapter extends BaseAdapter {

    private Context context;
    private List<News> tintucList309;

    public NewsAdapter(Context context, List<News> tintucList309){
        this.context = context;
        this.tintucList309 = tintucList309;
    }
    @Override
    public int getCount() {
        return tintucList309.size();
    }

    @Override
    public Object getItem(int i) {
        return tintucList309.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage309;
        TextView mLangTitle309, mLangCmt309;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.grid_rows, null);
            holder = new ViewHolder(view);
            holder.mImage309 = (ImageView) view.findViewById(R.id.image);
            holder.mLangTitle309 = (TextView) view.findViewById(R.id.tv_title);
            holder.mLangCmt309 = (TextView) view.findViewById(R.id.tv_descript);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            News p309 = tintucList309.get(i);
            String image = p309.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage309.setImageResource(resId);
            holder.mLangTitle309.setText(p309.getTitle());
            holder.mLangCmt309.setText(p309.getCmt());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, NotificationDetailActivity.class);
                    intent.putExtra("title",tintucList309.get(i).getTitle());
                    context.startActivity(intent);
                }
            });
        } catch (Exception ẽx){
        }
        return view;
    }
}
