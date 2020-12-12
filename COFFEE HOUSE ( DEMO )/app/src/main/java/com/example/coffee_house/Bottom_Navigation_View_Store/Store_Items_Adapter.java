package com.example.coffee_house.Bottom_Navigation_View_Store;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.coffee_house.R;

public class Store_Items_Adapter extends BaseAdapter
{
    Context CONTEXT_333 ;
    int [] IMAGE_333 ;
    LayoutInflater LAYOUT_INFLATER_333 ;
    String [] TITLE_333 ;
    String [] ADDRESS_333 ;

    public Store_Items_Adapter(Context CONTEXT , int [] IMAGE , String [] TITLE , String [] ADDRESS_333 )
    {
        this.CONTEXT_333 = CONTEXT ;
        this.IMAGE_333 = IMAGE ;
        this.LAYOUT_INFLATER_333 =  ( LayoutInflater ) CONTEXT.getSystemService( Context.LAYOUT_INFLATER_SERVICE ) ;
        this.ADDRESS_333 = ADDRESS_333 ;
        this.TITLE_333 = TITLE ;
    }

    @Override
    public int getCount()
    {
        return IMAGE_333.length ;
    }

    @Override
    public Object getItem( int POSITION )
    {
        return null ;
    }

    @Override
    public long getItemId( int POSITION )
    {
        return 0 ;
    }

    @Override
    public View getView( int POSITION , @Nullable View VIEW , @NonNull ViewGroup VIEW_GROUP )
    {
        View V = VIEW ;
        if( V == null )
        {
            V = LAYOUT_INFLATER_333.inflate( R.layout.store_items, VIEW_GROUP , false ) ;
        }

        ImageView IMAGE_VIEW = V.findViewById( R.id.STORE_ITEMS_IV ) ;
        TextView TEXT_VIEW_ADDRESS = V.findViewById( R.id.STORE_ITEMS_TV_ADDRESS ) ;
        TextView TEXT_VIEW_TITLE = V.findViewById( R.id.STORE_ITEMS_TV_TITLE ) ;

        IMAGE_VIEW.setImageResource( IMAGE_333[ POSITION ]) ;
        TEXT_VIEW_TITLE.setText( TITLE_333[ POSITION ]) ;
        TEXT_VIEW_ADDRESS.setText( ADDRESS_333[ POSITION ]) ;

        return V ;
    }
}
