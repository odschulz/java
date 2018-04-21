package designpatterns.decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDecription() {
        return this.getBeverage().getDecription() + ", milk";
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + 0.25;
    }
}
