package liveCoding;

import liveCoding.invoiceTask.Discount;
import liveCoding.invoiceTask.Invoice;
import liveCoding.invoiceTask.Item;
import liveCoding.invoiceTask.ShoppingCart;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //create items
        Item tv = new Item("TV","Sony 55\" flatscreen", 1150.50);
        Item radio = new Item("Radio","Samsung 2200W", 210.00);
        Item headphones = new Item("Headphones","Pioneer 123-xl STEREO", 150.00);


        //1 SAMPLE uses shoppingCart class
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addToCart(tv);
        cart1.addToCart(headphones);
        cart1.addToCart(radio);
        cart1.showCart();  //just to print out items inside this shoppingCart

        Invoice invoice1 = new Invoice("ABC-0123456789012334234",cart1.getTotalAmount(),Discount.TEN_PERCENT);
        System.out.printf("invoice 1: %s\tamount: %s EUR\n",invoice1.getNumber(), invoice1.getAmountToPay());
        System.out.println();


        // 2 SAMPLE is without ShoppingCart class just put items into ArrayList
        List<Item> cart2 = new ArrayList<>();
        cart2.add(radio);
        cart2.add(radio);
        cart2.add(radio);
        //printout items
        for (int i = 0; i < cart2.size();i++){
            System.out.printf("%s (%s) Prize: %s EUR\n",cart2.get(i).getProductName(), cart2.get(i).getDescription(), cart2.get(i).getUnitPrice());
        }

        Invoice invoice2 = new Invoice("SKFJ - 45684454",cart2, Discount.TWENTY_FIVE_PERCENT);  //uses Invoice second constructor
        System.out.printf("invoice 2: %s\tamount: %s EUR\n",invoice2.getNumber(), invoice2.getAmountToPay2());

    }
}
