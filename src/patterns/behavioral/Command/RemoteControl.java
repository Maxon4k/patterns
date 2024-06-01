package patterns.behavioral.Command;

import java.util.Stack;

public class RemoteControl {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

    public Command getCommand() {
        return command;
    }

    public Stack<Command> getCommandHistory() {
        return commandHistory;
    }
}