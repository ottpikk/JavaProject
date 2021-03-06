package liveCoding.invoiceTask;

import java.util.List;

public class DebitInvoice extends Invoice{
    //Fields
    private Discount discount;
    private List<Item> items;

    // Constructor for 1st SAMPLE in Main
    public DebitInvoice(String number, double amountToPay, Discount discount) throws InvalidNumberException, InvalidPercentageException {
        super(number);
        setDiscount(discount);
        if (discount.getPercentage() > 2 || discount.getPercentage() < 0){
            throw new InvalidPercentageException(discount.getPercentage());
        }

    }
    // Constructor for 2nd SAMPLE in Main
    public DebitInvoice(String number, List<Item> items, Discount discount) throws InvalidNumberException, InvalidPercentageException {
        super(number);
        this.items = items;
        setDiscount(discount);
        if (discount.getPercentage() > 2 || discount.getPercentage() < 0){
            throw new InvalidPercentageException(discount.getPercentage());
        }
    }

    public void setDiscount (Discount discount){
        this.discount = discount;
    }

    //returns discounted price for 2nd SAMPLE in Main
    @Override
    public double getAmountToPay() {
        double sumOfItems = 0.00;
        for (Item currentItem : items){
            sumOfItems += currentItem.getUnitPrice();
        }
        return sumOfItems - sumOfItems * discount.getPercentage();
    }




}


