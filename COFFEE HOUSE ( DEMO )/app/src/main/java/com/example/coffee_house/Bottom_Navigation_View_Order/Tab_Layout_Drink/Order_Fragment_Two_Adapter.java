package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Drink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffee_house.R;

import java.util.List;

public class Order_Fragment_Two_Adapter extends RecyclerView.Adapter< Order_Fragment_Two_Items_View_Holder >
{
    private Context CONTEXT_333 ;
    private List< Order_Fragment_Two_Items > LIST_OFTI_333 ;

    public Order_Fragment_Two_Adapter(Activity CONTEXT , List<Order_Fragment_Two_Items> LIST_OFTI )
    {
        this.CONTEXT_333 = CONTEXT ;
        this.LIST_OFTI_333 = LIST_OFTI ;
    }

    @Override
    public Order_Fragment_Two_Items_View_Holder onCreateViewHolder( @NonNull ViewGroup VIEW_GROUP , int VIEW_TYPE )
    {
        View VIEW = LayoutInflater.from( VIEW_GROUP.getContext()).inflate( R.layout.order_fragment_two_items , VIEW_GROUP , false ) ;
        return new Order_Fragment_Two_Items_View_Holder( VIEW ) ;
    }

    @Override
    public void onBindViewHolder( @NonNull final Order_Fragment_Two_Items_View_Holder OFTI_VIEW_HOLDER , int POSITION )
    {
        OFTI_VIEW_HOLDER.ORDER_FRAGMENT_TWO_ITEMS_IV_333.setImageResource( LIST_OFTI_333.get( POSITION ).getIMAGE_DRINK()) ;
        OFTI_VIEW_HOLDER.ORDER_FRAGMENT_TWO_ITEMS_TV_TITLE_333.setText( LIST_OFTI_333.get( POSITION ).getNAME_DRINK());
        OFTI_VIEW_HOLDER.ORDER_FRAGMENT_TWO_ITEMS_TV_PRICE_333.setText( LIST_OFTI_333.get( POSITION ).getPRICE_DRINK());
        OFTI_VIEW_HOLDER.ORDER_FRAGMENT_TWO_ITEMS_TV_STAR_333.setText( LIST_OFTI_333.get( POSITION ).getSTAR());

        OFTI_VIEW_HOLDER.ORDER_FRAGMENT_TWO_ITEMS_CV_333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( CONTEXT_333 , Order_Fragment_Two_Items_Details.class);
                intent.putExtra("Image", LIST_OFTI_333.get(OFTI_VIEW_HOLDER.getAdapterPosition()).getIMAGE_DRINK());
                intent.putExtra("Name",LIST_OFTI_333.get(OFTI_VIEW_HOLDER.getAdapterPosition()).getNAME_DRINK());
                intent.putExtra("Price",LIST_OFTI_333.get(OFTI_VIEW_HOLDER.getAdapterPosition()).getPRICE_DRINK());
                intent.putExtra("Star",LIST_OFTI_333.get(OFTI_VIEW_HOLDER.getAdapterPosition()).getSTAR());
                CONTEXT_333.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return LIST_OFTI_333.size() ;
    }
}

class Order_Fragment_Two_Items_View_Holder extends RecyclerView.ViewHolder
{
    CardView ORDER_FRAGMENT_TWO_ITEMS_CV_333 ;
    ImageView ORDER_FRAGMENT_TWO_ITEMS_IV_333 ;
    TextView ORDER_FRAGMENT_TWO_ITEMS_TV_PRICE_333 , ORDER_FRAGMENT_TWO_ITEMS_TV_TITLE_333 , ORDER_FRAGMENT_TWO_ITEMS_TV_STAR_333;

    public Order_Fragment_Two_Items_View_Holder( @NonNull View VIEW )
    {
        super( VIEW ) ;
        ORDER_FRAGMENT_TWO_ITEMS_CV_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_CV ) ;
        ORDER_FRAGMENT_TWO_ITEMS_IV_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_IV ) ;
        ORDER_FRAGMENT_TWO_ITEMS_TV_PRICE_333 =  VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_PRICE ) ;
        ORDER_FRAGMENT_TWO_ITEMS_TV_TITLE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_TITLE ) ;
        ORDER_FRAGMENT_TWO_ITEMS_TV_STAR_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_TWO_ITEMS_TV_STAR ) ;
    }
}