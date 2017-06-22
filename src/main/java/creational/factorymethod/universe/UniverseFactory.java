package creational.factorymethod.universe;

/**
 * Created by rek on 21.06.17.
 */
public class UniverseFactory {

    public static Universe create(String universe) {
        if (universe == null) {
            return null;
        }

        if ("marvel".equalsIgnoreCase(universe)) {
            return new Marvel();
        }
        if ("dc".equalsIgnoreCase(universe)) {
            return new Dc();
        }

        return null;
    }
}
