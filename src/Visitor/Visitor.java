package Visitor;

import FlipperElements.Bumper;
import FlipperElements.Flipper;
import FlipperElements.Ramp;
import FlipperElements.ToggleTarget;
import Mediator.RampTargetMediator;

public interface Visitor {
    void visit (Flipper flipper);
    void visit(Bumper bumper);
    void visit(RampTargetMediator rampTargetMediator);
    void visit(Ramp ramp);
    void visit(ToggleTarget toggleTarget);
}
