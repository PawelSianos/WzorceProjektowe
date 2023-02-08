package Wzorce.projektowe.facade.bank;

public class AtmMachineFacade {

    private AtmMachine atmMachine = new AtmMachine();
    private BankSystem bankSystem = new BankSystem();

    public void withdrawMoney(){
        atmMachine.enterPin();
        if(bankSystem.validatePIN() && bankSystem.validateTransaction()){
            atmMachine.withdrawCash();
        }

    }
}
