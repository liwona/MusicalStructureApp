package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Button 'Back' on the Action Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Creating list of Albums Only
        ArrayList<MusicsElement> music = getOnlyAlbum();

        // Create an {@link AlbumAdapter}, whose data source is a list of {@link MusicElement}. The
        // adapter knows how to create list items for each item in the list.
        AlbumAdapter adapter = new AlbumAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link AlbumActivity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AlbumAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MusicElement} in the list.
        listView.setAdapter(adapter);

        // Listeners for component in AlbumActivity
        listener();
    }

    /**
     * Method which gets only Album's name
     *
     * @return albums Array
     */
    public ArrayList<MusicsElement> getOnlyAlbum(){
        ArrayList<MusicsElement> playlist = Playlist.getPlaylist();
        ArrayList<MusicsElement> albums = new ArrayList<MusicsElement>();
        int size = playlist.size();
        for (int i = 0; i < size; i++){
            MusicsElement musicsElement = playlist.get(i);
            if (!checkAlbumExist(musicsElement, albums)) {
                albums.add(musicsElement);
            }
        }
        return albums;
    }

    /**
     * Method which checking if Album of the MusicElement is already on the ArrayList Album
     */
    private boolean checkAlbumExist(MusicsElement musicsElement, ArrayList<MusicsElement> albums){
        for(int j = 0; j < albums.size(); j++) {
            if(albums.get(j).getmAlbumName().equals(musicsElement.getmAlbumName())) {
                return true;
            }
        }
        return false;
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
                // Create a new intent to open the {@link AlbumActivity}
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                MusicsElement element = (MusicsElement) arg0.getItemAtPosition(position);
                nowPlayingIntent.putExtra("element", element.getmAlbumName());
                nowPlayingIntent.putExtra("activity", "albums");
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
