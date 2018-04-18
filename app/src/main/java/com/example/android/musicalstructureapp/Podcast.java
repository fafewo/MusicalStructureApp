package com.example.android.musicalstructureapp;

import android.widget.Button;

/**
 * Created by Jannis on 13.04.2018.
 */

public class Podcast {

    // Playbutton
    private String mPlayButton;
    // Podcast Name
    private String mPodcastName;

/**
 * Create a new Podcast object.
 *  @param PlayButton is the PLaybutton for playing the Podcast
 *
 * @param PodcastName is the Podcast name
 */
 public Podcast(String PlayButton, String PodcastName){
     mPlayButton = PlayButton;
     mPodcastName = PodcastName;

 }
    /**
     * Get the PLay button.*/
    public String getPlayButton() {

        return mPlayButton;
    }

    /**
     * Get the name of the Podcast.
     */
    public String getPodcastName() {
        return mPodcastName;
    }

}
