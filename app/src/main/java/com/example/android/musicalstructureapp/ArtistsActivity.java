package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an list of strings (words)
        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Ed Sheeran");
        artists.add("Beyoncé");
        artists.add("Coldplay");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listener();
    }

    public void listener (){
        //Find the view which shows the number category
        LinearLayout elements = (LinearLayout) findViewById(R.id.elements_linear_layout);

        // Set a click listener on that View
        elements.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }

}