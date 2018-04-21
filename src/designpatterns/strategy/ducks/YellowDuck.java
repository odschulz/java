package designpatterns.strategy.ducks;

import designpatterns.strategy.behaviors.RealQuackBeavior;
import designpatterns.strategy.behaviors.SimpleFlyBehavior;

public class YellowDuck extends Duck {
    public YellowDuck() {
        super(new SimpleFlyBehavior(), new RealQuackBeavior());
    }

    @Override
    public String toString() {
        return "Yellow duck";
    }
}
