package builder;

/**
 * Created by rek on 21.06.17.
 */
public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
