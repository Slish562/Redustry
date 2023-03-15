package com.redustry.lib.math;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class VectorMath {

    // Возвращает случайную точку внутри заданного прямоугольника
    public static Vector2 randomPointInRect(float x, float y, float width, float height) {
        float randomX = MathUtils.random(x, x + width);
        float randomY = MathUtils.random(y, y + height);
        return new Vector2(randomX, randomY);
    }

    // Возвращает единичный вектор, направленный из одной точки в другую
    public static Vector2 vectorFromPoints(float startX, float startY, float endX, float endY) {
        Vector2 direction = new Vector2(endX - startX, endY - startY);
        direction.nor();
        return direction;
    }

    // Возвращает расстояние между двумя точками
    public static float distanceBetweenPoints(float x1, float y1, float x2, float y2) {
        return Vector2.dst(x1, y1, x2, y2);
    }

    // Возвращает единичный вектор, направленный в сторону цели от текущего положения
    public static Vector3 vectorToTarget(float currentX, float currentY, float currentZ, float targetX, float targetY, float targetZ) {
        Vector3 direction = new Vector3(targetX - currentX, targetY - currentY, targetZ - currentZ);
        direction.nor();
        return direction;
    }

    // Возвращает угол между двумя точками в радианах
    public static float angleBetweenPoints(float x1, float y1, float x2, float y2) {
        Vector2 vector = new Vector2(x2 - x1, y2 - y1);
        return vector.angleRad();
    }

    // Возвращает единичный вектор, направленный вдоль заданного угла
    public static Vector2 vectorFromAngle(float angle) {
        return new Vector2(1, 0).rotateRad(angle);
    }
}
