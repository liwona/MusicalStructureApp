package com.example.android.musicalstructureapp;

import java.io.Serializable;

/**
 * {@link MusicsElement} represents an element which will contains
 * artist name, song's title and album it comes from.
 */
public class MusicsElement implements Serializable{

    /** Artist name */
    private String mArtistName;

    /** Song name */
    private String mSongName;

    /** Album name */
    private String mAlbumName;


    /**
     * Create a new MusicElement object.
     *
     * @param artistName is artist's name
     * @param songName is song's title
     * @param albumName is album's name
     */
    public MusicsElement(String artistName, String songName, String albumName) {
        mArtistName = artistName;
        mSongName = songName;
        mAlbumName = albumName;
    }

    /**
     * Get the Artist of the Song
     */
    public String getmArtistName(){
        return mArtistName;
    }

    /**
     * Get the Title of the Song
     */
    public String getmSongName(){
        return mSongName;
    }

    /**
     * Get the Album of the Song
     */
    public String getmAlbumName() {
        return mAlbumName;
    }
}
