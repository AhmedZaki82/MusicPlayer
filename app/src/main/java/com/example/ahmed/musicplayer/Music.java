package com.example.ahmed.musicplayer;

public class Music {

    private int imageC;
    private String singerC;
    private String songC;
    private String timeC;
    private int play1C;
    private int play2C;
    private int pauseC;
    private int audioC;

    public Music(int imageC, String singerC, String songC, String timeC,
                 int play1C, int play2C, int pauseC, int audioC) {
        this.imageC = imageC;
        this.singerC = singerC;
        this.songC = songC;
        this.timeC = timeC;
        this.play1C = play1C;
        this.play2C = play2C;
        this.pauseC = pauseC;
        this.audioC = audioC;
    }

    public int getImageC() {
        return imageC;
    }

    public String getSingerC() {
        return singerC;
    }

    public String getSongC() {
        return songC;
    }

    public String getTimeC() {
        return timeC;
    }

    public int getPlay1C() {
        return play1C;
    }

    public int getPlay2C() {
        return play2C;
    }

    public int getPauseC() {
        return pauseC;
    }

    public int getAudioC() {
        return audioC;
    }
}


