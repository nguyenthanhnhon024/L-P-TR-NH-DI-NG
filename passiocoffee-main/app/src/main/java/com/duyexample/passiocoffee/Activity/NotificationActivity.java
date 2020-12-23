package com.duyexample.passiocoffee.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.duyexample.passiocoffee.Fragment.*;
import com.duyexample.passiocoffee.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {
    ImageView back309;

    private ViewPager viewPager309;
    private TabLayout tabLayout309;

    private FragmentGreenXmas greenXmas309;
    private FragmentIceBlended iceBlended309;
    private FragmentTeaSoda teaSoda309;
    private FragmentPassioCaffee passioCaffee309;
    private FragmentFreshEasy freshEasy309;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buy);

        back309 = findViewById(R.id.back);
        back309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        tabLayout309 = findViewById(R.id.tabLayout);
        viewPager309 = findViewById(R.id.viewPager);

        greenXmas309 = new FragmentGreenXmas();
        iceBlended309 = new FragmentIceBlended();
        teaSoda309 = new FragmentTeaSoda();
        passioCaffee309 = new FragmentPassioCaffee();
        freshEasy309 = new FragmentFreshEasy();

        tabLayout309.setupWithViewPager(viewPager309);

        ViewPagerAdapter viewPagerAdapter309 = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter309.addFragment(greenXmas309, "Green xmas");
        viewPagerAdapter309.addFragment(iceBlended309, "Ice blended");
        viewPagerAdapter309.addFragment(teaSoda309, "Tea/soda");
        viewPagerAdapter309.addFragment(passioCaffee309, "Passio coffee");
        viewPagerAdapter309.addFragment(freshEasy309, "Fresh & easy");
        viewPager309.setAdapter(viewPagerAdapter309);
    }
    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments309 = new ArrayList<>();
        private List<String> fragmentTitle309 = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments309.add(fragment);
            fragmentTitle309.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments309.get(position);
        }

        @Override
        public int getCount() {
            return fragments309.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle309.get(position);
        }
    }
}
