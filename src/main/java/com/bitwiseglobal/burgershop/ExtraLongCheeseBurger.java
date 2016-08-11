package main.java.com.bitwiseglobal.burgershop;


public class ExtraLongCheeseBurger extends Burger {
    @Override
    public String name() {
        return "Extra-long cheese burger";
    }

    @Override
    public float price() {
        return 220.75f;
    }
}
