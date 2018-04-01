package com.example.android.musicalstructureapp;

/**
 * {@link ArtistsElement} represents an element which contains only Artist.
 */

public class ArtistsElement {

    /** Artist name */
    private String mArtistName;

    /**
     * Create a new ArtistElement object.
     *
     * @param artistName is artist's name
     */
    public ArtistsElement(String artistName, String musicElement) {
        mArtistName = artistName;
    }

    /**
     * Get the Artist of the Song
     */
    public String getmArtistName(){
        return mArtistName;
    }

}
