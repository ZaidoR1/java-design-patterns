package builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
