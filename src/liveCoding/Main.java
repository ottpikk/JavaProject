package liveCoding;

import liveCoding.invoiceTask.Discount;
import liveCoding.invoiceTask.Invoice;
import liveCoding.invoiceTask.Item;
import liveCoding.invoiceTask.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //create items
        Item item1 = new Item("TV","Sony", 1150.50);
        Item item2 = new Item("Radio","Samsung", 210.00);
        Item item3 = new Item("Headphones","Pioneer", 150.00);

        //create cart and add items
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addToCart(item1);
        cart1.addToCart(item3);

        cart1.showCart();

        Invoice invoice1 = new Invoice("ABC-01234567890123",cart1.getTotalAmount(),Discount.TEN_PERCENT);
        System.out.printf("invoice 1: %s\tamount: %s EUR\n",invoice1.getNumber(), invoice1.getAmountToPay());
        System.out.println();

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addToCart(item2);
        cart2.addToCart(item2);
        cart2.addToCart(item2);
        cart2.showCart();

        Invoice invoice2 = new Invoice("ABC-01234567890123",cart2.getTotalAmount(),Discount.TWENTY_FIVE_PERCENT);
        System.out.printf("invoice 2: %s\tamount: %s EUR\n",invoice2.getNumber(), invoice2.getAmountToPay());

    }
}
