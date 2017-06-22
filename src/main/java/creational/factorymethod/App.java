package creational.factorymethod;

import creational.factorymethod.hero.Hero;
import creational.factorymethod.hero.HeroFactory;
import creational.factorymethod.universe.Universe;
import creational.factorymethod.universe.UniverseFactory;

/**
 * Created by rek on 21.06.17.
 */
public class App {

    public static void main(String[] args) {
        Hero heman = HeroFactory.getHero("heman");
        Hero batman = HeroFactory.getHero("batman");

        heman.name();
        heman.say();

        batman.name();
        batman.say();

        Universe marvel = UniverseFactory.create("marvel");
        Universe dc = UniverseFactory.create("dc");

        marvel.name();
        dc.name();
    }
}
