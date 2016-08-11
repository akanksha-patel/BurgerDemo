package main.java.com.bitwiseglobal.burgershop;

import java.util.Scanner;

class Menu {

    private final Cart cart = new Cart();
    private final MealBuilder mealBuilder = new MealBuilder();
    private final Meal vegMeal = mealBuilder.prepareVegMeal();
    private int ch;

    public Menu() {

        do {
            this.categories();
            this.getUserInput();
            this.doAction(this.ch);
        } while (this.ch != 0);
    }

    private void categories() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. List of Items");
        System.out.println("2. Cart Status");
        System.out.println("3. Total Price for orders");
        System.out.println("4. Exit");
        System.out.println("---------------------------------------------------------------------------");
    }

    private int getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Enter a choice : ");
        try {

            this.ch = Integer.parseInt(in.nextLine());
            if (this.ch < 0) {
                System.out.println("Negetive number !!!!Please enter a valid choice !!  ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid choice ..............   ");
            this.getUserInput();
        }

        System.out.println(" \n ---------------------------------------------------------------------------");
        return this.ch;
    }

    private void doAction(int ch) {
        switch (ch) {
            case 1:
                vegMeal.showItems();
                cart.addToCart(vegMeal.getItems().get(this.getUserInput() - 1));
                break;
            case 2:
                this.printCartItems();
                break;
            case 3:
                System.out.println(cart.calculateTotalPrice());
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Please enter a valid choice !!!!!!!!!!!!");


        }
    }

    private void printCartItems() {
        cart.printCartProducts();
    }


}
