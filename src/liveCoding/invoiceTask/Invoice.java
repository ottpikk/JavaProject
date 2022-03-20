package liveCoding.invoiceTask;

public class Invoice {
    private String number;
    private final double amountToPay;   // we set, that the amount can't be changed after creating object-final
    private double discount;            //Encapsulation: no setters

    public Invoice(String number, double amountToPay, double discount) {
        setNumber(number);
        this.amountToPay = amountToPay;
        setDiscount(discount);
    }

    public Invoice(String number, double amountToPay) {
        this(number, amountToPay, 0.0);  //A call to the upper constructor
    }

    public String getNumber() {
        return number;
    }

    //returns validated number
    public void setNumber(String number) {
        int maxLetters = 10;
        if (number.length() > maxLetters){
            number = number.substring(0,maxLetters);  //if number longer than 10 char cut it to length 10
        }
        this.number = number;
    }

    //return validated discount
    public void setDiscount(double discount) {
        double maxDiscount = 1.0;
        double minDiscount = 0.0;
        if (discount > maxDiscount){
            discount = maxDiscount;
        } else if (discount < minDiscount){
            discount = minDiscount;
        }
        this.discount = discount;
    }

    //return discounted amount
    public double getAmountToPay() {
        return amountToPay - amountToPay * discount;
    }
}
