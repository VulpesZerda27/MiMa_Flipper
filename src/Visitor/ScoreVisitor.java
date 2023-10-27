package Visitor;

import FlipperElements.*;
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
        flipper.updateDisplay(flipper.displayFactory.createScoreMessage(flipper.dashboard.score));
    }

    @Override
    public void visit(BumperAdapter bumperAdapter) {
        tempScore += (bumperAdapter.getHits() * 100);
    }

    @Override
    public void visit(RampTargetMediator rampTargetMediator) {
        boolean modifyMultiplier = true;
        for (ToggleTarget target : rampTargetMediator.targets) {
            if(!target.isActive) modifyMultiplier = false;
            else if(target.isHit) tempScore += 150;
            else modifyMultiplier = false;
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
