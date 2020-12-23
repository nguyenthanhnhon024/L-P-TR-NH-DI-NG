package com.duyexample.passiocoffee.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.duyexample.passiocoffee.Fragment.GoldFragment;
import com.duyexample.passiocoffee.Fragment.PlatinumFragment;
import com.duyexample.passiocoffee.Fragment.SilverFragment;

public class RankFragmentAdapter extends FragmentPagerAdapter {
    private int numOfRank309;
    public RankFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public RankFragmentAdapter(@NonNull FragmentManager fm, int numOfRank309) {
        super(fm);
        this.numOfRank309 = numOfRank309;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SilverFragment();
            case 1:
                return new GoldFragment();
            case 2:
                return new PlatinumFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfRank309;
    }
}
