package Visitor;

import FlipperElements.*;
import Mediator.RampTargetMediator;

public class ResetVisitor implements Visitor{
    @Override
    public void visit(Flipper flipper) {
        flipper.dashboard.ballAmount -= 1;
        if(flipper.dashboard.ballAmount == 0 && flipper.currentState == flipper.playingState) flipper.currentState = flipper.endState;
        else if (flipper.currentState == flipper.endState) {
            flipper.updateDisplay(flipper.displayFactory.createGameOverMessage());
            if (flipper.dashboard.coinAmount > 0) flipper.currentState = flipper.readyState;
            else flipper.currentState = flipper.noCreditState;
        }
    }

    @Override
    public void visit(BumperAdapter bumperAdapter) {
        bumperAdapter.resetHits();
    }

    @Override
    public void visit(RampTargetMediator rampTargetMediator) {
    }

    @Override
    public void visit(Ramp ramp) {
        ramp.isActive = false;
    }

    @Override
    public void visit(ToggleTarget toggleTarget) {
        toggleTarget.isActive = false;
    }
}
