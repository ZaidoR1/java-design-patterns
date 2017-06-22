package creational.factorymethod.hero;

/**
 * Created by rek on 21.06.17.
 */
public final class HeroFactory {

    public static Hero getHero(String hero) {
        if (hero == null) {
            return null;
        }

        if ("batman".equalsIgnoreCase(hero)) {
            return new Batman();
        }
        if ("heman".equalsIgnoreCase(hero)) {
            return new Heman();
        }

        return null;
    }
}
