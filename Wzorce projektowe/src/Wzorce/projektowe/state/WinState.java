package Wzorce.projektowe.state;

public class WinState implements State{
    @Override
    public void insertCoin(OneHandBanditMachine context) {
        System.out.println("Zabierz najpierw wygraną");
    }

    @Override
    public void pullTheLever(OneHandBanditMachine context) {
        System.out.println("Odbierz nagrodę");
    }

    @Override
    public void collectTheWinnings(OneHandBanditMachine context) {
        System.out.println("Zabrano nagrodę gratuluję");
        context.state = new NoCoinState();
    }

    @Override
    public void currentState(OneHandBanditMachine context) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}
