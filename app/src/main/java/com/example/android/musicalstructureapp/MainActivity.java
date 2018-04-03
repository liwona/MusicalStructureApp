package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view which shows the number category
        LinearLayout artists = (LinearLayout) findViewById(R.id.artists);
        //Find the view which shows the number category
        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        //Find the view which shows the number category
        LinearLayout tracks = (LinearLayout) findViewById(R.id.tracks);


        // Set a click listener on that View
        artists.setOnClickListener(this);
        // Set a click listener on that View
        albums.setOnClickListener(this);
        // Set a click listener on that View
        tracks.setOnClickListener(this);
    }

    // The code in this method will be executed when the View is clicked on.
    @Override
    public void onClick(View view){
        switch(view.getId()) {
            case R.id.artists:
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
                break;
            case R.id.albums:
                // Create a new intent to open the {@link ArtistsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                // Start the new activity
                startActivity(albumsIntent);
                break;
            case R.id.tracks:
                // Create a new intent to open the {@link ArtistsActivity}
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
                // Start the new activity
                startActivity(tracksIntent);
                break;
        }
    }
}
