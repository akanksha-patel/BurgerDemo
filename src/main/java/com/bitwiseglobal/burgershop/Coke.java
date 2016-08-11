package main.java.com.bitwiseglobal.burgershop;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 50f;
    }
}
