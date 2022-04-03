package liveCoding.invoiceTask;


public class Invoice {
    //Fields
    private String number;
    private final double amountToPay;   // we set, that the amount can't be changed after creating object-final
    private Discount discount;

    //Constructor
    public Invoice(String number, double amountToPay, Discount discount) {
        setNumber(number);  //use setter to modify or validate field to create instance
        this.amountToPay = amountToPay; //class field and constructor's second parameter
        setDiscount(discount);
    }

    public Invoice(String number, double amountToPay) {
        this(number, amountToPay, Discount.NO_DISCOUNT);  //A call to the upper constructor
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

    //return discounted amount
    public double getAmountToPay() {
        return amountToPay - amountToPay * discount.getPercentage();
    }




}


