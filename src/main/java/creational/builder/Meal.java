package creational.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rek on 21.06.17.
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO;
        for (Item item : items) {
            cost = cost.add(item.price());
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.printf("Item[%s], Packing[%s], Price[%s]\n",
                item.name(),
                item.packing().pack(),
                item.price());
        }
    }
}
