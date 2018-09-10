package com.example.ahmed.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class MusicAdapter extends ArrayAdapter {
    public MusicAdapter(@NonNull Context context, @NonNull List<Music> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Music currentTrack = (Music) getItem(position);

        View gridView = convertView;

        if (gridView == null) {

            gridView = LayoutInflater.from(getContext()).inflate(R.layout.sample,
                    parent,false);
        }

        ImageView imageA = (ImageView) gridView.findViewById(R.id.image_s);
        TextView artistA = (TextView) gridView.findViewById(R.id.singer_s);
        TextView songA = (TextView) gridView.findViewById(R.id.song_s);
        TextView timeA = (TextView) gridView.findViewById(R.id.time_s);
        ImageView playA = (ImageView) gridView.findViewById(R.id.play_s);

        imageA.setImageResource(currentTrack.getImageC());
        artistA.setText(currentTrack.getSingerC());
        songA.setText(currentTrack.getSongC());
        timeA.setText(currentTrack.getTimeC());
        playA.setImageResource(currentTrack.getPlay1C());

        return gridView;
    }
}
