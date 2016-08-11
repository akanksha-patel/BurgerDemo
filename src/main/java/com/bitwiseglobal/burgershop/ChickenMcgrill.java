package main.java.com.bitwiseglobal.burgershop;


@SuppressWarnings("ALL")
public class ChickenMcgrill extends Burger {
    @Override
    public String name() {
        return "chicken mcgrill";
    }

    @Override
    public float price() {
        return 122.33f;
    }
}
