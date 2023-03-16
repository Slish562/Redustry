package com.redustry.lib.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.redustry.сore.Core;

public class Draw {

    public static SpriteBatch batch = new SpriteBatch();

    public static void reg(TextureRegion region, float x, float y){
        reg(region, x, y, 0);
    }

    public static void regi(Texture texture, float x, float y){
        batch.draw(texture, x - texture.getWidth() / 2, y - texture.getHeight() / 2);
    }

    public static void regi(Texture texture, float x, float y, float w, float h){
        batch.draw(texture, x - w / 2, y - h / 2, w, h);
    }

    public static void regi(TextureRegion region, float x, float y){
        batch.draw(region, x - region.getRegionWidth() / 2, y - region.getRegionHeight() / 2);
    }

    public static void reg(TextureRegion region, float x, float y, float width, float height){
        batch.draw(region, x - width / 2, y - height / 2, width, height);
    }

    public static void reg(String name, float x, float y){
        TextureRegion region = region(name);
        batch.draw(region, x - region.getRegionWidth() / 2, y - region.getRegionHeight() / 2);
    }

    public static void reg(String name, float x, float y, float rotation){
        TextureRegion region = region(name);
        batch.draw(region, x - region.getRegionWidth() / 2, y - region.getRegionHeight() / 2, region.getRegionWidth() / 2, region.getRegionHeight() / 2, region.getRegionWidth(), region.getRegionHeight(), 1, 1, rotation);
    }

    public static void reg(TextureRegion region, float x, float y, float rotation){
        batch.draw(region, x - region.getRegionWidth() / 2, y - region.getRegionHeight() / 2, region.getRegionWidth() / 2, region.getRegionHeight() / 2, region.getRegionWidth(), region.getRegionHeight(), 1, 1, rotation);
    }

    public static void reg(String name, float x, float y, float w, float h, float rotation){
        TextureRegion region = region(name);
        batch.draw(region, x - w / 2, y - h / 2, w / 2, h / 2, w, h, 1, 1, rotation);
    }

    public static void reg(TextureRegion region, float x, float y, float w, float h, float rotation){
        batch.draw(region, x - w / 2, y - h / 2, w / 2, h / 2, w, h, 1, 1, rotation);
    }

    public static void reg(String name, float x, float y, float w, float h){
        TextureRegion region = region(name);
        batch.draw(region, x - w / 2, y - h / 2, w, h);
    }

    public static TextureRegion region(String name){
        return Core.atlas == null ? null : Core.atlas.findRegion(name);
    }
}
