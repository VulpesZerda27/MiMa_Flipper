package Display;

import Display.FontFamilyBProducts.*;

public class FontFamilyBFactory implements DisplayFactory {
    public DisplayMessage createStartMessage() {
        return new FontFamilyBStartMessage();
    }

    public DisplayMessage createGameOverMessage() {
        return new FontFamilyBGameOverMessage();
    }

    public DisplayMessage createBallMessage(int ballNumber) {
        return new FontFamilyBBallMessage(ballNumber);
    }
    public DisplayMessage createScoreMessage(int score) {
        return new FontFamilyBScoreMessage(score);
    }
    public DisplayMessage createCoinMessage(int coinNumber) {
        return new FontFamilyBCoinMessage(coinNumber);
    }
}
