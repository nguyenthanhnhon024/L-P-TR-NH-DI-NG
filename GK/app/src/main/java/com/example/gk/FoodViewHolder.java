package com.example.gk;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView_330;
    TextView mTitle_330,mPrice_330,mDanhGia_330,mGiamGia_330;
    CardView mCardView_330;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView_330 = itemView.findViewById(R.id.ivImage);
        mTitle_330 =  itemView.findViewById(R.id.tvTitle);
        mPrice_330 = itemView.findViewById(R.id.tvPrice);
        mDanhGia_330 = itemView.findViewById(R.id.danhgia);
        mGiamGia_330 = itemView.findViewById(R.id.magiam);
        mCardView_330 = itemView.findViewById(R.id.myCardView);
    }
}
