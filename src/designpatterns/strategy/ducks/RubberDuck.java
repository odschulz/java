package designpatterns.strategy.ducks;

import designpatterns.strategy.behaviors.FakeFlyBehavior;
import designpatterns.strategy.behaviors.SqueekQuakBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FakeFlyBehavior(), new SqueekQuakBehavior());
    }

    @Override
    public String toString() {
        return "Rubber duck";
    }
}
