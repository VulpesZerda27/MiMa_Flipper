public class ReadyState implements State{
    Flipper flipper;
    public ReadyState(Flipper flipper){
        this.flipper = flipper;
    }
    @Override
    public void insertCoin() {
        flipper.getDashboard().setCoinAmount(flipper.getDashboard().getCoinAmount() + 1);
    }

    @Override
    public void pressStart() {
        flipper.setCurrentState(flipper.getPlayingState());
        flipper.getDashboard().setBallAmount(3);
    }
}
