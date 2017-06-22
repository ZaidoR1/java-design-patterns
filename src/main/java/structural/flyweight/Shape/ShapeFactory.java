package structural.flyweight.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rek on 22.06.17.
 */
public class ShapeFactory {

    private static final Map<String, Shape> map = new HashMap<>();

    public static Shape getCircle(final String color) {
        Shape circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.printf("Creating circle with color %s\n", color);
        }
        return circle;
    }
}
