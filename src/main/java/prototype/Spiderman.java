package prototype;

/**
 * Created by rek on 22.06.17.
 */
public class Spiderman extends AbstractHero {


    public Spiderman() {
        type = "Spiderman";
    }

    @Override
    void sayName() {
        System.out.println("I am Spiderman");
    }
}
