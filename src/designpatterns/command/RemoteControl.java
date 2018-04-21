package designpatterns.command;

public class RemoteControl {
    public void executeCommand(Command command) {
        command.execute();
    }
}
