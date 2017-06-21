package builder;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by rek on 21.06.17.
 */
public class App {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        Meal chickenMeal = builder.prepareChickenBurger();
        Meal bigMeal = new Meal();
        bigMeal.addItem(new ChickenBurger());
        bigMeal.addItem(new ChickenBurger());
        bigMeal.addItem(new ChickenBurger());
        bigMeal.addItem(new Pepsi());
        bigMeal.addItem(new Coke());

        DecimalFormat df = new DecimalFormat("#.00");

        vegMeal.showItems();
        System.out.println(df.format(vegMeal.getCost()));
        System.out.println();

        chickenMeal.showItems();
        System.out.println(df.format(chickenMeal.getCost()));
        System.out.println();

        bigMeal.showItems();
        System.out.println(df.format(bigMeal.getCost()));
    }
}
