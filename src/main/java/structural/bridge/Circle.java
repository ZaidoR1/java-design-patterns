package structural.bridge;

/**
 * Created by rek on 22.06.17.
 */
public class Circle extends AbstractShape {

    private int x;
    private int y;
    private int radius;

    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
