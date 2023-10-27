package States;

import FlipperElements.Flipper;

public class PlayingState implements State{
    Flipper flipper;
    public PlayingState(Flipper flipper){
        this.flipper = flipper;
    }

    @Override
    public void insertCoin() {
        flipper.dashboard.coinAmount += 1;
        flipper.updateDisplay(flipper.displayFactory.createCoinMessage(flipper.dashboard.coinAmount));
    }

    @Override
    public boolean pressStart() {
        System.out.println("MiMa Software");
        return false;
    }
}
