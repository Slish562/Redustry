package com.redustry.lib.graphics;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.redustry.сore.Core;

public class Assets {
    public static AssetManager am;

    public static final String atlas = "core/assets/textures/game.atlas";
    public static final String skin = "core/assets/textures/skin/tracer-ui.hjson";

    public static AssetManager load(){
        am = new AssetManager();
        am.load(atlas, TextureAtlas.class);
        am.load(skin, Skin.class);
        am.finishLoading();
        return am;
    }
    public static void init(){
        Core.atlas = am.get(atlas, TextureAtlas.class);
        Core.skin = am.get(skin, Skin.class);
    }
}