package FlipperElements;

import lombok.Data;

public class Dashboard {
    public int coinAmount;
    public int ballAmount;
    public int score;

    public Dashboard(){
        coinAmount = 0;
        ballAmount = 0;
        score = 0;
    }
}
