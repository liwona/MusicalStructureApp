package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an list of Artist
        ArrayList<String> artists = getOnlyArtist();

        // Create an {@link ArrayAdapter}, whose data source is a list of {@link MusicElement}. The
        // adapter knows how to create list items for each item in the list.
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link ArtistActivity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MusicElement} in the list.
        listView.setAdapter(adapter);

        // Listeners for component in ArtistActivity
        listener();
    }

    /**
     * Method which gets only Artist's name
     *
     * @return artist Array
     */
    public ArrayList<String> getOnlyArtist(){
        ArrayList<MusicsElement> playlist = Playlist.getPlaylist();
        ArrayList<String> artists = new ArrayList<String>();
        int size = playlist.size();
        for (int i = 0; i < size; i++){
                String artistName = playlist.get(i).getmArtistName();
                if (!artists.contains(artistName)){
                    artists.add(artistName);
            }
        }
        return artists;
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
                // Create a new intent to open the {@link ArtistsActivity}
                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                String element = (String) arg0.getItemAtPosition(position);
                nowPlayingIntent.putExtra("element", element);
                nowPlayingIntent.putExtra("activity", "artist");
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }

}