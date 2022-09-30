package Command;

import java.util.HashMap;

public class CashMachine{
    private HashMap<String, AbstractCommand> commands = new HashMap<>();

    public void register(String name, AbstractCommand command) {
        commands.put(name, command);
    }
    public void execute(String commandName) {
        commands.get(commandName).execute();
    }
}
