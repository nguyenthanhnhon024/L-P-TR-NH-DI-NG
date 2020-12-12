package com.example.thecoffeehouse.DatHang.Tab.ThucUong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;

import java.util.List;

public class ThucUongAdapter extends RecyclerView.Adapter<ThucUongAdapter.MyViewHolder>{

    private Context context;
    private List<ListThucUong> apps;

    public ThucUongAdapter(Context context, List<ListThucUong> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mGia;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mGia=itemView.findViewById(R.id.giagrid);
            mName = itemView.findViewById(R.id.namegrid);
            mImage = itemView.findViewById(R.id.imggrid);
        }
    }

    @NonNull
    @Override
    public ThucUongAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_data_grid_phobien,parent,false);

        return new ThucUongAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ThucUongAdapter.MyViewHolder holder, int position) {

        ListThucUong app = apps.get(position);

        holder.mName.setText(app.getNametu());
        holder.mImage.setImageResource(app.getImgtu());
        holder.mGia.setText(app.getGiatu());

    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

}