package com.example.ahmed.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayNow extends AppCompatActivity {

    int playSelectedSong;

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_now);

        int image = getIntent().getIntExtra("image",0);
        String song = getIntent().getStringExtra("song");
        int pause = getIntent().getIntExtra("pause",0);
        int play = getIntent().getIntExtra("play",0);
        playSelectedSong = getIntent().getIntExtra("audio",0);

        ImageView imageN = findViewById(R.id.image_n);
        TextView songN = findViewById(R.id.song_n);
        ImageView pauseN = findViewById(R.id.pause_n);
        ImageView playN = findViewById(R.id.play_n);


        imageN.setImageResource(image);
        songN.setText(song);
        pauseN.setImageResource(pause);
        playN.setImageResource(play);

        mMediaPlayer = MediaPlayer.create(PlayNow.this,playSelectedSong);


        playN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.start();
            }
        });

        pauseN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.pause();
            }
        });


    }
    @Override
    protected void onPause() {
        super.onPause();
        mMediaPlayer.pause();
    }



    @Override
    protected void onStop() {
        super.onStop();
        mMediaPlayer.pause();
    }




    @Override
    protected void onRestart() {
        super.onRestart();
        mMediaPlayer.start();
    }
}
