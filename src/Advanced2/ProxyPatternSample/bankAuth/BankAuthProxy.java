package Advanced2.ProxyPatternSample.bankAuth;

public class BankAuthProxy extends BankAuth{


     /* Using Proxy pattern means, that
     *  the methods that doesn't allow during development run certain methods
     *  must be overridden
     *For that
     *  1. Create Proxy class
     *  2. use  "extends" original class
     *  3. "Override all the methods that prevent program from working - leave the methods blank*/

    @Override
    public void run(){

    }
}
