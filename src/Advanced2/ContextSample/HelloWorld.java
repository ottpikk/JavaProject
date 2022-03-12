package Advanced2.ContextSample;

import Advanced2.ContextSample.api.CitadeleBankApi;
import Advanced2.ContextSample.api.SebBankApi;
import Advanced2.ContextSample.api.SwedBankApi;

public class HelloWorld {
    public static void main(String args[]){

        CitadeleBankApi citadeleBankApi = new CitadeleBankApi();
        SwedBankApi swedBankApi = new SwedBankApi();
        SebBankApi sebBankApi = new SebBankApi();

        citadeleBankApi.chargeCard();
        swedBankApi.chargeCard();
        sebBankApi.chargeCard();

        System.out.println("Hello world!");
    }
}
