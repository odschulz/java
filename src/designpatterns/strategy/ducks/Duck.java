package designpatterns.strategy.ducks;

import designpatterns.strategy.interfaces.FlyBehavior;
import designpatterns.strategy.interfaces.QuackBehavior;

/**
 * Ultimately, there is no actual need for this class to be
 * abstract and to have many concrete implementations. By having
 * the behaviors as composition and providing them through dependency
 * injections, we can simply build the Duck class according to the
 * specific need.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    private FlyBehavior getFlyBehavior() {
        return this.flyBehavior;
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    private QuackBehavior getQuackBehavior() {
        return this.quackBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        this.getFlyBehavior().fly();
    }

    public void performQuack() {
        this.getQuackBehavior().quack();
    }

    public void swim() {
        System.out.println("All ducks swim");
    }
}
