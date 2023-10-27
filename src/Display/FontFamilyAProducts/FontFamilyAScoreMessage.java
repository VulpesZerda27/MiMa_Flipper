package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyAScoreMessage implements DisplayMessage {
    int score;

    public FontFamilyAScoreMessage(int score) {
        this.score = score;
    }

    public void display() {
        System.out.println("[FontFamilyA] Score: " + score);
    }
}
