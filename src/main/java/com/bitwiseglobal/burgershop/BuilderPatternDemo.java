package main.java.com.bitwiseglobal.burgershop;

class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println(" Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
    }
}
