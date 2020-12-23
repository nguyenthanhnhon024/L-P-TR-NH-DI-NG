package com.duyexample.passiocoffee.Activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.duyexample.passiocoffee.Adapter.OrderFragmentAdapter;
import com.duyexample.passiocoffee.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        TabLayout tabLayout309 = findViewById(R.id.order);
        TabItem ice309 = findViewById(R.id.ice);
        TabItem soda309 = findViewById(R.id.soda);
        TabItem passio309 = findViewById(R.id.passio);
        ViewPager viewPage309 = findViewById(R.id.vp_order);
        androidx.appcompat.widget.Toolbar toolbar309 = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar309);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Chọn món");

        OrderFragmentAdapter orderFragmentAdapter = new OrderFragmentAdapter(getSupportFragmentManager(), tabLayout309.getTabCount());
        viewPage309.setAdapter(orderFragmentAdapter);

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