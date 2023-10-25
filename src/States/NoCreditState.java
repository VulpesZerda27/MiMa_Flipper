package States;

import FlipperElements.Flipper;

public class NoCreditState implements State{
    Flipper flipper;
    public NoCreditState(Flipper flipper){
        this.flipper = flipper;
    }
    @Override
    public void insertCoin() {
        flipper.dashboard.coinAmount += 1;
        flipper.currentState = flipper.readyState;
    }

    @Override
    public void pressStart() {
        System.out.println("No credit.");
    }
}
