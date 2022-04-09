package liveCoding.invoiceTask;

class InvalidNumberException extends Exception{
    public String getMessage(){
        return "Invoice number is too long";
    }
}


