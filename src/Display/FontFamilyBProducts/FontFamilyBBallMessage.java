package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBBallMessage implements DisplayMessage {
    int ballNumber;

    public FontFamilyBBallMessage(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void display() {
        System.out.println("[FontFamilyB] Ball " + ballNumber);
    }
}