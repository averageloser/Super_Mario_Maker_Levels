package com.averageloser.supermariomakerlevels.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.averageloser.supermariomakerlevels.R;
import com.averageloser.supermariomakerlevels.model.Level;
import com.averageloser.supermariomakerlevels.model.ResultsListFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tj on 10/7/2015.
 */
public class ResultsListFragment extends android.support.v4.app.ListFragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setListAdapter(new ResultsListFragmentAdapter(getContext(), R.layout.results_list_row, new ArrayList<Level>()));

        List<Level> levels = new ArrayList();
        for (int i = 0; i < 20; i++) {
            levels.add(new Level("The Big Bounce", "eeee eeee eeee eeee"));
        }

        setLevels(levels);
    }

    private void setLevels(List<Level> levels) {
        ((ResultsListFragmentAdapter) getListAdapter()).clear();
        ((ResultsListFragmentAdapter) getListAdapter()).addAll(levels);
        ((ResultsListFragmentAdapter) getListAdapter()).notifyDataSetChanged();

    }
}
