package Wzorce.projektowe.state;

public interface State {

    void insertCoin(OneHandBanditMachine context);
    void pullTheLever(OneHandBanditMachine context);
    void collectTheWinnings(OneHandBanditMachine context);
    void currentState(OneHandBanditMachine context);



}
