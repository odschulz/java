package designpatterns.state;

public class FanChain implements Switchable {
    private State state;

    public FanChain(State state) {
        this.state = state;
    }

    @Override
    public void switchState() {
        this.state.switchState(this);
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}
