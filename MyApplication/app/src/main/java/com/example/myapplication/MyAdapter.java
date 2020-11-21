package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<FoodViewHolder>{

    private Context mContext;
    private List<Trasua_Data> myFoodList;

    public MyAdapter(Context mContext, List<Trasua_Data> myFoodList) {
        this.mContext = mContext;
        this.myFoodList = myFoodList;
    }

    @Override
    public com.example.myapplication.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fragment_1,viewGroup,false);
        return new com.example.myapplication.FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final com.example.myapplication.FoodViewHolder foodViewHolder, int i) {
        foodViewHolder.imageView.setImageResource(myFoodList.get(i).getItemImage());
        foodViewHolder.mTitle.setText(myFoodList.get(i).getItemName());
        foodViewHolder.mDescription.setText(myFoodList.get(i).getItemDescription());
        foodViewHolder.mPrice.setText(myFoodList.get(i).getItemPrice());
        foodViewHolder.mDanhGia.setText(myFoodList.get(i).getItemDanhGia());
        foodViewHolder.mKm.setText(myFoodList.get(i).getItemKm());
        foodViewHolder.mGiamGia.setText(myFoodList.get(i).getItemGiamGia());

    }

    @Override
    public int getItemCount() {
        return myFoodList.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle,mDescription,mPrice,mDanhGia,mKm,mGiamGia;
    CardView mCardView;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
        mTitle =  itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mPrice = itemView.findViewById(R.id.tvPrice);
        mDanhGia = itemView.findViewById(R.id.danhgia);
        mKm = itemView.findViewById(R.id.km);
        mGiamGia = itemView.findViewById(R.id.magiam);
        mCardView = itemView.findViewById(R.id.myCardView);
    }
}
