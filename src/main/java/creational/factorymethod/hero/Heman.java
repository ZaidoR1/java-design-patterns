package creational.factorymethod.hero;

/**
 * Created by rek on 21.06.17.
 */
public class Heman implements Hero {

    @Override
    public void say() {
        System.out.println("By the power of grayskull");
    }

    @Override
    public void name() {
        System.out.println("He-Man");
    }
}
