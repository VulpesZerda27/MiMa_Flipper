package Commands;

import Mediator.RampTargetMediator;

public class ActiveCheckCommand implements Command{
    private final RampTargetMediator rampTargetMediator;

    public ActiveCheckCommand(RampTargetMediator rampTargetMediator){
        this.rampTargetMediator = rampTargetMediator;
    }

    public void ActiveCheckCommand() {
        execute();
    }

    @Override
    public void execute() {
        rampTargetMediator.activeCheck();
    }
}
