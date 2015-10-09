package com.averageloser.supermariomakerlevels.model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by tj on 10/9/2015.
 */
public class ResultsListFragmentAdapter extends ArrayAdapter<String> {
    public ResultsListFragmentAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
