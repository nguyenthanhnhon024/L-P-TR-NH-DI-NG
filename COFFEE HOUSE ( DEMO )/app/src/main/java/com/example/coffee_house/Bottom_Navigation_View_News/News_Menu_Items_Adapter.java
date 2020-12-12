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

public class News_Menu_Items_Adapter extends BaseAdapter
{
    Context CONTEXT_333 ;
    int [] IMAGE_333 ;
    LayoutInflater LAYOUT_INFLATER_333 ;
    String [] TITLE_333 ;

    public News_Menu_Items_Adapter( Context CONTEXT , int [] IMAGE , String [] TITLE )
    {
        this.CONTEXT_333 = CONTEXT ;
        this.IMAGE_333 = IMAGE ;
        this.LAYOUT_INFLATER_333 =  ( LayoutInflater ) CONTEXT.getSystemService( Context.LAYOUT_INFLATER_SERVICE ) ;
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
            V = LAYOUT_INFLATER_333.inflate( R.layout.news_menu_items, VIEW_GROUP , false ) ;
        }

        ImageView IMAGE_VIEW = V.findViewById( R.id.NEWS_MENU_ITEMS_IV ) ;
        TextView TEXT_VIEW = V.findViewById( R.id.NEWS_MENU_ITEMS_TV ) ;

        IMAGE_VIEW.setImageResource( IMAGE_333[ POSITION ]) ;
        TEXT_VIEW.setText( TITLE_333[ POSITION ]) ;

        return V ;
    }
}
