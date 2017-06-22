package creational.builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(50.5f);
    }
}
