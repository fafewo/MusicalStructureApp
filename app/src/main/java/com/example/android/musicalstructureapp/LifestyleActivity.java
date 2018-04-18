package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.musicalstructureapp.R.id.list;
import static com.example.android.musicalstructureapp.R.id.media_actions;

/**
 * Created by Jannis on 13.04.2018.
 */

public class LifestyleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_list);
        //List for Podcast episodes
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();


        podcasts.add(new Podcast( "Play"  ,"episode A"));
        podcasts.add(new Podcast( "Play" ,"episode b"));
        podcasts.add(new Podcast( "Play" ,"episode c"));
        podcasts.add(new Podcast( "Play" ,"episode d"));
        podcasts.add(new Podcast( "Play" ,"episode e"));
        podcasts.add(new Podcast( "Play" ,"episode f"));

        PodcastAdapter adapter = new PodcastAdapter(this,podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

            // Set the content of the activity to use the podcast_list.xml layout file
            setContentView(R.layout.podcast_list);
            findViewById(media_actions);

        // Find the View that shows the play category
            LinearLayout play = findViewById(R.id.play);

            // Set a click listener on that View
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent PlayView = new Intent(LifestyleActivity
                        .this, PlayActivity.class);

                // Start the new activity
                startActivity(PlayView);
            }
        });


/*
                // The code in this method will be executed when the lifestyle category is clicked on.
                @Override
                public void onItemClick(AdapterView<>a, View v, int, long l) {
                    // Create a new intent to open the {@link playActivity}
                    Intent playIntent = new Intent(LifestyleActivity
                            .this, PlayActivity.class);

                    // Start the new activity
                    startActivity(playIntent);
                }
            });**/


    }
}
