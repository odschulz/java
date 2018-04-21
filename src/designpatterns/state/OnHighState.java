package designpatterns.state;

public class OnHighState implements State {
    private static State instance = new OnHighState();
    private OnHighState() {}

    public static State getInstance() {
        return instance;
    }

    @Override
    public void switchState(Switchable context) {
        System.out.println("Switching off.");
        context.setState(OffState.getInstance());
    }
}
