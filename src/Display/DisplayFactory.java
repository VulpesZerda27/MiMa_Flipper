package Display;

public interface DisplayFactory {
    DisplayMessage createStartMessage();
    DisplayMessage createGameOverMessage();
    DisplayMessage createBallMessage(int ballNumber);
    DisplayMessage createScoreMessage(int score);
    DisplayMessage createCoinMessage(int coinNumber);
}