package com.example.akash.mapsassignment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.akash.mapsassignment.adapter.MapsAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mHomePageFeedPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        final MapsAdapter adapter = new MapsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        mHomePageFeedPager.setAdapter(adapter);
        mHomePageFeedPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void init() {
        mHomePageFeedPager = (ViewPager) findViewById(R.id.pager);
        mHomePageFeedPager.setOffscreenPageLimit(2);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("state"));
        tabLayout.addTab(tabLayout.newTab().setText("map"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
