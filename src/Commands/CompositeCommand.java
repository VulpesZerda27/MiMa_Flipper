package Commands;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{
    private List<Command> commands;

    public CompositeCommand() {
        commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void add(Command command) {
        commands.add(command);
    }

    public void remove(Command command) {
        commands.remove(command);
    }
}
