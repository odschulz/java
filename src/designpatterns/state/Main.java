package designpatterns.state;

public class Main {
    public static void main(String[] args) {
        Switchable chain = new FanChain(OffState.getInstance());
        for (int i = 0; i < 3; i++) {
            chain.switchState();
        }
    }
}
