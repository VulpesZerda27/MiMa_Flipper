public class NoCreditState implements State{
    Flipper flipper;
    public NoCreditState(Flipper flipper){
        this.flipper = flipper;
    }
    @Override
    public void insertCoin() {
        flipper.getDashboard().setCoinAmount(flipper.getDashboard().getCoinAmount() + 1);
        flipper.setCurrentState(flipper.getReadyState());
    }

    @Override
    public void pressStart() {
        System.out.println("No credit.");
    }
}
