package com.averageloser.supermariomakerlevels.util;

import android.content.Context;
import android.support.v4.content.Loader;

import com.averageloser.supermariomakerlevels.model.Level;

/**
 * Created by tj on 10/15/2015.
 */
public class LevelLoader extends Loader<Level> {
    /**
     * Stores away the application context associated with context.
     * Since Loaders can be used across multiple activities it's dangerous to
     * store the context directly; always use {@link #getContext()} to retrieve
     * the Loader's Context, don't use the constructor argument directly.
     * The Context returned by {@link #getContext} is safe to use across
     * Activity instances.
     *
     * @param context used to retrieve the application context.
     */
    public LevelLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();

    }
}
