package com.redustry.lib.visual;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureManager {
    public static Texture getTexture(String textureName) {
        return new Texture(Gdx.files.internal("textures/" + textureName + ".png"));
    }
}
