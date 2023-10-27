package Commands;

import FlipperElements.BumperAdapter;

public class BumperHitCommand implements Command {
    private final BumperAdapter bumperAdapter;

    public BumperHitCommand(BumperAdapter bumperAdapter){
        this.bumperAdapter = bumperAdapter;
    }

    public void BumperHitCommand() {
           execute();
    }

    @Override
    public void execute() {
        bumperAdapter.hit();
    }
}
