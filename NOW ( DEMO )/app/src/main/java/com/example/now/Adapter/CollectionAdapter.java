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

import com.example.now.Clicked_Item_Collection_02;
import com.example.now.DTO.CollectionBST;
import com.example.now.R;

import java.util.List;


public class CollectionAdapter extends BaseAdapter {
    private Context context;
    private List<CollectionBST> boSuuTapList;



    public CollectionAdapter(Context context, List<CollectionBST> boSuuTapList) {
        this.context = context;
        this.boSuuTapList = boSuuTapList;
    }

    @Override
    public int getCount() {
        return boSuuTapList.size();
    }

    @Override
    public Object getItem(int i) {
        return boSuuTapList.get(i);
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        final CollectionAdapter.ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_collection_02, null);
            holder = new ViewHolder(view);
            holder.mImage = (ImageView) view.findViewById(R.id.imageView);
            holder.mLangTitle = (TextView) view.findViewById(R.id.tvName);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            CollectionBST p= boSuuTapList.get(i);
            String image = p.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage.setImageResource(resId);
            holder.mLangTitle.setText(p.getTitle());


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Clicked_Item_Collection_02.class);
                    intent.putExtra("title",boSuuTapList.get(i).getTitle());
                    context.startActivity(intent);
                }
            });
        } catch (Exception ẽx){
        }
        return view;
    }
}
