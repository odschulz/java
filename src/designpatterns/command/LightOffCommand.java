package designpatterns.command;

public class LightOffCommand extends AbstractLightCommand {
    public LightOffCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        this.getLight().turnOff();
    }
}
