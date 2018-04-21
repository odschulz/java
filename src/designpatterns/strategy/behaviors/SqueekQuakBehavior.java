package designpatterns.strategy.behaviors;

import designpatterns.strategy.interfaces.QuackBehavior;

public class SqueekQuakBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeeek.");
    }
}
