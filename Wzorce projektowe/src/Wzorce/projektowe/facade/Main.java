package Wzorce.projektowe.facade;

import Wzorce.projektowe.facade.bank.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade facade = new AtmMachineFacade();
        facade.withdrawMoney();

    }
}
