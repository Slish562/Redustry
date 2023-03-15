package com.redustry.lib.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;


public class SoundManager {
    private static final String SOUNDS_DIR = "sounds/";
    private static final float DEFAULT_VOLUME = 1f;
    private static final float DEFAULT_PITCH = 1f;
    private static final float DEFAULT_PAN = 0f;

    private com.badlogic.gdx.audio.Sound sound;

    public SoundManager(String fileName) {
        sound = Gdx.audio.newSound(Gdx.files.internal(SOUNDS_DIR + fileName));
    }

    public void play() {
        sound.play(DEFAULT_VOLUME, DEFAULT_PITCH, DEFAULT_PAN);
    }

    public void stop() {
        sound.stop();
    }

    public void dispose() {
        sound.dispose();
    }
}