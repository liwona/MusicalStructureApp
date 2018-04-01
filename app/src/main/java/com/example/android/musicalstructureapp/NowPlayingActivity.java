package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // In `OnCreate();`

        String element;

        Intent intent = getIntent();
        element = (String) intent.getSerializableExtra("element");
        String activity = (String) intent.getSerializableExtra("activity");

        ArrayList<MusicsElement> elements;
        MusicsElement musicsElement;
        if ("artist".equals(activity)){
            elements = getSongByArtist(element);
            musicsElement = elements.get(0);
        } else if ("albums".equals(activity)){
            elements = getSongByAlbum(element);
            musicsElement = elements.get(0);
        } else{
            musicsElement = (MusicsElement) intent.getSerializableExtra("musicElement");
            elements = Playlist.getPlaylist();
        }

        SongAdapter adapter = new SongAdapter(this, elements);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        displayCurrentSong(musicsElement);
        listener();
        listener_previous();
        listener_next();
    }

    public ArrayList<MusicsElement> getSongByArtist(String artist){
        ArrayList<MusicsElement> playlist = Playlist.getPlaylist();
        ArrayList<MusicsElement> songsByArtist= new ArrayList<MusicsElement>();
        int size = playlist.size();
        for (int i = 0; i < size; i++){
            MusicsElement song = playlist.get(i);
            if (song.getmArtistName().equals(artist)){
                songsByArtist.add(song);
            }
        }
        return songsByArtist;
    }

    public ArrayList<MusicsElement> getSongByAlbum(String album){
        ArrayList<MusicsElement> playlist = Playlist.getPlaylist();
        ArrayList<MusicsElement> songsByAlbum= new ArrayList<MusicsElement>();
        int size = playlist.size();
        for (int i = 0; i < size; i++){
            MusicsElement song = playlist.get(i);
            if (song.getmAlbumName().equals(album)){
                songsByAlbum.add(song);
            }
        }
        return songsByAlbum;
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
                MusicsElement element = (MusicsElement) arg0.getItemAtPosition(position);
                displayCurrentSong(element);

            }
        });
    }

    public void displayCurrentSong(MusicsElement musicsElement){
        TextView currentSong = (TextView) findViewById(R.id.element1);
        currentSong.setText(musicsElement.getmSongName()+ " - " + musicsElement.getmArtistName());
    }

    public void listener_previous(){

    }
    
    public void listener_next(){

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

