package com.averageloser.supermariomakerlevels;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.averageloser.supermariomakerlevels.ui.ResultsListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tj on 10/7/2015.
 */
public class ResultsListFragmentPagerAdapter<T> extends FragmentPagerAdapter {
    private List<ResultsListFragment> fragments = new ArrayList();
    private List<String> titles = new ArrayList();

    public ResultsListFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(ResultsListFragment fragment, String title) {
        fragments.add(fragment);
        titles.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public ResultsListFragment getItem(int position) {
        return fragments.get(position);
    }
  }
