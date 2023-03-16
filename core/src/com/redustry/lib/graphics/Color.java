package com.redustry.lib.graphics;

public class Color {
    private int red;
    private int green;
    private int blue;
    private int alpha;

    public Color(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public static Color valueOf(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        if (hex.length() == 6) {
            hex = hex + "FF";
        }

        if (hex.length() != 8) {
            throw new IllegalArgumentException("Invalid hex color code: " + hex);
        }

        int red = Integer.parseInt(hex.substring(0, 2), 16);
        int green = Integer.parseInt(hex.substring(2, 4), 16);
        int blue = Integer.parseInt(hex.substring(4, 6), 16);
        int alpha = Integer.parseInt(hex.substring(6, 8), 16);

        return new Color(red, green, blue, alpha);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}