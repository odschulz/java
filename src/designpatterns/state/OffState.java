package designpatterns.state;

public class OffState implements State {
    private static State instance = new OffState();
    private OffState() {}

    public static State getInstance() {
        return instance;
    }

    @Override
    public void switchState(Switchable context) {
        System.out.println("Switching on to low speed.");
        context.setState(OnLowState.getInstance());
    }
}
