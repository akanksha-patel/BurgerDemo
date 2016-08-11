package main.java.com.bitwiseglobal.burgershop;


import java.util.List;


class Utility {

    public static void printList(List list) {
        int i = 0;

        for (Object object : list) {
            Item item = (Item) object;
            System.out.println(++i + ". " + item.name() + " " + item.price());

        }

    }
}