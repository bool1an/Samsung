package Unit2.task2.DLC2;

import java.util.Locale;

public class Number_1 {
    Vector2D vector2D = new Vector2D();

}
class Vector2D {
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
    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
    }
}
