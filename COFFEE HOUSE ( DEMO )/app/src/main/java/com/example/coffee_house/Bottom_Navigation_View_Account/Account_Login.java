package com.example.coffee_house.Bottom_Navigation_View_Account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coffee_house.Bottom_Navigation_View_News.News_Activity_Main;
import com.example.coffee_house.R;

public class Account_Login extends AppCompatActivity
{
    TextView TV_SKIP_333 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState ) ;
        setContentView( R.layout.account_login );

        TV_SKIP_333 = (TextView) findViewById( R.id.tv_back );

        TV_SKIP_333.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent INTENT = new Intent(Account_Login.this, News_Activity_Main.class);
                startActivity( INTENT ) ;
            }
        });
    }

}
