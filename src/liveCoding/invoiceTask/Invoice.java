package liveCoding.invoiceTask;

//since this class has one abstract method, the class must be also abstract
// we can not create or make instances of abstract classes.
public abstract class Invoice {

    private  String number;

    protected Invoice(String number) throws InvalidNumberException{
        setNumber(number);
    }

    public String getNumber(){
        return number;
    }

    //throws is like a warning to all callers of this method
    public void setNumber(String number) throws InvalidNumberException {
        int maxLetters = 10;
        if (number.length() > maxLetters){
            throw new InvalidNumberException(number);
        }
        this.number = number;
    }

    //abstract method means, we only define the method here without its implementation. No body.
    public abstract double getAmountToPay();


}
