package com.redustry.lib.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

public class SoundManager3D {
    private static final String SOUNDS_DIR = "sounds/";
;

    private com.badlogic.gdx.audio.Sound sound;

    private Array<Sound3D> sounds;

    public SoundManager3D(String fileName) {
        sounds = new Array<Sound3D>();
        sound = Gdx.audio.newSound(Gdx.files.internal(SOUNDS_DIR + fileName));
    }

    public void update(Vector3 listenerPos) {
        for (Sound3D sound : sounds) {
            sound.update(listenerPos);
        }
    }

    public void playSound(Sound sound, Vector3 position, float volume, float pitch, float range) {
        Sound3D sound3D = new Sound3D(sound, position, volume, pitch, range);
        sound3D.play();
        sounds.add(sound3D);
    }

    private class Sound3D {

        private Sound sound;
        private Vector3 position;
        private float volume;
        private float pitch;
        private float range;
        private long soundId;

        public Sound3D(Sound sound, Vector3 position, float volume, float pitch, float range) {
            this.sound = sound;
            this.position = position;
            this.volume = volume;
            this.pitch = pitch;
            this.range = range;
        }

        public void play() {
            soundId = sound.play(volume, pitch, 0f);
        }

        public void update(Vector3 listenerPos) {
            float distance = listenerPos.dst(position);
            float calculatedVolume = volume * Math.max(0, (range - distance) / range);
            sound.setVolume(soundId, calculatedVolume);
        }
    }
}