package builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public class Coke extends Drink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(30f);
    }
}
