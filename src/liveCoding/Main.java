package liveCoding;

import liveCoding.invoiceTask.*;

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
        try {
            DebitInvoice debitInvoice1 = new DebitInvoice("ABC-0123456789012334234",cart1.getTotalAmount(),Discount.TWO_HUNDRED_PERCENT);
            System.out.printf("invoice 1: %s\tamount: %s EUR\n", debitInvoice1.getNumber(), debitInvoice1.getAmountToPay());
            Invoice creditInvoice1 = new CreditInvoice("dlskf-4", debitInvoice1);
            System.out.println("creditInvoice1 : " + creditInvoice1.getNumber() + "sum to pay: " + creditInvoice1.getAmountToPay());
        } catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }

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
        try{
            DebitInvoice debitInvoice2 = new DebitInvoice("KLM - 45",cart2, Discount.TWENTY_FIVE_PERCENT);  //uses DebitInvoice second constructor
            System.out.printf("invoice 2: %s\tamount: %s EUR\n", debitInvoice2.getNumber(), debitInvoice2.getAmountToPay());
            Invoice creditInvoice1 = new CreditInvoice("ABC-4", debitInvoice2);
            System.out.println("creditInvoice1 : " + creditInvoice1.getNumber() + "  sum to pay: " + creditInvoice1.getAmountToPay());

        } catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }

    }
}
