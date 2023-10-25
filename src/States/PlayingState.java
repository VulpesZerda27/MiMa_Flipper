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
    }

    @Override
    public void pressStart() {
        System.out.println("MiMa Software");
    }
}
