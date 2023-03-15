package com.redustry.util;

import com.badlogic.gdx.math.MathUtils;
import com.redustry.lib.math.Mathf;

public class Position {
    private float x;
    private float y;

    public Position() {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }
}