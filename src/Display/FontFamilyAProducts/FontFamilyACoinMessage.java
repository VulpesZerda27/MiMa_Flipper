package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyACoinMessage implements DisplayMessage {
    int coins;

    public FontFamilyACoinMessage(int coins) {
        this.coins = coins;
    }

    public void display() {
        if(coins > 0) System.out.println("[FontFamilyA] coins: " + coins);
        else System.out.println("[FontFamilyA] No Credit");
    }
}
