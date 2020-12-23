package com.duyexample.passiocoffee.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.duyexample.passiocoffee.Adapter.RankFragmentAdapter;
import com.duyexample.passiocoffee.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MemberCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_card);

        TabLayout tabLayout309 = findViewById(R.id.rank);
        TabItem silver309 = findViewById(R.id.silver);
        TabItem gold309 = findViewById(R.id.gold);
        TabItem platinum309 = findViewById(R.id.plat);
        ViewPager viewPage309 = findViewById(R.id.vp_rank);
        androidx.appcompat.widget.Toolbar toolbar309 = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar309);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thẻ thành viên");

        RankFragmentAdapter rankFragmentAdapter = new RankFragmentAdapter(getSupportFragmentManager(), tabLayout309.getTabCount());
        viewPage309.setAdapter(rankFragmentAdapter);

        tabLayout309.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPage309.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // nút back
                onBackPressed();
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}