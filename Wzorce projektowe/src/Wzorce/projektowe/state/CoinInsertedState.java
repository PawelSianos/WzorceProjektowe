package Wzorce.projektowe.state;

import java.util.Random;

public class CoinInsertedState implements State{

    static final private Random random  = new Random();
    @Override
    public void insertCoin(OneHandBanditMachine context) {
        System.out.println("Moneta została wrzucona");
    }

    @Override
    public void pullTheLever(OneHandBanditMachine context) {
        System.out.println("Trwa losowanie");
        int result = random.nextInt(99);
        if(result < 20){
            System.out.println("Gratulacje, odbierz wygraną");
            context.state = new WinState();
        }else{
            System.out.println("Niestety tym razem się nie udało");
            context.state = new NoCoinState();
        }
    }

    @Override
    public void collectTheWinnings(OneHandBanditMachine context) {
        System.out.println("pociągnij dźwignię");
    }

    @Override
    public void currentState(OneHandBanditMachine context) {
        System.out.println("Aktualny stan - MONETA WRZUCONA");
    }
}
