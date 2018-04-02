package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creating list of all Tracks
        ArrayList<MusicsElement> music = Playlist.getPlaylist();

        // Create an {@link SongAdapter}, whose data source is a list of {@link MusicElement}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link TracksActivity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MusicElement} in the list.
        listView.setAdapter(adapter);

        // Listeners for component in AlbumActivity
        listener();
    }

    /**
     * Listener method : to open new Activity when some ListView element clicked
     */
    public void listener (){
        //Find the view which shows the ListView
        ListView elements = (ListView) findViewById(R.id.list);

        // Set a click listener on that View
        elements.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                // Create a new intent to open the {@link TracksActivity}
                Intent nowPlayingIntent = new Intent(TracksActivity.this, NowPlayingActivity.class);
                MusicsElement element = (MusicsElement) arg0.getItemAtPosition(position);
                nowPlayingIntent.putExtra("element", element.getmSongName());
                nowPlayingIntent.putExtra("musicElement", element);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }

}
