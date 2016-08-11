package main.java.com.bitwiseglobal.burgershop;


class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Fanta());
        meal.addItem(new Coke());
        meal.addItem(new ChickenMcgrill());
        meal.addItem(new ExtraCheese());
        meal.addItem(new ExtraLongCheeseBurger());
        meal.addItem(new ExtraPatti());
        meal.addItem(new FrenchFries());
        meal.addItem(new McAlooTikki());
        meal.addItem(new McChicken());
        meal.addItem(new McSpicyPaneer());
        meal.addItem(new McVeggie());
        meal.addItem(new McEggBurger());


        return meal;
    }
}
