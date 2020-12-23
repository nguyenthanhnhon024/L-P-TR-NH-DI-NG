package com.duyexample.passiocoffee.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.duyexample.passiocoffee.DTO.Notification;
import com.duyexample.passiocoffee.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

public class NotificationAdapter extends BaseAdapter {
    private Context context;
    private List<Notification> chonMonList309;
    public NotificationAdapter(Context context, List<Notification> chonMonList309){
        this.context = context;
        this.chonMonList309 =chonMonList309;
    }
    @Override
    public int getCount() {
        return chonMonList309.size();
    }

    @Override
    public Object getItem(int i) {
        return chonMonList309.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage309;
        TextView mLangTitle309, mLangPrice309;
        ImageView proImg309;
        TextView proTitle309, proPrice309;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_order, null);
            holder = new ViewHolder(view);
            holder.mImage309 = (ImageView) view.findViewById(R.id.image);
            holder.mLangTitle309 = (TextView) view.findViewById(R.id.name);
            holder.mLangPrice309 = (TextView) view.findViewById(R.id.price);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            Notification no309 = chonMonList309.get(i);
            String image = no309.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage309.setImageResource(resId);
            holder.mLangTitle309.setText(no309.getTitle());
            holder.mLangPrice309.setText(no309.getPrice());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    View bottomSheetView = null;
                    final ViewHolder holder1;
                    String Title = chonMonList309.get(i).getTitle();
                    String Price = chonMonList309.get(i).getPrice();
                    int resId = ((Activity)context).getResources().getIdentifier(chonMonList309.get(i).getImage(), "drawable", ((Activity)context).getPackageName());

                    final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetDialogTheme);
                    if( bottomSheetView == null){
                        bottomSheetView = LayoutInflater.from(context).inflate(R.layout.activity_click_buy,null);
                        holder1 = new ViewHolder(bottomSheetView);

                        holder1.proImg309 = (ImageView) bottomSheetView.findViewById(R.id.dialog_image);
                        holder1.proTitle309 = (TextView) bottomSheetView.findViewById(R.id.dialog_title);
                        holder1.proPrice309 = (TextView) bottomSheetView.findViewById(R.id.dialog_price);

                        bottomSheetView.setTag(holder1);
                    }
                    else {
                        holder1 = (ViewHolder) bottomSheetView.getTag();
                    }

                    try {
                        holder1.proTitle309.setText(Title);
                        holder1.proPrice309.setText(Price);
                        holder1.proImg309.setImageResource(resId);
                    } catch (Exception ex){

                    }

                    bottomSheetDialog.setContentView(bottomSheetView);
                    bottomSheetDialog.show();
                    View finalBottomSheetView = bottomSheetView;
                    bottomSheetView.findViewById(R.id.remove_sl).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String output1 = Price;

                            TextView currentQuantityText = finalBottomSheetView.findViewById(R.id.soluong);
                            int currentQuantity = Integer.parseInt((String) currentQuantityText.getText());
                            if(currentQuantity > 1) {
                                int newQuantity = currentQuantity - 1;
                                currentQuantityText.setText(String.valueOf(newQuantity));

                                TextView giaText = finalBottomSheetView.findViewById(R.id.dialog_price);
                                int gia = Integer.parseInt(output1.substring(0,2));
                                int newGia = gia * newQuantity;
                                String newGia1 = newGia +".000đ";
                                giaText.setText(newGia1);
                            }
                        }
                    });
                    bottomSheetView.findViewById(R.id.add_sl);
                    bottomSheetView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String output2 = Price;
                            TextView currentQuantityText = finalBottomSheetView.findViewById(R.id.soluong);
                            int currentQuantity = Integer.parseInt((String) currentQuantityText.getText());
                            int newQuantity = currentQuantity + 1;
                            currentQuantityText.setText(String.valueOf(newQuantity));

                            TextView giaText = finalBottomSheetView.findViewById(R.id.dialog_price);
                            int gia = Integer.parseInt(output2.substring(0,2));
                            int newGia = gia * newQuantity;
                            String newGia1 = newGia +".000đ";
                            giaText.setText(newGia1);
                        }
                    });
                    bottomSheetView.findViewById(R.id.add_gh).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            bottomSheetDialog.hide();
                        }
                    });
                }
            });
        } catch (Exception ex){
        }
        return view;
    }
}