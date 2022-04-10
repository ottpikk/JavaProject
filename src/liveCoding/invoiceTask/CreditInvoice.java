package liveCoding.invoiceTask;

public class CreditInvoice extends Invoice{

    private DebitInvoice debitInvoice;

    public CreditInvoice(String number, DebitInvoice debitInvoice) throws InvalidNumberException {
        super(number);
        this.debitInvoice = debitInvoice;

    }

    @Override
    public double getAmountToPay() {
        return debitInvoice.getAmountToPay() * -1;
    }
}
