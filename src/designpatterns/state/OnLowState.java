package designpatterns.state;

public class OnLowState implements State {
    private static State instance = new OnLowState();
    private OnLowState() {}

    public static State getInstance() {
        return instance;
    }

    @Override
    public void switchState(Switchable context) {
        System.out.println("Switching on to high speed.");
        context.setState(OnHighState.getInstance());
    }
}
