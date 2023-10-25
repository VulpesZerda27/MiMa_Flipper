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
    }

    @Override
    public void pressStart() {
        flipper.currentState = flipper.playingState;
        flipper.dashboard.ballAmount = 3;
    }
}
