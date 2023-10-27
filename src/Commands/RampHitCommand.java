package Commands;

import Mediator.RampTargetMediator;

public class RampHitCommand implements Command {
    private final RampTargetMediator rampTargetMediator;

    public RampHitCommand(RampTargetMediator rampTargetMediator) {
        this.rampTargetMediator = rampTargetMediator;
    }

    @Override
    public void execute() {
        rampTargetMediator.hitRamp();
    }
}