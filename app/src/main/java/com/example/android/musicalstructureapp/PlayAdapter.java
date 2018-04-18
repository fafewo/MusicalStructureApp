package com.example.android.musicalstructureapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Jannis on 18.04.2018.
 */

public abstract class PlayAdapter extends BaseAdapter {

    public View getView(int position, View convertView, ViewGroup parent) {

        View play = findViewById(R.id.list);
        return play;
    }

    protected abstract View findViewById(int list);
}
