package abstractfactory;

import factorymethod.hero.Batman;
import factorymethod.hero.Heman;
import factorymethod.hero.Hero;
import factorymethod.universe.Universe;

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
