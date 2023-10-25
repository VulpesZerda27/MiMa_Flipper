import FlipperElements.Flipper;

public class Main {
    public static void main(String[] args) {
        Flipper flipper = Flipper.getInstance();

        System.out.println(flipper.currentState);
        flipper.pressStart();
        System.out.println(flipper.currentState);
        flipper.insertCoin();
        flipper.insertCoin();
        System.out.println(flipper.dashboard.coinAmount);
        System.out.println(flipper.currentState);
        flipper.pressStart();
        System.out.println(flipper.currentState);
        flipper.pressStart();
        System.out.println(flipper.currentState);
    }
}