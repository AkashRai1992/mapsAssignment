package com.example.akash.mapsassignment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.akash.mapsassignment.fragements.DemoFragement;
import com.example.akash.mapsassignment.fragements.MapSearchFragement;

/**
 * Created by akash on 20/9/16.
 */
public class MapsAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public MapsAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MapSearchFragement tab1 = new MapSearchFragement();
                return tab1;
            case 1:
                DemoFragement tab2 = new DemoFragement();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}