package designpatterns.strategy.behaviors;

import designpatterns.strategy.interfaces.FlyBehavior;

public class SimpleFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Simply fly");
    }
}
