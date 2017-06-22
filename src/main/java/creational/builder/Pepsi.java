package creational.builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public class Pepsi extends Drink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(35f);
    }
}
