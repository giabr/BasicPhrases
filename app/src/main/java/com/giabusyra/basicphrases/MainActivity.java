package com.giabusyra.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTap(View view){

        int id = view.getId();
        String ourId = "";

        //Get Id name
        ourId = view.getResources().getResourceEntryName(id);

        //Resource for audio
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.giabusyra.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        Log.i("Button Tapped",ourId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
