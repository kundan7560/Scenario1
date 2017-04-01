package com.kundan.demoform.demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kundan.demoform.demo.Fragment.FragmentFour;
import com.kundan.demoform.demo.Fragment.FragmentOne;
import com.kundan.demoform.demo.Fragment.FragmentThree;
import com.kundan.demoform.demo.Fragment.FragmentTwo;

public class TestFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
    protected static final String[] CONTENT = new String[]{"This", "Is", "A", "Test",};

    private int mCount = CONTENT.length;

    public TestFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pos) {

        switch (pos) {

            case 0:
                return FragmentOne.newInstance("DaysheetTab1Fragment, Instance 1", pos);

            case 1:
                return FragmentTwo.newInstance("DaysheetTab2Fragment, Instance 2", pos);
            case 2:
                return FragmentThree.newInstance("DaysheetTab1Fragment, Instance 3", pos);

            case 3:
                return FragmentFour.newInstance("DaysheetTab2Fragment, Instance 4", pos);


        }
        return null;

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TestFragmentAdapter.CONTENT[position % CONTENT.length];
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }
}