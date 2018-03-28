package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an list of strings (words)
        ArrayList<MusicsElement> artists = new ArrayList<MusicsElement>();
        artists.add(new MusicsElement("Ed Sheeran", "", ""));
        artists.add(new MusicsElement("Beyoncé", "", ""));
        artists.add(new MusicsElement("Coldplay", "", ""));


        ArtistAdapter adapter= new ArtistAdapter(this, artists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listener();
    }

    public void listener (){
        //Find the view which shows the number category
        ListView elements = (ListView) findViewById(R.id.list);

        // Set a click listener on that View
        elements.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                MusicsElement element = (MusicsElement) arg0.getItemAtPosition(position);
                nowPlayingIntent.putExtra("element", element);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }

}