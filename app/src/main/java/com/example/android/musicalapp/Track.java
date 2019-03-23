package com.example.android.musicalapp;

public class Track {


    /**
     * Track name
     */
    private String mTrackName;

    /**
     * Album name
     */
    private String mAlbumName;

    /**
     * Create a new track object.
     *
     * @param trackName is the track name
     * @param albumName   is the album name
     */


    public Track(String trackName, String albumName) {
        mTrackName = trackName;
        mAlbumName = albumName;
    }

    /**
     * Get track name
     */
    public String getmTrackName() {
        return mTrackName;
    }

    /**
     * Get album name
     */
    public String getmAlbumName() {
        return mAlbumName;
    }


}
