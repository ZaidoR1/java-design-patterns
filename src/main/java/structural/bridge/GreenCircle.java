package structural.bridge;

/**
 * Created by rek on 22.06.17.
 */
public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("GreenCircle r=%d x=%d y=%d\n", radius, x, y);
    }
}
