package com.example.android.learnspanishquizapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class learnSpanish extends AppCompatActivity {

    /**
     * This method plays an audio clip of the spanish word Hola in response to a button click.
     **/
    public void playhi(View view){

        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.hola);

        mPlayer.start();
    }

    /**
     * This method plays an audio clip of the spanish word Adios in response to a button click.
     **/

    public void playbye(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.adios);

        Player.start();
    }

    /**
     * This method plays an audio clip of the spanish phrase Good morning in response to a button click.
     **/

    public void playMorning(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.morning);

        Player.start();
    }

    /**
     * This method plays an audio clip of the spanish phrase good night in response to a button click.
     **/

    public void playNight(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.night);

        Player.start();
    }

    /**
     * This method plays an audio clip of the spanish phrase my name is in response to a button click.
     **/

    public void playName(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.name);

        Player.start();
    }

    /**
     * This method plays an audio clip of the spanish phrase how are you in response to a button click.
     **/

    public void playHowAreU(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.hru);

        Player.start();
    }

    /**
     * This method plays an audio clip of the spanish phrase I'm called in response to a button click.
     **/

    public void playImCalled(View view){

        MediaPlayer Player = MediaPlayer.create(this, R.raw.called);

        Player.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_spanish);

    }
}
