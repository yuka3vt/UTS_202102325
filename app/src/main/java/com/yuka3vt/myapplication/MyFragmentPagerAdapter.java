package com.yuka3vt.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private WebInternalFragment _webInternalFragment = new WebInternalFragment();
    private Context _context;
    private WebResmiFragment _webResmiFragment = new WebResmiFragment();
    private int _tabCount;


    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);
        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return _webResmiFragment;
            default:
                return _webInternalFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
