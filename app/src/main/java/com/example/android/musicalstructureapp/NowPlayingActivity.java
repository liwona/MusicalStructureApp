package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        String element;

        Intent intent = getIntent();
        element = (String) intent.getSerializableExtra("element");
        String activity = (String) intent.getSerializableExtra("activity");

        ArrayList<MusicsElement> elements = getSongByArtist(element);

        SongAdapter adapter = new SongAdapter(this, elements);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

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
}
