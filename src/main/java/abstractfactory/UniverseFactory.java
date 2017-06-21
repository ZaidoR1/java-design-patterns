package abstractfactory;

import factorymethod.hero.Hero;
import factorymethod.universe.Dc;
import factorymethod.universe.Marvel;
import factorymethod.universe.Universe;
import java.lang.Character.UnicodeScript;

/**
 * Created by rek on 21.06.17.
 */
public class UniverseFactory extends AbstractFactory {

    @Override
    Hero getHero(String hero) {
        return null;
    }

    @Override
    Universe getUniverse(String universe) {
        switch (universe != null ? universe : "") {
            case "marvel":
                return new Marvel();
            case "dc":
                return new Dc();
            default:
                return null;
        }
    }
}
