package com.example.android.musicalstructureapp;

import java.io.Serializable;

/**
 * {@link MusicsElement} represents an element which .
 * It contains a default translation and a Miwok translation for that word.
 */
public class MusicsElement implements Serializable{

    /** Artist name */
    private String mArtistName;

    /**  */
    private String mSongName;

    private String mAlbumName;

    /**
     * Create a new Word object.
     *
     * @param artistName
     * @param songName
     * @param albumName
     */
    public MusicsElement(String artistName, String songName, String albumName) {
        mArtistName = artistName;
        mSongName = songName;
        mAlbumName = albumName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmArtistName(){
        return mArtistName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getmSongName(){
        return mSongName;
    }


    public String getmAlbumName(){
        return mAlbumName;
    }

}
