package com.example.now;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class Saved_Activity_Main extends AppCompatActivity
{
    private ViewPager pager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_activity_main);
        addControl();

        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);
        BottomNavigationView.setSelectedItemId(R.id.item_save);
        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_home:
                        Intent INTENT_01 = new Intent(Saved_Activity_Main.this, MainActivity.class ) ;
                        startActivity( INTENT_01 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_list:
                        return;
                    case R.id.item_save:
                        return;
                    case R.id.item_notice:
                        Intent INTENT_02 = new Intent(Saved_Activity_Main.this, Thongbao.class ) ;
                        startActivity( INTENT_02 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_about:
                        Intent INTENT_05 = new Intent(Saved_Activity_Main.this, Main_Login_Sign_Up.class ) ;
                        startActivity( INTENT_05 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }

    private void addControl() {
        pager = (ViewPager) findViewById(R.id.SAVED_ACTIVITY_MAIN_VIEW_PAGER);
        tabLayout = (TabLayout) findViewById(R.id.SAVED_ACTIVITY_MAIN_TAB_LAYOUT);
//        FragmentManager manager = getSupportFragmentManager();
        Saved_Fragment_Adapter View_Pager_Adapter = new Saved_Fragment_Adapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pager.setAdapter(View_Pager_Adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(View_Pager_Adapter); //deprecated;
    }
}
