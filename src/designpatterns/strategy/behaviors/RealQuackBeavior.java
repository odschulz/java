package designpatterns.strategy.behaviors;

import designpatterns.strategy.interfaces.QuackBehavior;

public class RealQuackBeavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack and stuff.");
    }
}
