package com.duyexample.passiocoffee.Activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.duyexample.passiocoffee.Adapter.CouponFragmentAdapter;
import com.duyexample.passiocoffee.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MyCouponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_coupon);
        TabLayout tabLayout309 = findViewById(R.id.coupon);
        TabItem nvuse309 = findViewById(R.id.nvuse);
        TabItem used309 = findViewById(R.id.used);
        TabItem dated309 = findViewById(R.id.dated);
        ViewPager viewPage309 = findViewById(R.id.vp_coupon);
        androidx.appcompat.widget.Toolbar toolbar309 = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar309);
        ActionBar actionBar309 = getSupportActionBar();
        actionBar309.setDisplayShowHomeEnabled(true);
        actionBar309.setDisplayUseLogoEnabled(true);
        actionBar309.setDisplayHomeAsUpEnabled(true);
        actionBar309.setTitle("Coupon của tôi");

        CouponFragmentAdapter couponFragmentAdapter = new CouponFragmentAdapter(getSupportFragmentManager(), tabLayout309.getTabCount());
        viewPage309.setAdapter(couponFragmentAdapter);

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