package com.example.johnmachahuay.reportit.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.johnmachahuay.reportit.Fragments.TabFragment1;
import com.example.johnmachahuay.reportit.Fragments.TabFragment2;
import com.example.johnmachahuay.reportit.R;
import com.example.johnmachahuay.reportit.activity.HomeActivity;


public class TabsAdapter extends FragmentPagerAdapter {
    private Context context;

    public TabsAdapter(HomeActivity mainActivity, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
        this.context = mainActivity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.all_posts);
            case 1:
                return context.getString(R.string.my_posts);
        }
        return null;
    }
}
