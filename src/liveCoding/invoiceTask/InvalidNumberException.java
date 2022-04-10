package liveCoding.invoiceTask;

public class InvalidNumberException extends Exception{

    public InvalidNumberException(String originalInvoiceNumber){

        //super(message) -> message = our message
        super(" DebitInvoice number " + originalInvoiceNumber
                + " is too long, Please enter a valid number!");
    }
}


