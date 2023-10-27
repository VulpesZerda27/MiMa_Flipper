package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyABallMessage implements DisplayMessage {
    int ballNumber;

    public FontFamilyABallMessage(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void display() {
        System.out.println("[FontFamilyA] Ball " + ballNumber);
    }
}