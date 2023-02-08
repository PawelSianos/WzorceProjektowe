package Wzorce.projektowe.state;

public class Main {

    public static void main(String[] args) {

        OneHandBanditMachine oneHandBanditMachine = new OneHandBanditMachine();

        oneHandBanditMachine.insertCoin();
        oneHandBanditMachine.currentState();
        oneHandBanditMachine.pullTheLever();
        oneHandBanditMachine.currentState();
        oneHandBanditMachine.collectTheWinnings();
        oneHandBanditMachine.currentState();

    }

}
