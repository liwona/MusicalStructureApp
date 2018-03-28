package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<MusicsElement> music = Playlist.getPlaylist();
//        ArrayList<MusicsElement> music = new ArrayList<MusicsElement>();
//        music.add(new MusicsElement("Ed Sheeran", "I See Fire", ""));
//        music.add(new MusicsElement("Ed Sheeran", "Thinking Out Loud", ""));
//        music.add(new MusicsElement("Ed Sheeran", "Perfect", ""));
//        music.add(new MusicsElement("Beyoncé & Jay-Z", "Crazy in Love", ""));
//        music.add(new MusicsElement("Beyoncé & Shakira", "Beautiful Liar", ""));
//        music.add(new MusicsElement("Beyoncé", "If I Were a Boy", ""));
//        music.add(new MusicsElement("Beyoncé", "Single Ladies (Put a Ring on It)", ""));
//        music.add(new MusicsElement("Beyoncé", "Run the World (Girls)", ""));
//        music.add(new MusicsElement("Beyoncé", "Best Thing I Never Had", ""));
//        music.add(new MusicsElement("Coldplay", "Yellow", ""));
//        music.add(new MusicsElement("Coldplay", "Fix You", ""));
//        music.add(new MusicsElement("Coldplay", "Viva la Vida", ""));
//        music.add(new MusicsElement("Coldplay", "Every Teardrop Is a Waterfall", ""));
//        music.add(new MusicsElement("Coldplay", "A Sky Full of Stars", ""));
//        music.add(new MusicsElement("Coldplay", "Adventure of a Lifetime", ""));
//        music.add(new MusicsElement("Coldplay", "Hymn for the Weekend", ""));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        //tworzymy nasz własny Adapter -> WordAdapter, aby być w stanie wyświelić nasz list_item.xml
        SongAdapter adapter = new SongAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
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
