package liveCoding.invoiceTask;

public class InvalidPercentageException extends Exception{

    public InvalidPercentageException(double originalPercentage){

        //super(message) -> message = our message
        super(" The discount " + (int)originalPercentage * 100
                + " % is out of range 0 and 100 %, Please enter a valid discount!");
    }
}
