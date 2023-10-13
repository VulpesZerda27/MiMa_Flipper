public class PlayingState implements State{
    Flipper flipper;
    public PlayingState(Flipper flipper){
        this.flipper = flipper;
    }

    @Override
    public void insertCoin() {
        flipper.getDashboard().setCoinAmount(flipper.getDashboard().getCoinAmount() + 1);
    }

    @Override
    public void pressStart() {
        System.out.println("MiMa Software");
    }
}
