package structural.flyweight;

import structural.flyweight.Shape.Circle;
import structural.flyweight.Shape.ShapeFactory;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    private static final String colors[] = {"red", "green", "blue", "yellow"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomNumber());
            circle.setY(getRandomNumber());
            circle.setR(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
