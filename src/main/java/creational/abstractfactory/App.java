package creational.abstractfactory;

import creational.factorymethod.hero.Hero;
import creational.factorymethod.universe.Universe;

/**
 * Created by rek on 21.06.17.
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory heroFactory = FactoryProducer.getFactory("hero");
        AbstractFactory universeFactory = FactoryProducer.getFactory("universe");

        Hero hero1 = heroFactory.getHero("heman");
        hero1.name();

        Universe universe1 = universeFactory.getUniverse("marvel");
        universe1.name();
    }
}
