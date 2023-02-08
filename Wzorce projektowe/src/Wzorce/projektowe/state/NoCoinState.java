package Wzorce.projektowe.state;

public class NoCoinState implements State{
    @Override
    public void insertCoin(OneHandBanditMachine context) {
        System.out.println("Wrzucono monetę.");
        context.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(OneHandBanditMachine context) {
        System.out.println("Wrzuć najpierw monetę");
    }

    @Override
    public void collectTheWinnings(OneHandBanditMachine context) {
        System.out.println("Wrzuć monetę by mieć szansę");
    }

    @Override
    public void currentState(OneHandBanditMachine context) {
        System.out.println("Aktualny stan - BRAK MONETY");

    }
}
