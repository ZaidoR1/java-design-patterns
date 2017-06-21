package singleton;

/**
 * Created by rek on 21.06.17.
 */
public enum MySingleton {
    INSTANCE;

    public static void hi() {
        System.out.println("HI from Singleton.");
    }
}
