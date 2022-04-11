package liveCoding.invoiceTask;

public enum Discount {
    NO_DISCOUNT(0.00),  //value must be defined as separate field and Discount needs also constructor
    FIVE_PERCENT(0.05),
    TEN_PERCENT(0.10),
    TWENTY_FIVE_PERCENT(0.25),
    FIFTY_PERCENT(0.50),
    TWO_HUNDRED_PERCENT(2.00);


    private double percentage;  //define value field for enums (encapsulated from other classes - private)
    /*
    A constructor of enum cannot be public because we do not create
        instances of enum outside the enum itself.
    A constructor calls are performed upon each of the enum's inside this same enum.
    //Because this is how Java works
    */
    private Discount(double percentage) {
        setPercentage(percentage);
    }

    private void setPercentage(double percentage) {
        double maxDiscount = 1.0;
        double minDiscount = 0.0;

        if (percentage > maxDiscount){
            percentage = maxDiscount;
        } else if (percentage < minDiscount){
            percentage = minDiscount;
        }
        this.percentage = percentage;


    }

    //get access to double percentage value from outside this enum, that's why public
    public double getPercentage (){
        return percentage;
    }
}
