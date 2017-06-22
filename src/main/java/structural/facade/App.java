package structural.facade;

import structural.facade.hero.HeroMaker;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        HeroMaker heroMaker = new HeroMaker();
        heroMaker.sayHulk();
        heroMaker.sayCaptainAmerica();
        heroMaker.sayIronMan();
    }
}
