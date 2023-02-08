package Wzorce.projektowe.state;

public class OneHandBanditMachine {

    State state;

    public OneHandBanditMachine() {
        state = new NoCoinState();
    }

    public void insertCoin() {
        state.insertCoin(this);
    }
    public void pullTheLever() {
        state.pullTheLever(this);
    }
    public void collectTheWinnings() {
        state.collectTheWinnings(this);
    }
    public void currentState() {
        state.currentState(this);
    }
}
