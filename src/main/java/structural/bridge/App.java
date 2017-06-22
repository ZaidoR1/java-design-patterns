package structural.bridge;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        AbstractShape redCircle = new Circle(10, 100, 100, new RedCircle());
        AbstractShape greenCircle = new Circle(15, 105, 150, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
