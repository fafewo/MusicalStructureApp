package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jannis on 13.04.2018.
 */

public class AndroidActivity extends AppCompatActivity {
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




    }
}

