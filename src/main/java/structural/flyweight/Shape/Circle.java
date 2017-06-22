package structural.flyweight.Shape;

/**
 * Created by rek on 22.06.17.
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(String color) {

        this.color = color;
    }

    private int r;

    @Override
    public void draw() {
        System.out.println("Circle{" +
            "color='" + color + '\'' +
            ", x=" + x +
            ", y=" + y +
            ", r=" + r +
            '}');
    }
}
