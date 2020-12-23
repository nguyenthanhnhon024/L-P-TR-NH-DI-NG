package com.example.now;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Saved_Fragment_Adapter extends FragmentStatePagerAdapter {

    public Saved_Fragment_Adapter(@NonNull FragmentManager fragmentManager, int behavior) {
        super(fragmentManager, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new Saved_Fragment_01();
                break;
            case 1:
                frag = new Saved_Fragment_02();
                break;
            default:
                frag = new Saved_Fragment_01();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Mới Lưu";
                break;
            case 1:
                title = "Gần Tôi";
                break;
        }
        return title;
    }
}
