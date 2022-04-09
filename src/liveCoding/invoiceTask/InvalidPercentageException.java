package liveCoding.invoiceTask;

public class InvalidPercentageException extends Exception{

    public String getMessage() {
        return "Discount percentage can be set only between 0 to 100 %";
    }
}
