package designpatterns.state;

public interface Switchable {
    public void switchState();
    public void setState(State state);
}
