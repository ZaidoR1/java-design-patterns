package structural.bridge;

/**
 * Created by rek on 22.06.17.
 */
public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("RedCircle r=%d x=%d y=%d\n", radius, x, y);
    }
}
