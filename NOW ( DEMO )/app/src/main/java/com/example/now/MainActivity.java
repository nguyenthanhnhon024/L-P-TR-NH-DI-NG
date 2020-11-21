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

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    GridView GV_01, GV_02;
    TextView TV_LOCATION , TV_Xem_Them, LOCATION;
    private ViewPager VP_IMAGE;

    String mTitle[] = {"Trà Sữa", "Cơm", "Ăn Vặt", "Đặt Bàn", "Đối Tác", "Hoa", "Thuốc", "Bia", "Giúp Việc",
            "Freeship Xtra", "NowShip - Giao Hàng", "Ưu Đãi AirPay", "Quán Mới", "NowFresh - Thực Phẩm",
            "Siêu Thị - FREESHIP", "Thú Cưng", "Giặt Ủi", "Làm Đẹp"};
    int images[] = {R.drawable.icon_milk_tea, R.drawable.icon_rice, R.drawable.icon_snacks, R.drawable.icon_book, R.drawable.icon_partner, R.drawable.icon_flower, R.drawable.icon_medicine, R.drawable.icon_beer, R.drawable.icon_helper,
            R.drawable.icon_extra, R.drawable.icon_delivery, R.drawable.icon_airpay, R.drawable.icon_store, R.drawable.icon_food, R.drawable.icon_supermarket, R.drawable.icon_dog_foot, R.drawable.icon_laundry, R.drawable.icon_cosmetic};

    String Title2[] = {"6 giờ vàng ăn sáng", "Siêu deal thứ 3 chỉ 10k", "Đồ uống chỉ 11k", "Ăn chỉ 21k", "Compo mua 1 tặng 1",
            "Siêu combo 210k", "Hè không nghỉ", "Món ăn nhanh", "Đặc sản Đà Nẵng", "Freeship Xtra + Giảm 50%"};
    int images2[] = {R.drawable.now_sale_20k, R.drawable.now_sale_10k, R.drawable.now_drink_11k, R.drawable.now_sale_21k, R.drawable.now_combo,
            R.drawable.now_super_combo_210k, R.drawable.now_summer, R.drawable.now_fast_foods, R.drawable.now_specialties_da_nang, R.drawable.now_freeship_xtra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

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
                        return;
                    case R.id.item_notice:
                        return;
                    case R.id.item_about:
                        Intent INTENT_01 = new Intent(MainActivity.this, Main_Login_Sign_Up.class ) ;
                        startActivity( INTENT_01 ) ;
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
                Intent INTENT_01 = new Intent(MainActivity.this, Map.class);
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

        List_Menu_Adapter adapter = new List_Menu_Adapter(this, mTitle, images);
        GV_01.setAdapter(adapter);

        GV_01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String selectedName = mTitle[i];
                int selectedImage = images[i];
                startActivity(new Intent(MainActivity.this, Activity_Milk_Tea.class).putExtra("name",selectedName).putExtra("image",selectedImage));
            }
        });

        List_Collection_Adapter adapter2 = new List_Collection_Adapter(this, Title2, images2);
        GV_02.setAdapter(adapter2);
    }

    private void initView() {
        GV_01 = findViewById(R.id.GV_01);
        GV_02 = findViewById(R.id.GV_02);
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
