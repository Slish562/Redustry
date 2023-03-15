package com.redustry.lib.audio;

import com.badlogic.gdx.Gdx;

public class MusicManager {
    private static final String MUSIC_DIR = "music/";
    private static final float DEFAULT_VOLUME = 1f;
    private static final boolean DEFAULT_LOOPING = true;

    private com.badlogic.gdx.audio.Music music;

    public MusicManager(String fileName) {
        music = Gdx.audio.newMusic(Gdx.files.internal(MUSIC_DIR + fileName));
    }

    public void play() {
        music.play();
    }

    public void pause() {
        music.pause();
    }

    public void stop() {
        music.stop();
    }

    public void setLooping(boolean isLooping) {
        music.setLooping(isLooping);
    }

    public void setVolume(float volume) {
        music.setVolume(volume);
    }

    public void dispose() {
        music.dispose();
    }
}