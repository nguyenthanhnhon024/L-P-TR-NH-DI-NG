package com.example.thecoffeehouse.TinTuc.LuaChonTinTuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;

import java.util.List;

public class LuaChonTinTucAdapter extends RecyclerView.Adapter<LuaChonTinTucAdapter.MyViewHolder>{

    private Context context;
    private List<ListLuaChonTinTuc> apps;

    public LuaChonTinTucAdapter(Context context, List<ListLuaChonTinTuc> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.txtlc);
            mImage = itemView.findViewById(R.id.imglc);
        }
    }

    @NonNull
    @Override
    public LuaChonTinTucAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycle_tintuc_luachon,parent,false);

        return new LuaChonTinTucAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LuaChonTinTucAdapter.MyViewHolder holder, int position) {

        ListLuaChonTinTuc app = apps.get(position);

        holder.mName.setText(app.getNameicon());
        holder.mImage.setImageResource(app.getImageicon());


    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

}