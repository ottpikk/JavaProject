package Advanced2.ContextSample.api;

import Advanced2.ContextSample.Context;
import Advanced2.ContextSample.service.BankAuthService;

public class SebBankApi {
    BankAuthService bankAuthService = Context.bankAuthService;

    public void chargeCard(){
        bankAuthService.connect();
        System.out.println("Charge card! SEB");

    }
}
