package com.minhtetoo.tedapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.minhtetoo.tedapp.fragments.CategoriesFragment;
import com.minhtetoo.tedapp.fragments.ListenningFragment;
import com.minhtetoo.tedapp.fragments.PlayListFragment;

/**
 * Created by min on 1/24/2018.
 */

public class TedPagerAdapter extends BasePagerAdapter {
    public TedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0: fragment = CategoriesFragment.getCategoriesFragInstance();
                break;
            case 1: fragment = PlayListFragment.getPlayListFragInstance();
                break;
            case 2: fragment = ListenningFragment.getListenningFragInstance();
                break;
            case 3: fragment = PlayListFragment.getPlayListFragInstance();
                break;
            case 4: fragment = PlayListFragment.getPlayListFragInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
