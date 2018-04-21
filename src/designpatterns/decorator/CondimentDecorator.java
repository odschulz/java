package designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage getBeverage() {
        return this.beverage;
    }

    @Override
    public abstract String getDecription();

    public abstract double cost();
}
