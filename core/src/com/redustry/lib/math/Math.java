package com.redustry.lib.math;

import com.badlogic.gdx.math.MathUtils;

public class Math {
    // Возвращает случайное целое число в диапазоне от min до max включительно
    public static int randomInt(int min, int max) {
        return MathUtils.random(min, max);
    }

    // Возвращает случайное число с плавающей запятой в диапазоне от min до max включительно
    public static float randomFloat(float min, float max) {
        return MathUtils.random(min, max);
    }

    // Возвращает случайный элемент из массива
    public static <T> T randomElement(T[] array) {
        return array[randomInt(0, array.length - 1)];
    }

    // Возвращает значение value, ограниченное в диапазоне от min до max
    public static float clamp(float value, float min, float max) {
        return MathUtils.clamp(value, min, max);
    }

    // Возвращает значение value, ограниченное в диапазоне от 0 до 1
    public static float clamp01(float value) {
        return MathUtils.clamp(value, 0f, 1f);
    }

    public static float pow(float value, float exponent) {
        return (float) Math.pow(value, exponent);
    }

    public static float lerp(float a, float b, float t) {
        return a + (b - a) * t;
    }

    public static float sqrt(float a) {
        float x = a;
        float y = 1.0f;
        float precision = 0.00001f; // точность вычисления
        while (x - y > precision) {
            x = 0.5f * (x + y);
            y = a / x;
        }
        return x;
    }

    // Возвращает случайное значение true или false
    public static boolean randomBoolean() {
        return MathUtils.randomBoolean();
    }

    // Возвращает случайный угол в радианах
    public static float randomAngle() {
        return MathUtils.random(0, MathUtils.PI2);
    }

    // Возвращает случайный угол в градусах
    public static float randomDegree() {
        return MathUtils.random(0, 360);
    }
    public static float abs(float value) {
        return value < 0 ? -value : value;
    }

    public static int min(float value1, float value2) {
        return (int) (value1 < value2 ? value1 : value2);
    }

    public static int max(float value1, float value2) {
        return (int) (value1 > value2 ? value1 : value2);
    }
}
