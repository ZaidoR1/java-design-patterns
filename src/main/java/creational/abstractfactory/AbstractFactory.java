package creational.abstractfactory;

import creational.factorymethod.hero.Hero;
import creational.factorymethod.universe.Universe;

/**
 * Created by rek on 21.06.17.
 */
public abstract class AbstractFactory {
    abstract Hero getHero(String hero);
    abstract Universe getUniverse(String universe);
}
