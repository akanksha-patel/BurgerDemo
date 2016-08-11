package main.java.com.bitwiseglobal.burgershop;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        int i = 1;

        for (Item item : items) {

            System.out.print(i + " - ");
            System.out.print("Item : " + item.name());
            System.out.println(", Price : " + item.price());
            i++;
        }
    }
}
