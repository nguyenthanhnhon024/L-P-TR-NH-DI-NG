package com.duyexample.passiocoffee.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.duyexample.passiocoffee.Fragment.OrderAFragment;
import com.duyexample.passiocoffee.Fragment.OrderBFragment;
import com.duyexample.passiocoffee.Fragment.OrderCFragment;

public class OrderFragmentAdapter extends FragmentPagerAdapter {
    private int numOfRank309;
    public OrderFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public OrderFragmentAdapter(@NonNull FragmentManager fm, int numOfRank309) {
        super(fm);
        this.numOfRank309 = numOfRank309;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OrderAFragment();
            case 1:
                return new OrderBFragment();
            case 2:
                return new OrderCFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfRank309;
    }
}
