package com.example.now;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.now.Adapter.BoSuuTap_Adapter;
import com.example.now.Adapter.Menu_Adapter;
import com.example.now.DTO.Menu;
import com.example.now.TruyVan.BoSuuTap_TV;
import com.example.now.TruyVan.Menu_TV;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView TV_LOCATION , TV_Xem_Them, LOCATION;
    private ViewPager VP_IMAGE;
    GridView gv,gv2;
    ArrayList<Menu> arrayList,arrayList2;
    Menu_Adapter adapter;
    Menu_TV menuTV;

    BoSuuTap_Adapter adapter2;
    BoSuuTap_TV bosuutapTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

        //Đổ dữ liệu ra menu
        menuTV = new Menu_TV(MainActivity.this);
        arrayList = menuTV.getAll();
        gv = findViewById(R.id.GV_01);
        adapter = new Menu_Adapter(MainActivity.this, arrayList);
        gv.setAdapter(adapter);

        //Đổ dữ liệu ra bộ sưu tập
        bosuutapTV = new BoSuuTap_TV(MainActivity.this);
        arrayList2 = bosuutapTV.getAll();
        gv2 = findViewById(R.id.GV_02);
        adapter2 = new BoSuuTap_Adapter(MainActivity.this, arrayList2);
        gv2.setAdapter(adapter2);


        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);

        BottomNavigationView.setSelectedItemId(R.id.item_home);

        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_home:
                        return;
                    case R.id.item_list:
                        return;
                    case R.id.item_save:
                        Intent INTENT_01 = new Intent(MainActivity.this, Saved_Activity_Main.class ) ;
                        startActivity( INTENT_01 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_notice:
                        Intent INTENT_02 = new Intent(MainActivity.this, Thongbao.class ) ;
                        startActivity( INTENT_02   ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_about:
                        Intent INTENT_05 = new Intent(MainActivity.this, Main_Login_Sign_Up.class ) ;
                        startActivity( INTENT_05 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }

    private void initListener()
    {
        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VIEW) {
                Intent INTENT_02 = new Intent(MainActivity.this, Activity_Location.class);
                startActivity(INTENT_02);
            }
        });

        TV_LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VIEW) {
                Intent INTENT_01 = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(INTENT_01);
            }
        });

        TV_Xem_Them.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View VIEW )
            {
                Intent INTENT_03 = new Intent(MainActivity.this, Main_Collection.class ) ;
                startActivity( INTENT_03 ) ;
            }
        }) ;

        VP_Adapter_Now_Slides viewPagerAdapter = new VP_Adapter_Now_Slides(this);
        VP_IMAGE.setAdapter(viewPagerAdapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),1000,2000);

    }

    private void initView() {
        LOCATION = findViewById(R.id.LOCATION);
        TV_LOCATION = findViewById(R.id.TV_LOCATION);
        TV_Xem_Them = findViewById(R.id.TV_Xem_Them);
        VP_IMAGE = findViewById(R.id.VP_IMAGE);
    }


    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(VP_IMAGE.getCurrentItem() == 0){
                        VP_IMAGE.setCurrentItem(1);
                    }else if(VP_IMAGE.getCurrentItem()==1){
                        VP_IMAGE.setCurrentItem(2);
                    }else if(VP_IMAGE.getCurrentItem()==2){
                        VP_IMAGE.setCurrentItem(3);
                    }else if(VP_IMAGE.getCurrentItem()==3){
                        VP_IMAGE.setCurrentItem(4);
                    }else if(VP_IMAGE.getCurrentItem()==4){
                        VP_IMAGE.setCurrentItem(5);
                    }else if(VP_IMAGE.getCurrentItem()==5){
                        VP_IMAGE.setCurrentItem(6);
                    }else{
                        VP_IMAGE.setCurrentItem(0);
                    }
                }
            });

        }
    }
}
