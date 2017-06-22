package creational.prototype;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        HeroCache.loadCache();

        AbstractHero hero1 = HeroCache.getHero("1");
        System.out.println(hero1.getType());

        AbstractHero hero2 = HeroCache.getHero("2");
        System.out.println(hero2.getType());
    }
}
