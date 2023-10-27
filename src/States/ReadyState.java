package States;

import FlipperElements.Flipper;

public class ReadyState implements State{
    Flipper flipper;
    public ReadyState(Flipper flipper){
        this.flipper = flipper;
    }
    @Override
    public void insertCoin() {
        flipper.dashboard.coinAmount += 1;
        flipper.updateDisplay(flipper.displayFactory.createCoinMessage(flipper.dashboard.coinAmount));
    }

    @Override
    public boolean pressStart() {
        flipper.updateDisplay(flipper.displayFactory.createStartMessage());
        flipper.currentState = flipper.playingState;
        flipper.dashboard.coinAmount -= 1;
        flipper.dashboard.ballAmount = 3;

        return true;
    }
}
