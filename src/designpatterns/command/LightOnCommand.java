package designpatterns.command;

public class LightOnCommand extends AbstractLightCommand {

    public LightOnCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        this.getLight().turnOn();
    }
}
