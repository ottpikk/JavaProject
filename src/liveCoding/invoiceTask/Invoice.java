package liveCoding.invoiceTask;


import java.util.List;

public class Invoice {
    //Fields
    private String number;
    private double amountToPay;   // we set, that the amount can't be changed after creating object-final
    private Discount discount;
    private List<Item> items;

    // Constructor for 1st SAMPLE in Main
    public Invoice(String number, double amountToPay, Discount discount) {
        setNumber(number);  //use setter to modify or validate field to create instance
        this.amountToPay = amountToPay; //class field and constructor's second parameter
        setDiscount(discount);
    }
    // Constructor for 2nd SAMPLE in Main
    public Invoice(String number, List<Item> items, Discount discount) {
        setNumber(number);
        this.items = items;
        setDiscount(discount);
    }

    public String getNumber() {
        return number;
    }

    //returns validated number
    public void setNumber(String number) {
        //Check whether invoice number length is less than 10 symbols. Otherwise, cut it to 10 symbols
        int maxLetters = 10;
        if (number.length() > maxLetters){
            number = number.substring(0,maxLetters);  //  .substring(x,y)   - x from index(included), y - to index(not included)
        }
        this.number = number;
    }

    public void setDiscount (Discount discount){
        this.discount = discount;
    }

    //return discounted amount for 1st SAMPLE in Main
    public double getAmountToPay() {
        return amountToPay - amountToPay * discount.getPercentage();
    }

    //returns discounted price for 2nd SAMPLE in Main
    public double getAmountToPay2() {
        double sumOfItems = 0.00;
        for (Item currentItem : items){
            sumOfItems += currentItem.getUnitPrice();
        }
        return sumOfItems - sumOfItems * discount.getPercentage();
    }




}


