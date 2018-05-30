package com.example.taolen.gym_tour;

/**
 * Created by taoLen on 5/28/2018.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {super(fm);mContext = context;}

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new ChestBenchFragment();
         else if (position == 1) return new LegsDay();
         else if (position == 2) return new ArmsDay();
         else return new ShouldersDay();
    }

    @Override
    public int getCount() {return 4;}

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return mContext.getString(R.string.chest_tab);
         else if (position == 1) return mContext.getString(R.string.legs_tab);
         else if (position == 2) return mContext.getString(R.string.arms_tab);
         else return mContext.getString(R.string.shoulder_tab);
    }
}
