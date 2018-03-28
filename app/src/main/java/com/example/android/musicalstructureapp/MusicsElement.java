package com.example.android.musicalstructureapp;

/**
 * {@link MusicsElement} represents an element which .
 * It contains a default translation and a Miwok translation for that word.
 */
public class MusicsElement {

    /** Artist name */
    private String mArtistName;

    /**  */
    private String mMusicElement;

    /**
     * Create a new Word object.
     *
     * @param artistName
     * @param musicElement
     */
    public MusicsElement(String artistName, String musicElement) {
        mArtistName = artistName;
        mMusicElement = musicElement;
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
    public String getmMusicElement(){
        return mMusicElement;
    }


}
