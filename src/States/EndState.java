package States;

import FlipperElements.Flipper;

public class EndState implements State{
    Flipper flipper;
    public EndState(Flipper flipper){
        this.flipper = flipper;
    }
    @Override
    public void insertCoin() {
        flipper.dashboard.coinAmount += 1;
        flipper.updateDisplay(flipper.displayFactory.createCoinMessage(flipper.dashboard.coinAmount));
    }
    @Override
    public void pressStart() {
        System.out.println("MiMa Software");
    }
}
