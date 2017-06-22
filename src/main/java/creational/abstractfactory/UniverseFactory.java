package creational.abstractfactory;

import creational.factorymethod.hero.Hero;
import creational.factorymethod.universe.Dc;
import creational.factorymethod.universe.Marvel;
import creational.factorymethod.universe.Universe;

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
