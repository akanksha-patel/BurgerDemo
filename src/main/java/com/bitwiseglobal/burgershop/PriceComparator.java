package main.java.com.bitwiseglobal.burgershop;

class PriceComparator implements java.util.Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return (int) (item1.price() - item2.price());
    }


}
