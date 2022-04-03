package liveCoding;

import liveCoding.invoiceTask.Discount;
import liveCoding.invoiceTask.Invoice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("ABC-0123483958439854839",5000.55);
        Invoice invoice2 = new Invoice("ABC-943549856",5000.55,Discount.TEN_PERCENT);
        Invoice invoice3 = new Invoice("ABC-2345434345839",5000.55,Discount.FIFTY_PERCENT);
        Invoice invoice4 = new Invoice("ABC-854839",5000.55,Discount.FIVE_PERCENT);
        Invoice invoice5 = new Invoice("ABC-0135",5000.55, Discount.TWENTY_FIVE_PERCENT);

        System.out.printf("invoice 1: %s\tamount: %s EUR\n",invoice1.getNumber(), invoice1.getAmountToPay());
        System.out.printf("invoice 2: %s\tamount: %s EUR\n",invoice2.getNumber(), invoice2.getAmountToPay());
        System.out.printf("invoice 3: %s\tamount: %s EUR\n",invoice3.getNumber(), invoice3.getAmountToPay());
        System.out.printf("invoice 4: %s\tamount: %s EUR\n",invoice4.getNumber(), invoice4.getAmountToPay());
        System.out.printf("invoice 5: %s\tamount: %s EUR\n",invoice5.getNumber(), invoice5.getAmountToPay());


    }
}
