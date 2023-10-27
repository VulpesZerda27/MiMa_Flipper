package Commands;

import Mediator.RampTargetMediator;

public class RandomTargetHitCommand implements Command {
    private final RampTargetMediator mediator;

    public RandomTargetHitCommand(RampTargetMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.hitRandomTarget();
    }
}
