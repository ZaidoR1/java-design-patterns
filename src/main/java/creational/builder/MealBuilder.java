package creational.builder;

/**
 * Created by rek on 21.06.17.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareChickenBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
