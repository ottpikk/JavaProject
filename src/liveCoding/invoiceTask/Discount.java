package liveCoding.invoiceTask;

public enum Discount {
    NO_DISCOUNT(0.00),
    FIVE_PERCENT(0.05),
    TEN_PERCENT(0.10),
    TWENTY_FIVE_PERCENT(0.25),
    FIFTY_PERCENT(0.50);

    private double percentage;
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

    //get access to double percentage value
    public double getPercentage (){
        return percentage;
    }
}
