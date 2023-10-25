package Visitor;

import FlipperElements.Bumper;
import FlipperElements.Flipper;
import FlipperElements.Ramp;
import FlipperElements.ToggleTarget;
import Mediator.RampTargetMediator;

public class ScoreVisitor implements Visitor{
    private int tempScore;
    private int multiplier;

    public ScoreVisitor(){
        tempScore = 0;
        multiplier = 1;
    }
    @Override
    public void visit(Flipper flipper){
        flipper.dashboard.score += (tempScore * multiplier);
    }

    @Override
    public void visit(Bumper bumper) {
        tempScore += (bumper.hits * 100);
    }

    @Override
    public void visit(RampTargetMediator rampTargetMediator) {
        rampTargetMediator.activeCheck();

        boolean modifyMultiplier = true;
        for (ToggleTarget target : rampTargetMediator.targets) {
            if(!target.isActive || !target.isHit) modifyMultiplier = false;
            else tempScore += 150;
        }

        if(modifyMultiplier) {
            multiplier = 3;
            rampTargetMediator.ramp.isActive = false;
        }
    }

    @Override
    public void visit(Ramp ramp) {

    }

    @Override
    public void visit(ToggleTarget toggleTarget) {

    }
}
