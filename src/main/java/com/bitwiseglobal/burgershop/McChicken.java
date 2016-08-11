package main.java.com.bitwiseglobal.burgershop;

public class McChicken extends Burger {
    @Override
    public String name() {
        return "Mc chicken";
    }

    @Override
    public float price() {
        return 170.00f;
    }
}
