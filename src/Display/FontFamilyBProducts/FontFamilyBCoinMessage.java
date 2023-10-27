package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBCoinMessage implements DisplayMessage {
    int coins;

    public FontFamilyBCoinMessage(int coins) {
        this.coins = coins;
    }

    public void display() {
        if(coins > 0) System.out.println("[FontFamilyB] coins: " + coins);
        else System.out.println("[FontFamilyB] No Credit");
    }
}
