package FlipperElements;

import States.*;
import Visitor.*;

import java.util.List;

public class Flipper implements Visitable {
    public static Flipper instance;
    public State noCreditState;
    public State readyState;
    public State playingState;
    public State endState;
    public State currentState;

    public Dashboard dashboard;
    public List<FlipperElement> flipperElements;

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

    @Override
    public void accept(Visitor visitor) {
        for(int i = 0; i < flipperElements.size(); i++){
            flipperElements.get(i).accept(visitor);
        }
        visitor.visit(this);
    }
}
