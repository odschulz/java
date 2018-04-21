package designpatterns.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lihtOffCommand = new LightOffCommand(light);
        Command lihtOnCommand = new LightOnCommand(light);

        remoteControl.executeCommand(lihtOnCommand);
        remoteControl.executeCommand(lihtOffCommand);
    }
}
