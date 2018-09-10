package com.example.ahmed.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        String getIntent = getIntent().getStringExtra("music");

        ArrayList<Music> music = new ArrayList<>();

        if (getIntent.equals("pop")) {

            music.add(new Music(R.drawable.george_michael,"George Michael",
                    "Older","05:45",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.george));

            music.add(new Music(R.drawable.shania_twain,"Shania Twain",
                    "Kash","03:25",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.shania));

            music.add(new Music(R.drawable.michael_jackson,"Michael Jackson",
                    "Man in the Mirror","06:45",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.michael));

            music.add(new Music(R.drawable.mariah_carey,"Mariah Carey",
                    "Hero","02:55",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.mariah));

            music.add(new Music(R.drawable.celine_dion,"Celine Dion",
                    "Because you loved me","05:45",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.celine));
        }else if (getIntent.equals("rock")) {

            music.add(new Music(R.drawable.elvis,"Elvis Presley",
                    "You all I have my boy","03:15",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.elvis));

            music.add(new Music(R.drawable.scorpions,"Scorpions",
                    "Mind like a tree","04:05",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.scorpions));

        }else if (getIntent.equals("metal")) {

            music.add(new Music(R.drawable.metallica,"Metallica",
                    "Where ever I may Roam","07:25",R.drawable.play1,R.drawable.play,
                    R.drawable.pause,R.raw.metallica));
        }

        ListView gridView = (ListView) findViewById(R.id.g_view);

        MusicAdapter adapter = new MusicAdapter(PlayList.this,music);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Music selectedItem = (Music) parent.getItemAtPosition(position);

                int imageP = selectedItem.getImageC();
                String songP = selectedItem.getSongC();
                int pauseP = selectedItem.getPauseC();
                int playP = selectedItem.getPlay2C();
                int audioP = selectedItem.getAudioC();

                Intent put = new Intent(PlayList.this,PlayNow.class);

                put.putExtra("image",imageP);
                put.putExtra("song",songP);
                put.putExtra("pause",pauseP);
                put.putExtra("play",playP);
                put.putExtra("audio",audioP);

                startActivity(put);
            }
        });

    }


}
