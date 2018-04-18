package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the lifestyle category
        TextView lifestyle = findViewById(R.id.lifestyle);

        // Set a click listener on that View
        lifestyle.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the lifestyle category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LifestyleActivity}
                Intent lifestyleIntent = new Intent(MainActivity.this, LifestyleActivity.class);
                
                // Start the new activity
                startActivity(lifestyleIntent);
            }
        });

        // Find the View that shows the motivation category
        TextView motivation = findViewById(R.id.motivation);

        // Set a click listener on that View
        motivation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MotivationActivity}
                Intent motivationIntent = new Intent(MainActivity.this, MotivationActivity.class);

                // Start the new activity
                startActivity(motivationIntent);
            }
        });

        // Find the View that shows the colors category
        TextView android = findViewById(R.id.android);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AndroidActivity}
                Intent androidIntent = new Intent(MainActivity.this, AndroidActivity.class);

                // Start the new activity
                startActivity(androidIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView sport = findViewById(R.id.sport);

        // Set a click listener on that View
        sport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SportActivity}
                Intent sportIntent = new Intent(MainActivity.this, SportActivity.class);

                // Start the new activity
                startActivity(sportIntent);
            }
        });

    }
}
