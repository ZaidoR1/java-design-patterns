package creational.prototype;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by rek on 22.06.17.
 */
public class HeroCache {

    private static final Map<String, AbstractHero> map = new Hashtable<>();

    public static AbstractHero getHero(String heroId) {
        AbstractHero cachedHero = map.get(heroId);
        return (AbstractHero) cachedHero.clone();
    }

    public static void loadCache() {
        AbstractHero hero;

        hero = new Hulk();
        hero.setId("1");
        map.put(hero.getId(), hero);

        hero = new Spiderman();
        hero.setId("2");
        map.put(hero.getId(), hero);
    }
}
