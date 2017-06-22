package prototype;

/**
 * Created by rek on 22.06.17.
 */
public class Hulk extends AbstractHero {

    public Hulk(){
        type = "Hulk";
    }

    @Override
    void sayName() {
        System.out.println("I am Hulk");
    }
}
