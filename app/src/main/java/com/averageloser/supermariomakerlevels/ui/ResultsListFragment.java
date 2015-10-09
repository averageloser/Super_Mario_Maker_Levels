package com.averageloser.supermariomakerlevels.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.averageloser.supermariomakerlevels.R;
import com.balysv.materialripple.MaterialRippleLayout;

/**
 * Created by tj on 10/7/2015.
 */
public class ResultsListFragment extends android.support.v4.app.ListFragment {
    private ListView allListView;

    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        ListView listView = (ListView) view.findViewById(R.id.all_list_view);

        String[] levels = new String[]{"level 1", "level 2", "level 3", "level 4", "level 5",
                "level 1", "level 2", "level 3", "level 4", "level 5",
                "level 1", "level 2", "level 3", "level 4", "level 5"};

        listView.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.list_all_row,
                R.id.list_all_text_view, levels));

        return view;
    }
    */

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] levels = new String[]{"level 1", "level 2", "level 3", "level 4", "level 5",
                "level 1", "level 2", "level 3", "level 4", "level 5",
                "level 1", "level 2", "level 3", "level 4", "level 5"};

        setListAdapter(new ArrayAdapter<String>(getContext(), R.layout.list_all_row,
                R.id.list_all_text_view, levels));
    }
}
