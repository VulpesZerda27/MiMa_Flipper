import FlipperElements.FlipperElement;
import lombok.Data;

import java.util.List;

@Data
public class Flipper {
    private static Flipper instance;

    private State noCreditState;
    private State readyState;
    private State playingState;
    private State endState;
    private State currentState;

    private Dashboard dashboard;
    private List<FlipperElement> flipperElements;

    private Flipper(){
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);
        currentState = noCreditState;
        dashboard = new Dashboard();
    }

    public static Flipper getInstance(){
        if(instance == null) {
            instance = new Flipper();
        }
        return instance;
    }

    public void insertCoin(){
        currentState.insertCoin();
    }

    public void pressStart(){
        currentState.pressStart();
    }
}
