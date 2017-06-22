package creational.builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(25f);
    }
}
