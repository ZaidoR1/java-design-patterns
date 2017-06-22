package structural.decorator.hero;

/**
 * Created by rek on 22.06.17.
 */
public abstract class HeroDecorator implements Hero {

    protected Hero decoratedHero;

    public HeroDecorator(Hero decoratedHero) {
        this.decoratedHero = decoratedHero;
    }

    @Override
    public void say() {
        decoratedHero.say();
    }
}
