package creational.abstractfactory;

/**
 * Created by rek on 21.06.17.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch (choice != null ? choice : "") {
            case "hero":
                return new HeroFactory();
            case "universe":
                return new UniverseFactory();
            default:
                return null;
        }
    }
}
