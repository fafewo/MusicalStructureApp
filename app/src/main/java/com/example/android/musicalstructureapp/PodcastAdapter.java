package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jannis on 13.04.2018.
 */

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    public PodcastAdapter(Activity context, ArrayList<Podcast> androidFlavors){
        super(context,0, androidFlavors);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Podcast currentPodcast = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView podcastTextView = listItemView.findViewById(R.id.podcast_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        podcastTextView.setText(currentPodcast.getPodcastName());



        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView PlayButton = listItemView.findViewById(R.id.media_actions);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
       PlayButton.setText(currentPodcast.getPlayButton());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
