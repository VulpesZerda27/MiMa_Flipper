package FlipperElements;

import Commands.Command;
import Display.DisplayFactory;
import Display.DisplayMessage;
import States.*;
import Visitor.*;

import java.util.ArrayList;
import java.util.List;

public class Flipper implements Visitable {
    public static Flipper instance;
    public Command gameCommands;
    public State noCreditState;
    public State readyState;
    public State playingState;
    public State endState;
    public State currentState;

    public Dashboard dashboard;
    public DisplayFactory displayFactory;
    public List<Visitable> flipperElements;

    private Flipper(DisplayFactory displayFactory, ArrayList<Visitable> flipperElements){
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);
        currentState = noCreditState;
        dashboard = new Dashboard();
        this.displayFactory = displayFactory;
        this.flipperElements = flipperElements;
    }

    public static Flipper getInstance(DisplayFactory displayFactory, ArrayList<Visitable> flipperElements){
        if(instance == null) {
            instance = new Flipper(displayFactory, flipperElements);
        }
        return instance;
    }

    public void insertCoin(){
        currentState.insertCoin();
    }

    public boolean pressStart(){
        return currentState.pressStart();
    }
    public void updateDisplay(DisplayMessage message) {
        message.display();
    }

    @Override
    public void accept(Visitor visitor) {
        for (Visitable flipperElement : flipperElements) {
            flipperElement.accept(visitor);
        }
        visitor.visit(this);
    }
}
