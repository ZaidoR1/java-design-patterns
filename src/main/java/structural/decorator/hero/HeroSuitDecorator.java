package structural.decorator.hero;

/**
 * Created by rek on 22.06.17.
 */
public class HeroSuitDecorator extends HeroDecorator {

    public HeroSuitDecorator(Hero decoratedHero) {
        super(decoratedHero);
    }

    @Override
    public void say() {
        decoratedHero.say();
        setSuite(decoratedHero);
    }

    private void setSuite(Hero decoratedHero){
        System.out.println("My suit is...");
    }
}
