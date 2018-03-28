package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<MusicsElement> music = new ArrayList<MusicsElement>();
        music.add(new MusicsElement("Ed Sheeran", "+"));
        music.add(new MusicsElement("Ed Sheeran", "X"));
        music.add(new MusicsElement("Ed Sheeran", "÷"));
        music.add(new MusicsElement("Beyoncé", "Dangerously in Love"));
        music.add(new MusicsElement("Beyoncé", "B'Day"));
        music.add(new MusicsElement("Beyoncé", "I Am... Sasha Fierce"));
        music.add(new MusicsElement("Beyoncé", "4"));
        music.add(new MusicsElement("Beyoncé", "Beyoncé"));
        music.add(new MusicsElement("Beyoncé", "Lemonade"));
        music.add(new MusicsElement("Coldplay", "Parachutes"));
        music.add(new MusicsElement("Coldplay", "A Rush of Blood to the Head"));
        music.add(new MusicsElement("Coldplay", "X&Y"));
        music.add(new MusicsElement("Coldplay", "Viva la Vida or Death and All His Friends"));
        music.add(new MusicsElement("Coldplay", "Mylo Xyloto"));
        music.add(new MusicsElement("Coldplay", "Ghost Stories"));
        music.add(new MusicsElement("Coldplay", "A Head Full of Dreams"));

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
    }
}
