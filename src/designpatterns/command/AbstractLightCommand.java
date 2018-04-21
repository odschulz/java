package designpatterns.command;

public abstract class AbstractLightCommand implements Command {
    private Light light;

    public AbstractLightCommand(Light light) {
        this.setLight(light);
    }

    public Light getLight() {
        return this.light;
    }

    private void setLight(Light light) {
        this.light = light;
    }

}
