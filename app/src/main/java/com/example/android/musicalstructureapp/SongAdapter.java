package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<MusicsElement> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param music A List of Music Element which we want to display
     */
    public SongAdapter(Activity context, ArrayList<MusicsElement> music) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, music);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link SongAdapter} object located at this position in the list
        MusicsElement currentMusicElement = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView musicElementTextView = (TextView) listItemView.findViewById(R.id.music_element_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        musicElementTextView.setText(currentMusicElement.getmSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artists_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistNameTextView.setText(currentMusicElement.getmArtistName());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
