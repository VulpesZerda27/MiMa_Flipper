package Commands;

import java.util.List;

public class CompositeCommand implements Command{
    private List<Command> commands;
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void remove(Command command) {
        commands.remove(command);
    }
}
