public class Main {
    public static void main(String[] args) {
        Flipper flipper = Flipper.getInstance();

        System.out.println(flipper.getCurrentState());
        flipper.pressStart();
        System.out.println(flipper.getCurrentState());
        flipper.insertCoin();
        flipper.insertCoin();
        System.out.println(flipper.getDashboard().getCoinAmount());
        System.out.println(flipper.getCurrentState());
        flipper.pressStart();
        System.out.println(flipper.getCurrentState());
        flipper.pressStart();
        System.out.println(flipper.getCurrentState());
    }
}