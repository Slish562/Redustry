package com.redustry.lib.math;

import com.badlogic.gdx.math.MathUtils;

public class Mathf {
    // Возвращает абсолютную величину числа
    public static float abs(float value) {
        return Math.abs(value);
    }

    // Возвращает наименьшее из двух чисел
    public static float min(float value1, float value2) {
        return Math.min(value1, value2);
    }

    // Возвращает наибольшее из двух чисел
    public static float max(float value1, float value2) {
        return Math.max(value1, value2);
    }

    // Возвращает значение, округленное до ближайшего целого числа
    public static int round(float value) {
        return MathUtils.round(value);
    }

    // Возвращает значение, округленное вниз до ближайшего целого числа
    public static int floor(float value) {
        return MathUtils.floor(value);
    }

    // Возвращает значение, округленное вверх до ближайшего целого числа
    public static int ceil(float value) {
        return MathUtils.ceil(value);
    }

    // Возвращает синус угла в радианах
    public static float sin(float angle) {
        return MathUtils.sin(angle);
    }

    // Возвращает косинус угла в радианах
    public static float cos(float angle) {
        return MathUtils.cos(angle);
    }

    // Возвращает арктангенс угла в радианах
    public static float atan(float value) {
        return (float) MathUtils.atan(value);
    }
}
