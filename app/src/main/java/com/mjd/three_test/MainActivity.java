package com.mjd.three_test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private ViewPager viewpager;
    private TextView mian_list,mian_anim;
    private List<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        viewpager = findViewById(R.id.viewpager);
        mian_list = findViewById(R.id.mian_list);
        mian_anim = findViewById(R.id.mian_anim);

        mFragments = new ArrayList<>();
        mFragments.add(new ListFragment());
        mFragments.add(new AnimFragment());
        viewpager.setCurrentItem(0);

        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(), mFragments);
        viewpager.setAdapter(viewpagerAdapter);
    }
}
