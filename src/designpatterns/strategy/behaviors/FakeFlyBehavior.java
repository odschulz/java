package designpatterns.strategy.behaviors;

import designpatterns.strategy.interfaces.FlyBehavior;

public class FakeFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
