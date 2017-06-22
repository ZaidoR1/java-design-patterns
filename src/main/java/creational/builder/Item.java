package creational.builder;

import java.math.BigDecimal;

/**
 * Created by rek on 21.06.17.
 */
public interface Item {

    String name();

    Packing packing();

    BigDecimal price();
}
