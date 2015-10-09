package com.averageloser.supermariomakerlevels;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.averageloser.supermariomakerlevels.ui.ResultsListFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FloatingActionButton fab;
    private Snackbar fabSnackbar;
    private ResultsListFragment allList, popularList, newList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.question_mark32);
        setSupportActionBar(toolbar);


        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(fabUploadListener);

        //instantiate the fragments.
        allList = new ResultsListFragment();

        popularList = new ResultsListFragment();

        newList = new ResultsListFragment();

        ResultsListFragmentPagerAdapter pagerAdapter = new ResultsListFragmentPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(allList, "All");
        pagerAdapter.addFragment(popularList, "Popular");
        pagerAdapter.addFragment(newList, "New");

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Handles the floating action button clicks.
    private View.OnClickListener fabUploadListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String levelAdded = getResources().getString(R.string.level_added);

            SpannableStringBuilder builder = new SpannableStringBuilder();
            builder.append(" ");
            builder.setSpan(new ImageSpan(MainActivity.this, R.drawable.cloudguy32x38), builder.length() - 1, builder.length(), 0);
            builder.append("    " + levelAdded);

            Snackbar notification = Snackbar.make(fab, builder, Snackbar.LENGTH_LONG);
            notification.getView().setBackgroundColor(Color.parseColor("#7E9BE7"));

            TextView textView = (TextView) notification.getView()
                    .findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextSize(20);
            textView.setTypeface(null, Typeface.BOLD);

            notification.show();
        }
    };


}
