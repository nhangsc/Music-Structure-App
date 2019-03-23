package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        // Create a list of songs
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track(getString(R.string.album1), (getString(R.string.song1))));
        tracks.add(new Track(getString(R.string.album1), (getString(R.string.song2))));
        tracks.add(new Track(getString(R.string.album1), (getString(R.string.song3))));
        tracks.add(new Track(getString(R.string.album2), (getString(R.string.song4))));
        tracks.add(new Track(getString(R.string.album2), (getString(R.string.song5))));
        tracks.add(new Track(getString(R.string.album3), (getString(R.string.song6))));
        tracks.add(new Track(getString(R.string.album3), (getString(R.string.song7))));
        tracks.add(new Track(getString(R.string.album2), (getString(R.string.song8))));
        tracks.add(new Track(getString(R.string.album1), (getString(R.string.song9))));
        tracks.add(new Track(getString(R.string.album1), (getString(R.string.song10))));



        // Create an {@link TrackAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        TrackAdapter adapter = new TrackAdapter(this, tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // link from SongsActivity to PlayerActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SongsActivity.this, PlayerActivity.class);

                startActivity(intent);
            }
        });

    }
}
