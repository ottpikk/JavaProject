package liveCoding.invoiceTask;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double totalAmount;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
        this.totalAmount = 0;
    }
    public void addToCart(Item item) {
        this.items.add(item);
    }

    //Loop using For loop
    public void showCart() {
        for(Item i : items) {
            Item item = items.get(items.indexOf(i));
            System.out.println(item.getProductName() + " (" + item.getDescription() + ") " + item.getUnitPrice() + " EUR");
        }
    }

    //Loop using Iterator (no need, but just for practice, FOR loop simpler, like in showCart)
    public double getTotalAmount() {
        ListIterator<Item> iterator = items.listIterator();
        this.totalAmount = 0;
        while(iterator.hasNext()) {
            Item item = iterator.next();
            this.totalAmount = this.totalAmount + (item.getUnitPrice());
        }
        return this.totalAmount;
    }
}
