package Mediator;

import FlipperElements.*;
import Visitor.Visitor;

import java.util.ArrayList;
import java.util.Random;

public class RampTargetMediator implements ElementMediator, Visitable {
    public final Ramp ramp;
    public final ArrayList<ToggleTarget> targets;
    private Random random = new Random();
    public RampTargetMediator(Ramp ramp, ArrayList<ToggleTarget> targets) {
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

    public void hitRandomTarget(){
        int randomIndex = random.nextInt(targets.size());
        targets.get(randomIndex).hit();
    }

    public void hitRamp() {
        ramp.hit();
    }

    public void reset() {
        ramp.isActive = false;
        for (ToggleTarget target : targets) {
            target.isActive = false;
            target.isHit = false;
        }
    }
}
