package main.java.com.bitwiseglobal.burgershop;

public class McEggBurger extends Burger {
    @Override
    public String name() {
        return "mc egg burger";
    }

    @Override
    public float price() {
        return 102.12f;
    }
}
