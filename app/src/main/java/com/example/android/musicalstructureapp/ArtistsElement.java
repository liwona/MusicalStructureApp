package com.example.android.musicalstructureapp;

/**
 * {@link ArtistsElement} represents an element which .
 * It contains a default translation and a Miwok translation for that word.
 */

public class ArtistsElement {

    /** Artist name */
    private String mArtistName;

    /**
     * Create a new Word object.
     *
     * @param artistName
     * @param musicElement
     */
    public ArtistsElement(String artistName, String musicElement) {
        mArtistName = artistName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmArtistName(){
        return mArtistName;
    }

}
