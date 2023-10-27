package Visitor;

import FlipperElements.BumperAdapter;
import FlipperElements.Flipper;
import FlipperElements.Ramp;
import FlipperElements.ToggleTarget;
import Mediator.RampTargetMediator;

public class BallVisitor implements Visitor{
    @Override
    public void visit(Flipper flipper) {
        flipper.updateDisplay(flipper.displayFactory.createBallMessage(flipper.dashboard.ballAmount));
    }

    @Override
    public void visit(BumperAdapter bumperAdapter) {

    }

    @Override
    public void visit(RampTargetMediator rampTargetMediator) {

    }

    @Override
    public void visit(Ramp ramp) {

    }

    @Override
    public void visit(ToggleTarget toggleTarget) {

    }
}
