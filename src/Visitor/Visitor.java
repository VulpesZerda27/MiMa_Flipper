package Visitor;

import FlipperElements.*;
import Mediator.RampTargetMediator;

public interface Visitor {
    void visit (Flipper flipper);
    void visit(BumperAdapter bumperAdapter);
    void visit(RampTargetMediator rampTargetMediator);
    void visit(Ramp ramp);
    void visit(ToggleTarget toggleTarget);
}
