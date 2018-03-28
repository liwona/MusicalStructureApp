package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        MusicsElement element;

        Intent intent = getIntent();
        element = (MusicsElement) intent.getSerializableExtra("element");
        TextView element1 = (TextView) findViewById(R.id.element1);
        TextView element2= (TextView) findViewById(R.id.element2);
        TextView element3= (TextView) findViewById(R.id.element3);
        element1.setText(element.getmSongName());
        element2.setText(element.getmArtistName());
        element3.setText(element.getmAlbumName());

    }
}
