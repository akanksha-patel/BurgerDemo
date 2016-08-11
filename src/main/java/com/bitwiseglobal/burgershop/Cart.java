package main.java.com.bitwiseglobal.burgershop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cart {


    private final List userOrders = new ArrayList();

    public void printCartProducts() {

        System.out.println("Printing your cart products...");
        Collections.sort(userOrders, new PriceComparator());
        Utility.printList(userOrders);

    }

    public void addToCart(Object o) {
        //noinspection unchecked
        this.userOrders.add(o);
    }


    public double calculateTotalPrice() {
        double sum = 0;
        for (Object object : userOrders) {
            Item order = (Item) object;
            sum = sum + order.price();
        }
        //sum = (sum + sum * 0.15) + (sum + sum * 0.10);
        sum = sum + (sum * 0.10 + sum * 0.15);

        return Double.parseDouble(new DecimalFormat("##.##").format(sum));


    }
}