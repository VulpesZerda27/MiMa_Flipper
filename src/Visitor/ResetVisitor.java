package Visitor;

import FlipperElements.Bumper;
import FlipperElements.Flipper;
import FlipperElements.Ramp;
import FlipperElements.ToggleTarget;
import Mediator.RampTargetMediator;

public class ResetVisitor implements Visitor{
    @Override
    public void visit(Flipper flipper) {
        if(flipper.dashboard.ballAmount == 0 && flipper.currentState == flipper.playingState) flipper.currentState = flipper.endState;
        else if (flipper.dashboard.ballAmount == 0 && flipper.currentState == flipper.endState) {
            if (flipper.dashboard.coinAmount > 0) flipper.currentState = flipper.readyState;
            else flipper.currentState = flipper.noCreditState;
        }
    }

    @Override
    public void visit(Bumper bumper) {
        bumper.hits = 0;
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
