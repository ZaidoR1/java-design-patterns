package factorymethod.hero;

/**
 * Created by rek on 21.06.17.
 */
public interface Hero {

    void say();

    default void name() {
        System.out.println("What's my Name?");
    }
}
