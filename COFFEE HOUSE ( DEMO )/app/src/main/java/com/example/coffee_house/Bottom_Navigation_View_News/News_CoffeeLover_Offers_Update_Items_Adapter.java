package com.example.coffee_house.Bottom_Navigation_View_News;

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

public class News_CoffeeLover_Offers_Update_Items_Adapter extends BaseAdapter
{
    Context CONTEXT_333 ;
    int [] IMAGE_333 ;
    LayoutInflater LAYOUT_INFLATER_333 ;
    String [] TITLE_01_333 ;
    String [] TITLE_02_333 ;

    public News_CoffeeLover_Offers_Update_Items_Adapter(Context CONTEXT , int [] IMAGE , String [] TITLE_01 , String [] TITLE_02 )
    {
        this.CONTEXT_333 = CONTEXT ;
        this.IMAGE_333 = IMAGE ;
        this.LAYOUT_INFLATER_333 =  ( LayoutInflater ) CONTEXT.getSystemService( Context.LAYOUT_INFLATER_SERVICE ) ;
        this.TITLE_01_333 = TITLE_01 ;
        this.TITLE_02_333 = TITLE_02 ;
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
            V = LAYOUT_INFLATER_333.inflate( R.layout.news_coffeelover_offers_update_items, VIEW_GROUP , false ) ;
        }

        ImageView IMAGE_VIEW = V.findViewById( R.id.NEWS_OFFERS_ITEMS_IV ) ;
        TextView TEXT_VIEW_01 = V.findViewById( R.id.NEWS_OFFERS_ITEMS_TV_01 ) ;
        TextView TEXT_VIEW_02 = V.findViewById( R.id.NEWS_OFFERS_ITEMS_TV_02 ) ;

        IMAGE_VIEW.setImageResource( IMAGE_333[ POSITION ]) ;
        TEXT_VIEW_01.setText( TITLE_01_333[ POSITION ]) ;
        TEXT_VIEW_02.setText( TITLE_02_333[ POSITION ]) ;

        return V ;
    }


}
