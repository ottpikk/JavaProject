package liveCoding.invoiceTask;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
    ArrayList<Item> item;
    double totalAmount;

    public ShoppingCart() {
        this.item = new ArrayList<Item>();
        this.totalAmount = 0;
    }
    public void addToCart(Item item) {
        this.item.add(item);
    }

    public void showCart() {
        ListIterator<Item> iterator = item.listIterator();
        while(iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getProductName() + " (" + item.getDescription() + ") " + item.getUnitPrice() + " EUR");
        }
    }

    public double getTotalAmount() {
        ListIterator<Item> iterator = item.listIterator();
        this.totalAmount = 0;
        while(iterator.hasNext()) {
            Item item = iterator.next();
            this.totalAmount = this.totalAmount + (item.getUnitPrice());
        }
        return this.totalAmount;
    }
}
