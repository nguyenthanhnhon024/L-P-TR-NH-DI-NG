package com.example.thecoffeehouse.TinTuc.UuDaiDacBIet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;

import java.util.List;

public class UuDaiDacBietAdapter extends RecyclerView.Adapter<UuDaiDacBietAdapter.MyViewHolder>{

    private Context context;
    private List<ListUuDaiDacBiet> apps;

    public UuDaiDacBietAdapter(Context context, List<ListUuDaiDacBiet> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mChitiet;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mChitiet=itemView.findViewById(R.id.chitietud);
            mName = itemView.findViewById(R.id.nameud);
            mImage = itemView.findViewById(R.id.imgud);
        }
    }

    @NonNull
    @Override
    public UuDaiDacBietAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycle_uudaidacbiet,parent,false);

        return new UuDaiDacBietAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UuDaiDacBietAdapter.MyViewHolder holder, int position) {

        ListUuDaiDacBiet app = apps.get(position);

        holder.mName.setText(app.getNameuudd());
        holder.mImage.setImageResource(app.getImguudd());
        holder.mChitiet.setText(app.getChitietuudd());

    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

}