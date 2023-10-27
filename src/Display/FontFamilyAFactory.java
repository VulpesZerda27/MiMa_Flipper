package Display;

import Display.FontFamilyAProducts.*;

public class FontFamilyAFactory implements DisplayFactory {
    public DisplayMessage createStartMessage() {
        return new FontFamilyAStartMessage();
    }

    public DisplayMessage createGameOverMessage() {
        return new FontFamilyAGameOverMessage();
    }

    public DisplayMessage createBallMessage(int ballNumber) {
        return new FontFamilyABallMessage(ballNumber);
    }
    public DisplayMessage createScoreMessage(int score) {
        return new FontFamilyAScoreMessage(score);
    }
    public DisplayMessage createCoinMessage(int coinNumber) {
        return new FontFamilyACoinMessage(coinNumber);
    }
}