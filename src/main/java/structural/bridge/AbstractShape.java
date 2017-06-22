package structural.bridge;

/**
 * Created by rek on 22.06.17.
 */
public abstract class AbstractShape {
    protected DrawApi drawApi;

    public AbstractShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();
}
