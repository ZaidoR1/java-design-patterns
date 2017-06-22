package creational.abstractfactory;

import creational.factorymethod.hero.Batman;
import creational.factorymethod.hero.Heman;
import creational.factorymethod.hero.Hero;
import creational.factorymethod.universe.Universe;

/**
 * Created by rek on 21.06.17.
 */
public final class HeroFactory extends AbstractFactory {

    @Override
    public Hero getHero(String hero) {
        switch (hero != null ? hero : "") {
            case "batman":
                return new Batman();
            case "heman":
                return new Heman();
            default:
                return null;
        }
    }

    @Override
    Universe getUniverse(String universe) {
        return null;
    }
}
