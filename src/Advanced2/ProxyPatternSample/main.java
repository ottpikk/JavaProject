package Advanced2.ProxyPatternSample;

import Advanced2.ProxyPatternSample.bankAuth.BankAuth;
import Advanced2.ProxyPatternSample.bankAuth.BankAuthProxy;

public class main {
    public static void main(String[] args) {

        System.out.println("Beginning of the code");

        // First I try to use the BankAuth class
        //BankAuth connection = new BankAuth();
        //As during development it throws Exception and that means my code can not run, I commented that out


        // I created Proxy class and use that
        BankAuthProxy connection = new BankAuthProxy();
        connection.run();

        //Now program runs til the end with no problems
        System.out.println("The end of the program");
    }
}
