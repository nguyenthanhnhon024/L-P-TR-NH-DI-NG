package com.example.gk;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<FoodViewHolder>{

    private Context mContext_330;
    private List<FoodData> myFoodList_330;

    public MyAdapter(Context mContext, List<FoodData> myFoodList) {
        this.mContext_330 = mContext;
        this.myFoodList_330 = myFoodList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dathang_item,viewGroup,false);
        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final FoodViewHolder foodViewHolder, int i) {
        foodViewHolder.imageView_330.setImageResource(myFoodList_330.get(i).getItemImage());
        foodViewHolder.mTitle_330.setText(myFoodList_330.get(i).getItemName());
        foodViewHolder.mPrice_330.setText(myFoodList_330.get(i).getItemPrice());
        foodViewHolder.mDanhGia_330.setText(myFoodList_330.get(i).getItemDanhGia());
        foodViewHolder.mGiamGia_330.setText(myFoodList_330.get(i).getItemGiamGia());

        foodViewHolder.mCardView_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext_330,Main_Dathang_Detail.class);
                intent.putExtra("Image",myFoodList_330.get(foodViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("DanhGia",myFoodList_330.get(foodViewHolder.getAdapterPosition()).getItemDanhGia());
                intent.putExtra("Price",myFoodList_330.get(foodViewHolder.getAdapterPosition()).getItemPrice());
                intent.putExtra("Title",myFoodList_330.get(foodViewHolder.getAdapterPosition()).getItemName());
                mContext_330.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myFoodList_330.size();
    }
}
