package designpatterns.decorator;

public class Cream extends CondimentDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDecription() {
        return this.getBeverage().getDecription() + ", cream";
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + 0.20;
    }
}
