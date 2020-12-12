package com.example.thecoffeehouse.CuaHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ListThucUong;
import com.example.thecoffeehouse.R;

import java.util.List;

public class CuaHangAdapter extends RecyclerView.Adapter<CuaHangAdapter.MyViewHolder>{

    private Context context;
    private List<ListThucUong> apps;

    public CuaHangAdapter(Context context, List<ListThucUong> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mGia;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mGia=itemView.findViewById(R.id.chitietst);
            mName = itemView.findViewById(R.id.namest);
            mImage = itemView.findViewById(R.id.imgst);
        }
    }

    @NonNull
    @Override
    public CuaHangAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycle_store,parent,false);

        return new CuaHangAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CuaHangAdapter.MyViewHolder holder, int position) {

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