package com.example.tourguideproject;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Gets appropriate {@link Fragment} for view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BuildingsFragment();
            case 1:
                return new CampusIconFragment();
            case 2:
                return new StadiumFragment();
            case 3:
                return new TraditionsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.cat_buildings);
            case 1:
                return mContext.getString(R.string.cat_campus);
            case 2:
                return mContext.getString(R.string.cat_stadium);
            case 3:
                return mContext.getString(R.string.cat_traditions);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
