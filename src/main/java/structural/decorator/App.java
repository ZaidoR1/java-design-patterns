package structural.decorator;

import structural.decorator.hero.Batman;
import structural.decorator.hero.Heman;
import structural.decorator.hero.Hero;
import structural.decorator.hero.HeroSuitDecorator;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        Hero batman = new Batman();
        Hero suitBatman = new HeroSuitDecorator(new Batman());
        Hero suitHeman= new HeroSuitDecorator(new Heman());

        batman.say();
        suitBatman.say();
        suitHeman.say();
    }
}
