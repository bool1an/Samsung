package Unit2.task2.DLC2;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector) {
        vX = vector.vX;
        vY = vector.vY;
    }
    public double length() {
        double lengthV = Math.sqrt(vX*vX + vY*vY);
        return lengthV;
    }
    public void add (Vector2D v) {
        vX = vX + v.vX;
        vY = vY + v.vY;
    }

    public void sub (Vector2D v) {
        vX =vX - v.vX;
        vY = vY - v.vY;
    }

    public void scale (double scaleFactor) {
        vY = vY * scaleFactor;
        vX = vX * scaleFactor;
    }

    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
    }
}
