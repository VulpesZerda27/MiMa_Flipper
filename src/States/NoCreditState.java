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
        flipper.updateDisplay(flipper.displayFactory.createCoinMessage(flipper.dashboard.coinAmount));
        flipper.currentState = flipper.readyState;
    }

    @Override
    public boolean pressStart() {
        flipper.updateDisplay(flipper.displayFactory.createCoinMessage(0));
        return false;
    }
}
