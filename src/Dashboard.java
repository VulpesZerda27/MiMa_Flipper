import lombok.Data;

@Data
public class Dashboard {
    private int coinAmount;
    private int ballAmount;
    private int score;
    private int multiplier;

    public Dashboard(){
        coinAmount = 0;
        ballAmount = 0;
        score = 0;
        multiplier = 0;
    }
}
