package Mediator;

import FlipperElements.*;
import Visitor.Visitor;
import java.util.List;

public class RampTargetMediator implements ElementMediator, Visitable {
    public Ramp ramp;
    public List<ToggleTarget> targets;
    public RampTargetMediator(Ramp ramp, List<ToggleTarget> targets) {
        this.ramp = ramp;
        this.targets = targets;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void activeCheck() {
        for (ToggleTarget target : targets) {
            target.isActive = ramp.isActive;
            if(!ramp.isActive) target.isHit = false;
        }
    }

    public void reset() {
        ramp.isActive = false;
        for (ToggleTarget target : targets) {
            target.isActive = false;
            target.isHit = false;
        }
    }
}
